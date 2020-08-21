<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>삭제 결과</title>
<link rel="stylesheet" type="text/css" href="./css/layout.css">
</head>
<body>
	<div class="input_group">${delete.deptno}번 부서가 삭제되었습니다.</div>
	<br>
	<button name="search" onclick="location.href='http://localhost/dept/'">메인</button>
</body>
</html>