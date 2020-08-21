<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>부서검색</title>
</head>
<body>
	<form action="./search" method="post">
		<fieldset>
			<legend>부서검색</legend>
			<label for="deptno">부서번호 : </label> <input type="text" name="deptno"
				id="dname" required><br> <input type="submit"
				value="정보검색">
		</fieldset>
	</form>
</body>
</html>