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

		if (req.getParameter("sort")!=null) {
			
			switch (req.getParameter("sort")) {
			case "titolo": 
				req.setAttribute("elencoLibri", DBLibri.getLibri().stream().sorted().toList());
				break;
			
			default:
				req.setAttribute("elencoLibri", DBLibri.getLibri().stream().sorted().toList());
				break;
			
			}
			
		} else {
			req.setAttribute("elencoLibri", DBLibri.getLibri());
		}
		
		
		req.getRequestDispatcher("libriMVC.jsp").forward(req, resp);
		
		//resp.getWriter().append(DBLibri.getLibri().toString());
	
	}
	
}
