<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<jsp:useBean id="msg"  class="java.lang.String" scope="request"></jsp:useBean>
<body>

	<a  href ="./home">Home</a><a style="float: right;" href="./logout">Logout</a>
	<h4><%=msg %></h4>
	<fieldset align="center">
		<legend>Changepassword</legend>

		<form action="./changepassword" method="post">
			<table align="center">

				<tr>
					<td>New Password</td>
					<td><input name="password" type="password"></td>
				</tr>
				<tr>
					<td>Confirm passsword</td>
					<td><input name="confirmpassword" type="password"></td>
				</tr>
				
				<tr>
				<td></td>
				<td><input type="submit" value="change"></td>
				</tr>


			</table>
		</form>
	</fieldset>
</body>
</html>