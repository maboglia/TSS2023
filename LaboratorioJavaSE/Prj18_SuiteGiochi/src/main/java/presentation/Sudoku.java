package presentation;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import controller.SudokuCtrl;

/**
 * Servlet implementation class Sudoku
 */
@WebServlet("/sudoku")
public class Sudoku extends HttpServlet {
	
	SudokuCtrl ctrl = new SudokuCtrl();
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("header.jsp").include(request, response);
		request.getRequestDispatcher("menu.jsp").include(request, response);
		request.setAttribute("title", "Sudoku");        
		request.setAttribute("listaNumeri", ctrl.stampaSeguenza());        
		//inclusione della view del gioco
		request.getRequestDispatcher("viewSudoku.jsp").include(request, response);
		
		
		request.getRequestDispatcher("footer.jsp").include(request, response);
	}

}
