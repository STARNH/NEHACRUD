<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>register page</title>
</head>
<body>
<form action="registers">
*******REGISTER PAGE*******
<select name="rolename">
<option value="admin">admin</option>
<option value="manager">manager</option>
<option value="user">user</option>
</select>
<br>

Name:<input type="text" name="name"><br>
City:<input type="text" name="city"><br>
Username:<input type="text" name="uname"><br>
Password:<input type="text" name="pass"><br>
<input width="20%" type="submit" value="REGISTER">

</form>
</body>
</html>