<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
  <title></title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
	<div class="row">
		<div class="col-12" style="padding-left:30px;">
			<strong>문의게시판</strong>
		</div>
		<div class="col-12"  style="padding-left:30px;">
			<small>WITHICE의 상품 QnA</small>
		</div>
	</div>
	<div class="row" style="font-size: 13px; margin: 10px;" >
		<select name="category" style="margin-right: 10px;">
			<option value="전체" selected="selected">전체</option>
			<option value="상품문의">상품문의</option>
			<option value="배송문의">배송문의</option>
			<option value="교환/반품문의">교환/반품문의</option>
			<option value="기타문의">기타문의</option>
			<option value="공지사항">공지사항</option>
		</select>
		<select name="status">
			<option value="전체" selected="selected">전체글보기</option>
			<option value="답변전">답변전 글보기</option>
			<option value="답변완료">답변완료 글보기</option>
		</select>
	</div>
	<div>
		<table class="table" style="font-size: 13px;">
			<thead>
				<tr>
					<th>NO.</th>
					<th>PRODUCT</th>
					<th>CATEGORY</th>
					<th>SUBJECT</th>
					<th>NAME</th>
					<th>DATE</th>
					<th>VIEW</th>	
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>120</td>
					<td>상품이미지</td>
					<td>배송문의</td>
					<td>주문취소/배송전변경</td>
					<td>원미연</td>
					<td>2019-12-05</td>
					<td>120</td>
				</tr>
			</tbody>
		</table>
		
	</div>
	<div class="row btn float-right" >
		<button type="button" class="btn btn-dark" style="width: 75px;  font-size: 12px; ">쓰기</button>
	</div>
	<div>
	
	<div class="row" style="font-size: 13px; margin: 10px;">
		<select name="date" style="margin-right: 10px;">
			<option value="일주일" selected="selected">일주일</option>
			<option value="한달">한달</option>
			<option value="세달">세달</option>
			<option value="전체">전체</option>
		</select>
		<select name="search" style="margin-right: 10px;">
			<option value="제목" selected="selected">제목</option>
			<option value="내용">내용</option>
			<option value="글쓴이">글쓴이</option>
		</select>
		<div style="margin-right: 10px;"><input type="text" name="searchcontent" /></div>
		<div><button type="button">검색</button></div>
	</div>
</div>

</div>

</body>
</html>
    