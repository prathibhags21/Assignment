<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Assignment Management</title>
</head>
<body>

<h2 allign="center">Admin SignUp</h2>
<form action="Signup.ams" method="post">

First Name   : <input type="text" name="fName" placeholder="Firstname" required><br><br>
Last Name    : <input type="text" name="lName" placeholder="Lastname" required><br><br>
Email 		 : <input type="text" name="email" placeholder="Email id" required><br><br>
Contact No   : <select name="cCode" required>
               <option value=""></option>
               <option value="+91">+91</option>
               <option value="+72">+72</option>
               <option value="+68">+68</option>
               <option value="+96">+96</option>
               <option value="+92">+92</option></select>
               <input type="text" name="contactNo" placeholder="contact No" required><br><br>
<input type="submit" value="Sumbit">
<input type="reset" value="cancel">
</form>
</body>
</html>