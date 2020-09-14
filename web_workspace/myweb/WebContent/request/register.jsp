<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>요청 파라미터 조회하기</h1>
	
	<%
		request.setCharacterEncoding("utf-8");	
	
		String name = request.getParameter("username");
		String email = request.getParameter("useremail");
		String password =request.getParameter("userpassword");
		String city = request.getParameter("usercity");
		String sex = request.getParameter("usersex");
		String profile = request.getParameter("userprofile");
		String agreement = request.getParameter("useragreement");
	%>
	
	<h3>회원가입 정보</h3>
	<dl>
		<dt>이름</dt>
		<dt><%=name %></dt>
	</dl>
	<dl>
		<dt>비밀번호</dt>
		<dt><%=password %></dt>
	</dl>
	<dl>
		<dt>이메일</dt>
		<dt><%=email %></dt>
	</dl>
	<dl>
		<dt>거주지</dt>
		<dt><%=city %></dt>
	</dl>
	<dl>
		<dt>성별</dt>
		<dt><%=sex %></dt>
	</dl>
	<dl>
		<dt>자기소개</dt>
		<dt><%=profile %></dt>
	</dl>
	<dl>
		<dt>개인정보 제공 동의</dt>
		<dt><%=agreement %></dt>
	</dl>
</body>
</html>