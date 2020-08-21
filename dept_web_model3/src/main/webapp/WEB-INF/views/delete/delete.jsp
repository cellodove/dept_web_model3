<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>부서삭제</title>
</head>
<body>
	<div class="input_group">
		<form action="./delete" method="post">
			<fieldset>
				<legend>부서삭제</legend>
				<label for="deptno">부서번호 : </label> <input type="text" name="deptno"
					id="deptno" required><br> <input type="submit"
					value="정보삭제">
			</fieldset>
		</form>
	</div>
</body>
</html>