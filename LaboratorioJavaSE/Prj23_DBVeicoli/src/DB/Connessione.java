package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connessione {

	
	private final String URL = "jdbc:mysql://localhost:3306/java2023";
	private final String USER = "app_java";
	private final String PASS = "Java_2023!";
	
	private Connection conn;
	
	public Connection getConn() {
		
		if (this.conn == null) {
			connetti();
		}
		
		return conn;
	}
	
	private void connetti() {
		
		try {
			this.conn = DriverManager.getConnection(URL, USER, PASS);
			System.out.println("Sei connesso al DB");
		} catch (SQLException e) {
			System.err.println("NON sei connesso al DB");
			System.err.println("Si è verificato un errore: " + e.getMessage());
		}
		
	}
	
	
	
	
}
