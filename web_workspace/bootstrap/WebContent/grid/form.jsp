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
		<div class="col-12">
			<h1>문의 게시판</h1>
		</div>
	</div>
	<div class="row">
		<div class="col-12">
			<form action="" >
				<div class="row">
					<div class="col-12">
						<label class="mr-3">SUBJECT</label>
						<select class="" name="category" >
							<option value="상품문의" selected="selected" style="font-size: 13px; float: left;">상품문의</option>
							<option value="배송문의" style="font-size: 13px;">배송문의</option>
							<option value="교환/반품문의" style="font-size: 13px;">교환/반품문의</option>
							<option value="기타문의" style="font-size: 13px;">기타문의</option>
							<option value="공지사항" style="font-size: 13px;">공지사항</option>
						</select>
					</div>
				</div>
			</form>
			<div class="card">
				<div class="card-header">WITHICE의 상품 QnA</div>
					<div class="card-body">
			  				<label class="mr-3">SUBJECT</label>
			  				<select class="form-control mr-3" name="category" >
								<option value="상품문의" selected="selected" style="font-size: 13px; float: left;">상품문의</option>
								<option value="배송문의" style="font-size: 13px;">배송문의</option>
								<option value="교환/반품문의" style="font-size: 13px;">교환/반품문의</option>
								<option value="기타문의" style="font-size: 13px;">기타문의</option>
								<option value="공지사항" style="font-size: 13px;">공지사항</option>
							</select>
							<select class="form-control mr-3" name="title">
								<option value="상품문의" selected="selected" style="font-size: 13px;">상품문의</option>
								<option value="배송문의" style="font-size: 13px;">배송문의</option>
								<option value="교환/반품문의" style="font-size: 13px;">교환/반품문의</option>
								<option value="주문취소/배송전변경" style="font-size: 13px;">주문취소/배송전변경</option>
								<option value="기타문의" style="font-size: 13px;">기타문의</option>
							</select>
			  				<button type="submit" class="btn btn-outline-primary">조회</button>
					</div>
					<div class="card-body">
						<textarea class="form-control" rows="10"></textarea>
					</div>
			</div>
		</div>
	</div>
	<div class="row">
		<table class="table text-left">
			<tbody>
				<tr>
					<th style="font-size: 13px;">SUBJECT</th>
					<td style="font-size: 13px;">
						<select name="category" class="col-2">
							<option value="상품문의" selected="selected" style="font-size: 13px; float: left;">상품문의</option>
							<option value="배송문의" style="font-size: 13px;">배송문의</option>
							<option value="교환/반품문의" style="font-size: 13px;">교환/반품문의</option>
							<option value="기타문의" style="font-size: 13px;">기타문의</option>
							<option value="공지사항" style="font-size: 13px;">공지사항</option>
						</select>
						<select name="title" class="col-5">
							<option value="상품문의" selected="selected" style="font-size: 13px;">상품문의</option>
							<option value="배송문의" style="font-size: 13px;">배송문의</option>
							<option value="교환/반품문의" style="font-size: 13px;">교환/반품문의</option>
							<option value="주문취소/배송전변경" style="font-size: 13px;">주문취소/배송전변경</option>
							<option value="기타문의" style="font-size: 13px;">기타문의</option>
						</select>
					</td>
				</tr>
		</table>
		<table>
			<tbody>
				<tr>
					<th>
						<textarea rows="20" cols="158"></textarea>
					</th>
				</tr>
			</tbody>
		</table>
		<table>
			<tbody>
				<tr>
					<th class="col-4" style="font-size: 13px;">FILE</th>
					<td class="col-8" style="font-size: 13px;">
						<input type="file">
					</td>
				</tr>
			</tbody>
		</table>
	</div>	
	<hr>
	<div>
		<button class="btn btn-primary" style="background-color: gray; width: 75px; height: 30px">목록</button>
		<button class="btn btn-primary" style="background-color: gray; float: right">취소</button>
		<button class="btn btn-dark" style="float: right; margin-right: 10px">등록</button>
	</div>
	
	
	
	
	



</div>

</body>
</html>
    