package controller;

import java.io.IOException;

import database.DBLibri;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/mvc")
public class LibriMVC extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		if (req.getParameter("ordina")!=null) {
			
			switch (req.getParameter("ordina")) {
				case "titolo": 
					req.setAttribute("elencoLibri", DBLibri.getLibri().stream().sorted().toList());
					break;
				case "genere": 
					req.setAttribute("elencoLibri", DBLibri.getLibri().stream().sorted((l1, l2)->l1.getGenere().compareTo(l2.getGenere())).toList());
					break;
				case "autore": 
					req.setAttribute("elencoLibri", DBLibri.getLibri().stream().sorted((l1, l2)-> l1.getAutore().compareTo(l2.getAutore())).toList());
					break;
				
				default:
					req.setAttribute("elencoLibri", DBLibri.getLibri().stream().limit(20).sorted().toList());
					break;
			
			}
			
		} else {
			req.setAttribute("elencoLibri", DBLibri.getLibri());
		}
		
		//chiamo la pagina jsp passando richiesta e risposta
		req.getRequestDispatcher("libriMVC.jsp").forward(req, resp);
		
		//resp.getWriter().append(DBLibri.getLibri().toString());
	
	}
	
}
