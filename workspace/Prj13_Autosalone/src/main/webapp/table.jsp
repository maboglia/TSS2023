<%@page import="model.Veicolo"%>
<%@page import="java.util.ArrayList"%>
<%@include file="header.jsp" %>
    <%@include file="menu.jsp" %>
        <table>
            <tr>
                <th>Marca</th>
                <th>Modello</th>
                <th>Prezzo</th>
            </tr>
            
<% ArrayList<Veicolo> veicoli = (ArrayList<Veicolo>)request.getAttribute("listaVeicoli"); %> 
<% for(Veicolo v : veicoli) { %>           
            <tr>
                <td><%= v.getMarca() %></td>
                <td><%= v.getModello() %></td>
                <td><%= v.getPrezzo() %></td>
            </tr>
<% } %>
        </table>
        <%@include file="footer.jsp" %>