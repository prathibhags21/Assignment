<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body align="center" bgcolor="lavender">
<h2>Login</h2>
<form action ="login.ams" method="post">
Email    : <input type="text" name="email"><br>
Password : <input type="password" name="password"><br>
<input type="submit" value="login">
<input type="reset" value="cancel">
</form>
<h3>${msg}</h3>
</body>
</html>