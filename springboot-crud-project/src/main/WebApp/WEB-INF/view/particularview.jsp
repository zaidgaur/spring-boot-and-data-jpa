<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>onestudentview</title>
</head>
<body>
<h1>One Student Record</h1>
<table border="2" width="70%" cellpadding="2">
<tr><th>Id</th><th>Name</th><th>RollNumber</th><th>Course</th><th>Branch</th><th>Marks</th><th>Edit</th><th>Delete</th></tr>
<tr>
<td>${findById.getId()}</td>
<td>${findById.getName() }</td>
<td>${findById.getRollNumber() }</td>
<td>${findById.getCourse() }</td>
<td>${findById.getBranch() }</td>
<td>${findById.getMarksInPercentage() }</td>
<td><a href="/editstudent/${findById.getId() }">Edit</a></td>
<td><a href="/deletestudent/${findById.getId() }">Delete</a></td>
</tr>
</table>
<hr>
<a href="rsp1.jspe">Add New Employee</a>
</body>
</html>