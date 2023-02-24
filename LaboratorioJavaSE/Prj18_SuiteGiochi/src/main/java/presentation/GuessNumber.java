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
@WebServlet("/guessnumber")
public class GuessNumber extends HttpServlet {
	
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("header.jsp").include(request, response);
		request.getRequestDispatcher("menu.jsp").include(request, response);
		//request.setAttribute("listaNumeri", ctrl.stampaSeguenza());   
		request.setAttribute("title", "GuessNumber");
		//inclusione della view del gioco
		request.getRequestDispatcher("viewGuessNumber.jsp").include(request, response);
		
		
		request.getRequestDispatcher("footer.jsp").include(request, response);
	}

}
