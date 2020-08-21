<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>부서수정</title>
</head>
<body>
	<form action="./update" method="post">
		<fieldset>
			<legend>부서관리수정</legend>
			<label for="deptno">부서번호 : </label> <input type="text" name="deptno"
				id="deptno" required><br> <label for="dname">부서명
				: </label> <input type="text" name="dname" id="dname" required><br>
			<label for="loc">부서지역 : </label> <input type="text" name="loc"
				id="loc" required><br> <input type="submit"
				value="정보수정">
		</fieldset>
	</form>
</body>
</html>