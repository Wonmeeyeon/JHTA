<%@page import="com.bookstore.util.StringUtil"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.bookstore.util.NumberUtil"%>
<%@page import="com.bookstore.dto.OrderDto"%>
<%@page import="java.util.List"%>
<%@page import="com.bookstore.dao.OrderDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../common/logincheck.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Bookstore</title>
<link rel="stylesheet" type="text/css" href="../css/bookstore.css">
<style type="text/css">
	label {
		font-weight: bold;
	}
	select {
		display: inline-block;
		width: 200px;
		height: 37px;
	}
	button {
		height: 37px;
	}
</style>
</head>
<body>
<div class="wrapper">
	<div class="navi">
		<%
			String position = "order";
		%>
		<%@ include file="../common/navibar.jsp" %>
	</div>
	<div class="header">
		<h1>주문내역</h1>
	</div>
	<div class="body">

		<%
			
			// 세션에서 조회한 회원정보로 그 회원의 주문내역을 조회한다.
			OrderDao orderDao = new OrderDao();
			List<OrderDto> orders = orderDao.getOrderByUserId(loginedUserId);
			
		%>
	
		<div>
			<p><strong><%=loginedUserName %></strong>님, 주문내역을 확인하세요.</p>
			<table class="table">
				<colgroup>
					<col width="10%">
					<col width="*">
					<col width="12%">
					<col width="10%">
					<col width="12%">
					<col width="13%">
				</colgroup>
				<thead>
					<tr>
						<th>주문번호</th>
						<th>제목</th>
						<th>구매가격</th>
						<th>구매수량</th>
						<th>결재금액</th>
						<th>주문날짜</th>
					</tr>
				</thead>
				<tbody>
				<%
					for (OrderDto order : orders) {
				%>
					<tr>
						<td><%=order.getOrderNo() %></td>
						<td><%=order.getBookTitle() %></td>
						<td><%=NumberUtil.numberWithComma(order.getOrderPrice()) %></td>
						<td><%=order.getAmount() %></td>
						<td><%=NumberUtil.numberWithComma(order.getOrderPrice()*order.getAmount()) %></td>
						<td><%=order.getRegisteredDate() %></td>
					</tr>
				<%
					}
				%>
				</tbody>
			</table>
		</div>
	</div>
	<%@ include file="../common/footer.jsp" %>
</div>
</body>
</html>