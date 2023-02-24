package presentation;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import controller.SudokuCtrl;
import controller.TrisCtrl;

/**
 * Servlet implementation class Sudoku
 */
@WebServlet("/memory")
public class Memory extends HttpServlet {
	
	TrisCtrl ctrl = new TrisCtrl();
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("header.jsp").include(request, response);
		request.getRequestDispatcher("menu.jsp").include(request, response);
		//request.setAttribute("listaNumeri", ctrl.stampaSeguenza());   
		request.setAttribute("title", "Memory");
		//inclusione della view del gioco
		request.getRequestDispatcher("viewMemory.jsp").include(request, response);
		
		
		request.getRequestDispatcher("footer.jsp").include(request, response);
	}

}
