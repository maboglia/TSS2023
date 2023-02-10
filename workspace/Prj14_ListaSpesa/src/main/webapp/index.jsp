<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>Lista spesa</h1>

	<form action="compra" method="post">
		<input type="text" name="cosa" placeholder="Scrivi qui cosa comprare">
		<input type="submit" value="Compra">
	</form>

	<ul>
<% ArrayList<String> cose = (ArrayList<String>) request.getAttribute("cose"); %>		

<% for(String c : cose){ %>
	<li>${c}</li>
	
<% } %>
	</ul>
	


</body>
</html>