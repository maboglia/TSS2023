<div class="wrapper">
        <header>
            <h1><%= request.getAttribute("title") %></h1>
        </header>
        <main>
            <div class="wrapper">
                <h2>Big version</h2>
                <div class="cell">
				<% Integer[] numeri = (Integer[])request.getAttribute("listaNumeri"); %>
				
				<% for(int i : numeri) { %>
                  		<div><%= i %></div>
				<% } %>

                </div>

                
            </div>
        </main>
        <footer>
            <p><%= request.getAttribute("title") %> grid layout</p>
        </footer>

        <div class="note">Your browser doesn't support CSS Grid. You'll need
            <a href="http://gridbyexample.com/browsers/">a browser that does</a> to use this app.
        </div>
</div>