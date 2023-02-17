<!DOCTYPE html>
<%@page import="java.util.List"%>
<%@page import="model.Libro"%>
<%@page import="java.util.ArrayList"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%@ include file="menu.jsp" %>

	<h1>Libreria con approccio MVC..</h1>

<table id="tabella">
  <tr>
    <th>Titolo</th>
    <th>Autore</th>
    <th>Genere</th>
  </tr>
  
<% List<Libro> libri = (List<Libro>) request.getAttribute("elencoLibri"); %>  
  
<% for (Libro l : libri) { %>  
  <tr>
    <td><%= l.getTitolo() %></td>
    <td><%= l.getAutore() %></td>
    <td><%= l.getGenere() %></td>
  </tr>  
  
<% } %>  
</table>



</body>
</html>