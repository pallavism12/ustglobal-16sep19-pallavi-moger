<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<fieldset align:"center">
		<legend>Login</legend>
		<form action="./login" method="post">
			<table>

				<tr>
					<td>ID</td>
					<td><input name="id" type="number"></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input name="password" type="password"></td>
				</tr>
				<tr>
					<td></td>
					<td><input value="login" type="submit"></td>
				</tr>
			</table>
		</form>
	</fieldset>
	<a href="./register">Click here to Register</a>
</body>
</html>