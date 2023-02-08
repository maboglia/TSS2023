package controller;

import java.awt.image.DataBuffer;
import java.io.IOException;

import database.DB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Veicolo;

// facendo cosi la classe Veicoli diventa una Servlet e ne eredita i metodi.


@WebServlet("/veicoli") // serve a creare un oggetto di tipo veicoli quando andiamo a fare una richiesta sul sito inserendo /veicoli. 
public class Veicoli extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println("Mi hanno chiamato via get");
		DB.inizializza();
		
		// con metodo include, viene bypassato e va a richiamare il file header.jsp
		request.getRequestDispatcher("header.jsp").include(request, response);
		request.getRequestDispatcher("menu.jsp").include(request, response);
		//response.setContentType("text/html");
		response.getWriter().append("<table>");
		
		for (Veicolo veicolo : DB.veicoli) 
		{     // 
			response.getWriter().append("<tr>");
			response.getWriter().append("<td>").append(veicolo.getMarca()).append("</td>");
			response.getWriter().append("<td>").append(veicolo.getModello()).append("</td>");
			response.getWriter().append("<td>").append("" + veicolo.getPrezzo()).append("</td>");
			response.getWriter().append("</tr>");
		}
		response.getWriter().append("</table>");
		request.getRequestDispatcher("footer.jsp").include(request, response);
	}
	
	
	
	
	
	

}
