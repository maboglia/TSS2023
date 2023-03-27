package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import DB.Connessione;
import model.Veicolo;

public class VeicoloDAO {

	Connessione miaConn;
	Connection conn;
	
	Statement statement;//una specie di busta per scrivere le istruzioni sql
	ResultSet rs;//contenitore di risultati
	
	public VeicoloDAO() {
		miaConn = new Connessione();
		conn = miaConn.getConn();
	}
	//CRUD : Create
	public void addVeicolo(Veicolo v) throws SQLException {
		statement = this.conn.createStatement();
		String sql = "INSERT INTO veicoli (marca, modello, prezzo) ";
		sql += " values ( '"+v.getMarca()+"', '"+v.getModello()+"',"+v.getPrezzo()+")";
		statement.execute(sql);
		System.out.println("Veicolo inserito " + v);
	}
	
	//CRUD: READ - RETRIEVE
	
	public List<Veicolo> getVeicoli() throws SQLException{
		List<Veicolo> tempList = new ArrayList<>();
		
		statement = this.conn.createStatement();
		
		String sql = "SELECT * from veicoli";
		
		this.rs = statement.executeQuery(sql);
		while(this.rs.next()) {
			//creo un veicolo temp
			Veicolo temp = new Veicolo();
			
			//leggo i valori di ogni record sul db
			int ident = rs.getInt("id");
			String marca = rs.getString("marca");
			String modello = rs.getString("modello");
			double prezzo = rs.getDouble("prezzo");
			
			temp.setId(ident);
			temp.setMarca(marca);
			temp.setModello(modello);
			temp.setPrezzo(prezzo);

			tempList.add(temp);
			
		}
		
		return tempList;
	}
	
	
	//CRUD: READ - RETRIEVE
	
	public Veicolo getVeicoliById(int id) throws SQLException{
		Veicolo temp = new Veicolo();
		statement = this.conn.createStatement();
		
		String sql = "SELECT * from veicoli where id = " + id;
		
		this.rs = statement.executeQuery(sql);
		this.rs.next();
		
		int ident = rs.getInt("id");
		String marca = rs.getString("marca");
		String modello = rs.getString("modello");
		double prezzo = rs.getDouble("prezzo");
		
		temp.setId(ident);
		temp.setMarca(marca);
		temp.setModello(modello);
		temp.setPrezzo(prezzo);

		return temp;
	}
	
	//CRUD: UPDATE
	
	public void updateVeicolo(Veicolo v) {
		
	}
	
	//CRUD: DELETE
	
	public void deleteVeicolo(int id) throws SQLException {
		statement = this.conn.createStatement();
		String sql = "delete from veicoli where id = " + id;
		statement.execute(sql);
	}
	
	
	
	
	
}
