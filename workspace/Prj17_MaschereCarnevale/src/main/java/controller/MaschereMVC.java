package controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/maschere")
public class MaschereMVC extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		// 1) rispondo direttamente.
//		response.getWriter().append("<h1>Funziona</h1>");
		
		// 2) redirect.
//		response.sendRedirect("coriandoli");
		
		// 3) smisto la richiesta, cosi mascheriamo le rotte.
//		request.getRequestDispatcher("coriandoli").forward(request, response);
		request.setAttribute("titolo", "Maschere");

		request.getRequestDispatcher("header.jsp").include(request, response);
		request.getRequestDispatcher("menu.jsp").include(request, response);
		request.getRequestDispatcher("form.jsp").include(request, response);
		request.getRequestDispatcher("footer.jsp").include(request, response);
				
	}
	
	
}
