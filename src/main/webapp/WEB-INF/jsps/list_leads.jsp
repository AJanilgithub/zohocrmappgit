<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>    
<%@ include file="menu.jsp"%>      
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>list leads</title>
</head>
<body>
		<h2>All Leads</h2>
		<table>
			<tr>
				<th>FirstName</th>
				<th>lastName</th>
				<th>Email</th>
				<th>Mobile</th>
				<th>source</th>
			</tr>
			<c:forEach items="${leads}"  var="lead">
					<tr>
					<td><a href="leadInfo?id=${lead.id}">${lead.firstname}</a></td>
					<td>${lead.lastname}</td>
					<td>${lead.email}</td>
					<td>${lead.mobile}</td>
					<td>${lead.source}</td>
				</tr>	
			</c:forEach>
		</table>
</body>
</html>