<%@page import="com.simple.dao.UserDao"%>
<%@page import="com.simple.vo.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

	request.setCharacterEncoding("utf-8");

	String id = request.getParameter("id");
	String name = request.getParameter("name");
	String password = request.getParameter("pwd");
	String email = request.getParameter("email");
	
	User user = new User();
	user.setId(id);
	user.setName(name);
	user.setPassword(password);
	user.setEmail(email);
	
	UserDao userDao =new UserDao();
	
	User savedUser = userDao.getUserbyId(id);
	if (savedUser != null) {
		response.sendRedirect("form.jsp?error=dup");
		return;
	}
	
	userDao.insertUser(user);
	
	response.sendRedirect("../home.jsp");
%>