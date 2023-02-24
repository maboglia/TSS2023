package presentation;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class Sudoku
 */
@WebServlet("/sudoku")
public class Sudoku extends HttpServlet {
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("header.jsp").include(request, response);
		request.getRequestDispatcher("menu.jsp").include(request, response);
		
		//inclusione della view del gioco
		request.getRequestDispatcher("viewSudoku.jsp").include(request, response);
		
		
		request.getRequestDispatcher("footer.jsp").include(request, response);
	}

}
