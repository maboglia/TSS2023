package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MiaConnessione {
	
	private final String URL = "jdbc:mysql://localhost:3306/java";
	private final String USER = "root";
	private final String PASS = "";
	
	private Connection conn=null;
	
	
	
	public Connection getConn() {
		if (this.conn == null) {connetti();}
		return conn;
	}



	private void connetti() {
		
		try {
			this.conn = DriverManager.getConnection(URL, USER, PASS);
			System.out.println("Sei connesso");
			
			
		} catch (SQLException e) {

			System.err.println("Non sei connesso " + e.getMessage());
		}
		
	}

}
