package controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/prova")
public class MiaServlet extends HttpServlet{

	TodoCtrl controller = new TodoCtrl();

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		controller.addTodo("Pane", 1);
		controller.addTodo("Vino", 2);
		controller.addTodo("Dolce", 3);
		
		request.setAttribute("elencoTodo", controller.getLista());
		
		request.getRequestDispatcher("index.jsp").forward(request, response);
		
		
		//response.getWriter().append("funziona!!!!!!!!!!!!!");
	}
	
	
	
	
}
