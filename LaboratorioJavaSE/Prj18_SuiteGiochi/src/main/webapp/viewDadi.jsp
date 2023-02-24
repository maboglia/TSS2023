<%@page import="controller.LanciaDati"%>
<%
	LanciaDati.play();
 
	int faccia1 = LanciaDati.result1;
	int faccia2 = LanciaDati.result2;
 
	String img1 = "img/f"+ faccia1 +".jpg";
	String img2 = "img/f"+ faccia2 +".jpg";
 
 
%>
 
 
<div id="dadi">
	<img src="<%= img1 %>" alt="">
	<img src="<%= img2 %>" alt="">
 
</div>
 
 
<div id="play">
 
<button onClick="window.location.href=window.location.href">Refresh Page</button>
 
<h2><%= LanciaDati.risultato %></h2>
<h2>Vittorie: <%= LanciaDati.vittorie %></h2>
 
</div>