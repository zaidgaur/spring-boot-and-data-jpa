<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="jakarta.tags.core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Records</title>
</head>
<body>
<h1>All Students Records</h1>
<table border="2" width="70%" cellpadding="2">
<tr><th>Id</th><th>Name</th><th>RollNumber</th><th>Course</th><th>Branch</th><th>marks</th><th>Edit</th><th>Delete</th></tr>
<c:forEach var="st" items="${ all}">
<tr>
<td>${st.getId() }</td>
<td>${st.getName() }</td>
<td>${st.getRollNumber() }</td>
<td>${st.getCourse() }</td>
<td>${st.getBranch() }</td>
<td>${st.getMarksInPercentage() }</td>
<td><a href="editstudent/${st.getId() }">Edit</a></td>
<td><a href="deletestudent/${st.getId() }">Delete</a></td>
</tr>

</c:forEach>
</table>
<hr>
<a href="rsp1.jsp">Add New Employe</a>
</table>
</html>