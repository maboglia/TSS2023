package database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Film;

public class FilmDAOImpl implements FilmDAO {

	MiaConnessione mc = new MiaConnessione();
	Connection conn = mc.getConn();
	Statement statement = null;
	ResultSet rs = null;
	
	@Override
	public void addFilm(Film f) throws SQLException {

		statement = conn.createStatement();
		String sql = "INSERT INTO " + NOME_TABELLA + " (titolo, anno, rating) ";
		sql += " values( '"+ f.getTitolo()+ "', "+ f.getAnno()+", "+f.getRating()+" )";
		statement.execute(sql);
		

	}

	@Override
	public Film getFilmById(int id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Film> getFilms() throws SQLException {
		List<Film> temp = new ArrayList<>();		
		statement = conn.createStatement();
		this.rs = statement.executeQuery(FIND_ALL);
		while(rs.next()) {
			Film f = new Film();//creo un film per ogni record
			f.setId(rs.getInt("id"));//metti il valore di id che leggi nel db
			f.setTitolo(rs.getString("titolo"));//metti il valore di titolo che leggi nel db
			f.setAnno(rs.getInt("anno"));//metti il valore di anno che leggi nel db
			f.setRating(rs.getDouble("rating"));//metti il valore di rating che leggi nel db
			
			temp.add(f);//aggiungo il film alla lista
		}
		return temp;//ritorno la lista piena
	}

	@Override
	public void updateFilmById(int id) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteFilmById(int id) throws SQLException {
		// TODO Auto-generated method stub

	}

}
