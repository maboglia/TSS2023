package controller;

import java.io.IOException;

import org.apache.catalina.connector.Response;

import database.DBMaschere;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Maschera;

@WebServlet("/coriandoli")
public class Coriandoli extends HttpServlet
{
	
	DBMaschere db;
	
	public Coriandoli()
	{
		this.db = new DBMaschere();
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		request.setAttribute("titolo", "Coriandoli");
		request.setAttribute("maschere", this.db.getTabellaMaschere()); // impostiamo la chiave in questo caso maschere, il valore gli diamo l'array di maschere.
		
//		response.getWriter().append("Coriandoli");
		request.getRequestDispatcher("header.jsp").include(request, response);
		request.getRequestDispatcher("menu.jsp").include(request, response);
		request.getRequestDispatcher("listaMaschere.jsp").include(request, response);
		request.getRequestDispatcher("footer.jsp").include(request, response);
		
		
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		if(request.getParameter("nomeMaschera") != null )
		{
			String nomeMaschera = request.getParameter("nomeMaschera");
			
			Maschera m;
			
			
			if(request.getParameter("fotoMaschera") != null)
			{
				m = new Maschera(nomeMaschera, request.getParameter("fotoMaschera"));
			}else
			{
				m = new Maschera(nomeMaschera);
			}
			
			this.db.add(m);
		}
		
		doGet(request, response);
		
	}
	
	
	
}
