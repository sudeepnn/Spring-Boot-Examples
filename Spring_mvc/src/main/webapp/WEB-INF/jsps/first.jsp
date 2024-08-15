<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>home page</title>
<style type="text/css">
.cen, form {
	display: flex;
	justify-content: center;
	align-items: center;
	flex-direction: column;
}
</style>
</head>
<body>
<h2 style="color: red">${errmsg}</h2>
	<div class="cen">
		<h1>LogIn Form</h1>
		<hr>
		<form method="post" action="hi">
			<input type="text" name="t1"> 
			<input type="password"	name="t2"> 
			<input type="submit" value="Login"> <br>
		</form>
	</div>

</body>
</html>