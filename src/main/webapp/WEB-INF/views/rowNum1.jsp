<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:forEach var = "result" items = "${results}">
		<table>
			<td>
				<tr>${result.rowNum}   </tr>
			<td>
			<td></td>
			<td>
				<tr>${result.name}   </tr><tr></tr>
			</td>
			<td></td>
			<td>
				<tr>${result.age}   </tr><tr></tr>
			</td>
		</table>
	</c:forEach>
</body>
</html>