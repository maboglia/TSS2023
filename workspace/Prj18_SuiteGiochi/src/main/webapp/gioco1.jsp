<%@page import="controller.LanciaDadi"%>
<%
	LanciaDadi.play();
	
	int faccia1 = LanciaDadi.result1;
	int faccia2 = LanciaDadi.result2;
	
	String img1 = "img/f"+faccia1+".jpg";
	String img2 = "img/f"+faccia2+".jpg";
%>


<div id="dadi">

	<img alt="" src='<%= img1 %>' >
	<img alt="" src='<%= img2 %>' >

</div>


<div id="play">

	<button onclick="ricarica()">Play</button>
<h2><%= LanciaDadi.risultato %></h2>
<h2>Vittorie: <%= LanciaDadi.vittorie %></h2>
</div>

<script type="text/javascript">
	function ricarica(){
		location.href="?gioco=1"
	}
</script>