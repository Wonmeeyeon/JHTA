<%@page import="com.simple.vo.User"%>
<%@page import="com.simple.dao.UserDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
	
	String id = request.getParameter("id");
	String password = request.getParameter("pwd");
	
	UserDao userDao = new UserDao();
	User user = userDao.getUserbyId(id);
	
	if( user == null ){
		response.sendRedirect("loginform.jsp?error=fail");
		return;
	}
	
	if (!user.getPassword().equals(password)) {
		response.sendRedirect("loginform.jsp?error=fail");
		return;
	}
	
	session.setAttribute("LOGINED_USER_ID", id);
	session.setAttribute("LOGINED_USER_NAME", user.getName());
	session.setAttribute("LOGINED_YN", "Y");
	
	response.sendRedirect("../home.jsp");
	
	
	
%>