<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>create</title>
</head>
<body>
		<h2>New Lead</h2>
		<form action="saveLead" method="post"> 
		  <pre>	
			First Name<input type="text" name="firstname"/>
			Last Name<input type="text" name="lastname"/>
			Email<input type="text" name="email"/>
			Mobile<input type="text" name="mobile"/>
			source:
			<select name="source">
			  <option value="news paper">news paper</option>
			  <option value="online">online</option>
			  <option value="webinar">webinar</option>
			  <option value="radio">radio</option>
			</select>
		   	  <input type="submit" value="save"/>
		  </pre>
		</form>
</body>
</html>     