<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>welcome page</title>
</head>
<body>
<h1>Add Student Data</h1>
<form action="save">
<table>
<tr>
<td>Name:</td>
<td><input type=text name=name></td>
</tr>
<tr>
<td>RollNumber:</td>
<td><input type=text name=rollNumber></td>
</tr>
<tr>
<td>Course:</td>
<td><input type=text name=course></td>
</tr>
<tr>
<td>branch:</td>
<td><input type=text name=branch></td>
</tr>
<tr>
<td>marks:</td>
<td><input type=text name=marksInPercentage></td>
</tr>
<tr>
<td></td>
<td><button type=submit>submit</button></td>
</tr>
<tr>
<td><a href="viewall">View Student Detail</a></td>
</tr>

</table>

</form>

</body>
</html>