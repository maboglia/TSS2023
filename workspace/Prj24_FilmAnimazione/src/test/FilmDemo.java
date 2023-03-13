package test;

import java.sql.SQLException;
import java.util.List;

import controller.FilmController;
import database.FilmDAO;
import database.FilmDAOImpl;
import model.Film;

public class FilmDemo {

	public static void main(String[] args) {


		FilmController c = new FilmController("files/film-animazione.txt");
		FilmDAO dao = new FilmDAOImpl();
		
		
		//List<Film> leggiFileInList = c.leggiFileInList();
		
		StringBuilder sb = new StringBuilder("<ul>");
		
		try {
			dao.getFilms()
				.stream()
				.filter(f -> f.getRating() > 7.9)
				.forEach(f -> sb.append("<li>"+f.getTitolo()+"</li>"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		sb.append("</ul>");
		
		System.out.println(sb.toString());
		
		
//		for (Film film : leggiFileInList) {
//			System.out.println(film);
//			try {
//				dao.addFilm(film);
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}

	}

}
