package controller;

import java.io.IOException;

import database.DB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Veicolo;



@WebServlet("/auto") // Url Mapping --> routes (rotte) --> quando chiamo /auto creo un object di tipo auto quando si fa una richiesta sul sito o sulla web app scrivendo /auto nella barra degli indirizzi
public class Auto extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		System.out.println("Mi hanno chiamato via GET: sono auto");
//		// Click tasto dx sul Java Project
//		// Run as --> Run on Server
//		// http://localhost:8080/autosalone --> per raggiungere l'indirizzo richiesto scrivo /auto
//		
//		// Inizializzo il database (Mogh database, quindi non un vero e proprio database)
//			// DB.inizializza();
//				
//				// Qui decido cosa verrà visualizzato nel browser dell'user (es. se il file è un pdf, un jpeg, uno stream, ecc), in questo caso si usa la convenzione per visualizzare come un file html ("text/html")
//				// response.setContentType("text/html");
//				
//				// Altrimenti, per visualizzare dell'html, includiamo una parte di html tramite il metodo .include() sul metodo .getRequestDispatcher() che prende in argomento un file .jsp
//				// Metto insieme più pezzi insieme che alla fine vengono montati tutti insieme per visualizzare, nel loro insieme, tutta la pagina html
//				request.getRequestDispatcher("header.jsp").include(request, response);
//				request.getRequestDispatcher("menu.jsp").include(request, response);
//				
//				// Costruisco una table
//				response.getWriter().append("<table>");
//				
//				for (model.Auto veicolo : DB.auto) {
//					response.getWriter().append("<tr>");
//					// response.getWriter().append("<li>").append(veicolo.toString()).append("</li>");
//					response.getWriter().append("<td>").append(veicolo.getMarca()).append("</td>");
//					response.getWriter().append("<td>").append(veicolo.getModello()).append("</td>");
//					response.getWriter().append("<td>").append("" + veicolo.getPrezzo()).append("</td>");
//					response.getWriter().append("</tr>");
//				}
//				
//				response.getWriter().append("</table>");
//				request.getRequestDispatcher("footer.jsp").include(request, response);
		
		request.setAttribute("listaVeicoli", DB.auto);
		
		request.getRequestDispatcher("table.jsp").forward(request, response);
				
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if(request.getParameter("marca") != null) {
			
		// All'interno dei metodi bisogna sempre inizializzare le variabili assegnando loro un valore (contrariamente a come succede all'inizio delle classi)
		String marca = request.getParameter("marca"); // deve corrispondere al parametro name del form
		String modello = request.getParameter("modello");
		double prezzo = Double.parseDouble(request.getParameter("prezzo")); // converto  stringa in un double (questo perchè i numeri passati in un form vengono automaticamente trasformati in stringhe)
		
		Veicolo v = new model.Auto(marca, modello, prezzo);
		
		DB.addVeicolo(v);
		
		}		
		
		// Stampa tutti i veicoli dopo averne aggiunto uno nuovo
		doGet(request, response);
		
	}
	
	

}
