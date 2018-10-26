<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>edit page</title>
</head>
<body>
<form action="update">
<h3 align="center">
**********EDIT PAGE *****************
<br>
ID:     <input type="hidden" name="uid" value="${data.uid}">
Name:    <input type="text" name="name" value="${data.name}" ><br>
City:    <input type="text" name="city" value="${data.city}"><br>
Username:<input type="text" name="uname" value="${data.login.uname}"><br>
Passsword:<input type="text" name="pass" value="${data.login.pass}"><br>
<input type="submit" value="UPDATE">

</h3>
</form>
</body>
</html>