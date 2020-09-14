<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	String logined= (String) session.getAttribute("LOGINED_YN");
    %>
<div id="navibar">
	<ul>
		<li><a href="/simple_board/home.jsp">홈</a></li>
		<li><a href="/simple_board/board/list.jsp">게시판</a></li>
		<li><a href="/simple_board/user/my.jsp">내정보</a></li>
	<%
		if("Y".equals(logined)) {
	%>
		<li class="right"><a href="/simple_board/user/logout.jsp">로그아웃</a></li>
	<%
		} else {
	%>
		<li class="right"><a href="/simple_board/user/loginform.jsp">로그인</a></li>
		<li class="right"><a href="/simple_board/user/form.jsp">회원가입</a></li>
	<%
		}
	%>
	</ul>
	<%
		if("Y".equals(logined)) {
			String userName=(String)session.getAttribute("LOGINED_USER_NAME");
	%>
		<p><%=userName %>님 환영합니다.</p>
	<%
		}
	%>
</div>