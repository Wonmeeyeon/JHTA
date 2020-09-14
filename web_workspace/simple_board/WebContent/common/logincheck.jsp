<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String loginedUserId = (String) session.getAttribute("LOGINED_USER_ID");
	String loginedUserName = (String) session.getAttribute("LOGINED_USER_NAME");
	String loginedYn = (String) session.getAttribute("LOGINED_YN");

	if (!"Y".equals(loginedYn)) {
		response.sendRedirect("/simple_board/user/loginform.jsp?error=deny");
		return;
	}
%>