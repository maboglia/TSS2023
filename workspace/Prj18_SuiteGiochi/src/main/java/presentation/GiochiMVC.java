package presentation;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/")
public class GiochiMVC extends HttpServlet {

	private int counterVisite = 0;
	
	public GiochiMVC() {
		System.out.println("Tomcat ha creato un oggetto di tipo GIOCHIMVC");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		req.setAttribute("titolo", "Giochi");
		
		req.getRequestDispatcher("header.jsp").include(req, resp);;
		req.getRequestDispatcher("menu.jsp").include(req, resp);;
		if (req.getParameter("gioco")!=null) {

			switch (req.getParameter("gioco")) {
			case "1":
				
				break;

			default:
				resp.getWriter().append("<h2>" + "Gioco non ancora disponibile " + "</h2>");
				break;
			}
			
			
		}
		req.getRequestDispatcher("footer.jsp").include(req, resp);;
	
	}
}
