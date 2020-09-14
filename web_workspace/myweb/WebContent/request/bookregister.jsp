<%@page import="com.sample.dao.BookDao"%>
<%@page import="com.sample.vo.Book"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		request.setCharacterEncoding("utf-8");
		
		String title = request.getParameter("title");
		String writer = request.getParameter("writer");
		String genre = request.getParameter("genre");
		String publisher = request.getParameter("publisher");
		int price = Integer.parseInt(request.getParameter("price"));
		int discountPrice = Integer.parseInt(request.getParameter("discountPrice"));
		int stock =Integer.parseInt(request.getParameter("stock"));
	
		
		Book book = new Book();
		book.setTitle(title);
		book.setWriter(writer);
		book.setGenre(genre);
		book.setPublisher(publisher);
		book.setPrice(price);
		book.setDiscountPrice(discountPrice);
		book.setStock(stock);
		
		BookDao bookDao = new BookDao();
		bookDao.insertBook(book);
	
	
	%>
	<h1> 책등록 완료</h1>
	<p> 새로운 책이 등록되었습니다.</p>
	<h1>책 정보 조회하기</h1>
	<dl>
		<dt>제목</dt>
		<dt><%=title %></dt>
	</dl>
	<dl>
		<dt>저자</dt>
		<dt><%=writer %></dt>
	</dl>
	<dl>
		<dt>장르</dt>
		<dt><%=genre %></dt>
	</dl>
	<dl>
		<dt>출판사</dt>
		<dt><%=publisher %></dt>
	</dl>
	<dl>
		<dt>가격</dt>
		<dt><%=price %></dt>
	</dl>
	<dl>
		<dt>할인가격</dt>
		<dt><%=discountPrice %></dt>
	</dl>
	<dl>
		<dt>입고수량</dt>
		<dt><%=stock %></dt>
	</dl>
</body>
</html>