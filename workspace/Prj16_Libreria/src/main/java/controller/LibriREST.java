package controller;

import java.io.IOException;

import org.json.JSONArray;

import database.DBLibri;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/api")
public class LibriREST extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		JSONArray arrayLibri = new JSONArray(DBLibri.getLibri());
		
		resp.getWriter().append(arrayLibri.toString());
	
	}
	
}
