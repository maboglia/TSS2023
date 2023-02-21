<%@page import="model.Maschera"%>
<%@page import="java.util.ArrayList"%>
<div id="gallery">

<% ArrayList<Maschera> elenco = (ArrayList<Maschera>)request.getAttribute("maschere"); %>
<% for(Maschera m : elenco){ %>

<div class="immagine"> <img alt="<%= m.getNome() %>" src="<%= m.getFoto() %>">  <p> <a href="https://www.google.com/search?q=maschera+<%= m.getNome() %>" target="_blank"><%= m.getNome() %></a> </p>  </div>



<% } %>

</div>
