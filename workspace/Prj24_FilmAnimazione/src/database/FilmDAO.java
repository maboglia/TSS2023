package database;

import java.sql.SQLException;
import java.util.List;

import model.Film;

public interface FilmDAO {

	String NOME_TABELLA = "film_animazione";
	String FIND_ALL = "SELECT * FROM " + NOME_TABELLA;
	
	//CRUD
	void addFilm(Film f) throws SQLException;
	
	Film getFilmById(int id) throws SQLException;
	List<Film> getFilms()  throws SQLException;
	
	void updateFilmById(int id) throws SQLException;
	void deleteFilmById(int id) throws SQLException;
	
	
	
	
}
