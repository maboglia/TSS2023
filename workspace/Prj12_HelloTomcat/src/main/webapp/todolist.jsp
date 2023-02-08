<%@page import="java.util.ArrayList"%>
<%@page import="model.Todo"%>
<%@page import="controller.TodoCtrl"%>

<% ArrayList<Todo> lista = (ArrayList<Todo>) request.getAttribute("elencoTodo"); %>



<ul>

<% for(Todo t: lista){ %>

	<li><%= t.descrizione %></li>

<% } %>

</ul>
