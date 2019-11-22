<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page session="false" %>
    
<!DOCTYPE html>
<html>
<head>

<%
String id="";
Cookie[] cookies=request.getCookies();
if(cookies!=null) {
	for( Cookie  cookie :cookies) {
		if(cookie.getName().equals("alwaysRemember")) {
			id=cookie.getValue();
		}
	}
}
%>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<jsp:useBean id="msg" class="java.lang.String" scope="request"></jsp:useBean>
<body>
<h4><%=msg %></h4>


<fieldset align='center'>
		<legend>Login</legend>
		<form action='./login' method='post'>

			<table align='center'>

				<tr>
					<td>Id</td>
					<td><input name='id' type='number' value='<%=id%>'></td>
				</tr>


				<tr>
					<td>Password</td>
					<td><input name='password' type='password'>
					<td></td>
				</tr>
				
				<tr>
					<td></td>
					<td><input type='checkbox' name='rememberme' value='checked'>Remember Me</td>
					
					<input type='submit' value='login'>
				</tr>




			</table>
		</form>
		
	</fieldset>
<a href='register.html'>Register</a>
</body>

</html>