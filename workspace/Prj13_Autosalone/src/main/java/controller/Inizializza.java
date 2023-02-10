package controller;

import java.io.IOException;

import database.DB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/init")
public class Inizializza extends HttpServlet {

	public Inizializza() {
		// Inizializzo il database (Mogh database, quindi non un vero e proprio database)
				DB.inizializza();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("Database inizializzato");
		
	}
	
	
	
}
