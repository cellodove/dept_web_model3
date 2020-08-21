<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>검색 결과</title>
<link rel="stylesheet" type="text/css" href="./css/layout.css">
</head>
<body>
</body>
<div class="input_group">
	<table>
		<tr>
			<th>번호</th>
			<th>부서</th>
			<th>지역</th>
		</tr>
		<tr>
			<td>${search.deptno}</td>
			<td>${search.dname}</td>
			<td>${search.loc}</td>
		</tr>
	</table>
</div>
<div class="input_group">
	<br>
	<button name="search" onclick="location.href='http://localhost/dept/'">메인</button>
</div>
</html>