<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Test per ajax</h1>

<%= session.getAttribute("segreto") %>

<div id="result"></div>

<button id="btn">Cliccami</button>


<script>

	const BTN = document.getElementById('btn');
	const RESULT = document.getElementById('result');
    const URL = 'risponditore';

    BTN.onclick = function(){
    	 fetch(URL)
        .then(testo => testo.text())
        .then(testo => {
            console.log(testo);
            RESULT.innerHTML += testo;
    	})

    }
    
   



</script>

</body>
</html>