package com.simple.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.simple.service.UserService;
import com.simple.vo.User;

import kr.co.jhta.mvc.annotation.Controller;
import kr.co.jhta.mvc.annotation.RequestMapping;
import kr.co.jhta.mvc.servlet.ModelAndView;
import kr.co.jhta.mvc.view.JSONView;

@Controller
public class UserController {
	
	private JSONView jsonView = new JSONView();
	private UserService userService = new UserService();
	
	@RequestMapping("/register.hta")
	public ModelAndView registerUser(HttpServletRequest req, HttpServletResponse res)
	throws Exception { 
		String id = req.getParameter("id");
		String name = req.getParameter("name");
		String pwd = req.getParameter("pwd");
		String email = req.getParameter("email");
		
		User user = new User();
		user.setId(id);
		user.setName(name);
		user.setEmail(email);
		user.setPassword(pwd);
		
		boolean isSuccess = userService.addNewUser(user);
		
		ModelAndView mav = new ModelAndView();
		mav.addAttribute("result", isSuccess);
		mav.setView(jsonView);	// 클라이언트에 jsonText 응답을 제공
		// {"result":true} 혹은 {"result":false} JSON 텍스트가 응답으로 제공된다.
		
		return mav;
	
	}
	
	@RequestMapping("/login.hta")
	public ModelAndView login(HttpServletRequest req, HttpServletResponse res) throws Exception {
		String id = req.getParameter("id");
		String pwd = req.getParameter("pwd");
		
		ModelAndView mav = new ModelAndView();
		mav.setView(jsonView);
		
		User user = userService.loginCheck(id, pwd);
		if (user == null) {
			mav.addAttribute("result", false);
		} else {
			mav.addAttribute("result", true);
			HttpSession session = req.getSession();
			session.setAttribute("loginUser", user);
		}
		
		return mav;
	}
	
	@RequestMapping("/logout.hta") 
	public ModelAndView logout(HttpServletRequest req, HttpServletResponse res) throws Exception {
		HttpSession session = req.getSession(false);
		if (session != null) {
			session.invalidate();
		}
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("redirect:/home.hta");
		
		return mav;
		
	}
}











