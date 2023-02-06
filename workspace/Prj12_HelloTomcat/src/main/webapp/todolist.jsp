<%@page import="model.Todo"%>
<%@page import="controller.TodoCtrl"%>

<% TodoCtrl controller = new TodoCtrl(); %>

<% controller.addTodo("caffé", 1); %>
<% controller.addTodo("brioche", 1.5); %>
<% controller.addTodo("spremuta", 2); %>
<% controller.addTodo("toast", 2.5); %>

<ul>

<% for(Todo t: controller.getLista()){ %>

	<li><%= t.descrizione %></li>

<% } %>

</ul>
