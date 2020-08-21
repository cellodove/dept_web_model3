<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>목록</title>
<link rel="stylesheet" type="text/css" href="./css/layout.css">
</head>
<body>
	<div class="input_group">
		<table>
			<tr>
				<th>번호</th>
				<th>부서</th>
				<th>지역</th>
			</tr>
			<c:forEach var="list" items="${list}">
				<tr>
					<td>${list.deptno}</td>
					<td>${list.dname}</td>
					<td>${list.loc}</td>
				</tr>
			</c:forEach>
		</table>
		<button name="search" onclick="location.href='http://localhost/dept/'">메인</button>
	</div>
</body>
</html>