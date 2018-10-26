<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="u"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>success page</title>
<script type="text/javascript">
function add()
{
	document.success.action=("add");
	document.success.submit();
}
function edit()
{
	document.success.action=("edit");
	document.success.submit();
}
function del()
{
	document.success.action=("del");
	document.success.submit();
}
function closeWin() 
{
	document.success.action=("cls");
	document.success.submit();
    
}

</script>
</head>
<body>
<form name="success">
<h4 align="center">
<br>
****************WELCOME TO SUCCESS PAGE*****************
<br>
<br>
<table style="width: 100%" border="10">
<tr>
<th>Id</th>
<th>Name:</th>
<th>City:</th>
<th>Username:</th>
<th>Password:</th>
</tr>
<tr>
<u:forEach items="${data}" var="s">
<td><input type="radio" name="uid" value="${s.uid}"></td>
<td>${s.name}</td>
<td>${s.city}</td>
<td>${s.login.uname}</td>
<td>${s.login.pass}</td>
</tr>
</u:forEach>
<tr>
<td colspan="2"><input type="submit" value="ADD"    onclick="add()" style="width: 40%"></td>
<td colspan="2"><input type="submit" value="EDIT"   onclick="edit()" style="width: 40%"></td>
<td colspan="2"><input type="submit" value="DELETE" onclick="del()" style="width: 40%"></td>
</tr>

<tr><td colspan="5"><input type="submit" value="EXIT" onclick="closeWin()" style="width: 100%"></td></tr>
</table>
</h4>
</form>
</body>
</html>