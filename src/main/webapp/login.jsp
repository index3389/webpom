<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>list</title>
</head>
<body>
<table align="center" border="1" width="60%">
	<c:forEach var="u" items="${list }">
		<tr>
			<td>${u.id}</td>
			<td>${u.name}</td>
			<td>${u.nick}</td>
		</tr>
	</c:forEach>	
</table>
</body>
</html>