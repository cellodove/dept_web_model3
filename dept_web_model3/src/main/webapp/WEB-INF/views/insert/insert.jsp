<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>부서관리</title>
</head>
<body>
	<div class="input_group">
		<form action="./insert" method="post">
			<fieldset>
				<legend>부서관리</legend>
				<label for="deptno">부서번호 : </label> <input type="text" name="deptno"
					id="deptno" required><br> <label for="dname">부서명
					: </label> <input type="text" name="dname" id="dname" required><br>
				<label for="loc">부서지역 : </label> <input type="text" name="loc"
					id="loc" required><br> <input type="submit"
					value="정보입력">
			</fieldset>
		</form>
	</div>
</body>
</html>