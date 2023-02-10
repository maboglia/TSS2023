<%@include file="header.jsp" %>
<%@include file="menu.jsp" %>
<form action="veicoli" method="post">

    <input type="text" name="marca" placeholder="marca"><br>
    <input type="text" name="modello" placeholder="modello"><br>
    <input type="number" name="prezzo" placeholder="prezzo"><br>

    <input type="submit" value="Add">

</form>
<%@include file="footer.jsp" %>