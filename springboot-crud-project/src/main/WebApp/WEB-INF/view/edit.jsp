<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>edit page</title>
</head>
<body>
<h1>Edit Employee Details</h1>
<form action="/update">
<table>
<tr>
<td></td> 
<td><input type="hidden" name="id" value="${student.getId() }"/></td>
</tr>

<tr>
<td>Name:</td> 
<td><input type="text" name="name" value="${student.getName() }"/></td>
</tr>


<tr>
<td>RollNumber:</td> 
<td><input type="text" name="rollNumber" value="${student.getRollNumber() }"/></td>
</tr>


<tr>
<td>Course:</td> 
<td><input type="text" name="course" value="${student.getCourse() }"/></td>
</tr>

<tr>
<td>Branch:</td> 
<td><input type="text" name="branch" value="${student.getBranch() }"/></td>
</tr>

<tr>
<td>Marks:</td> 
<td><input type="text" name="marksInPercentage" value="${student.getMarksInPercentage() }"/></td>
</tr>

<tr>
<td></td>
<td><input type="submit" value="Edit&Save"></td>
</tr>

</table>
</form>
</body>
</html>