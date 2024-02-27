<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>rsp3.jsp</title>
</head>
<body>
<c:forEach var="dto" items="${userlist }">
 <h1>${dto.getUserName()}</h1>
</c:forEach>
</body>
</html>