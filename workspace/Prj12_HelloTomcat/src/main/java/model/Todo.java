package model;

import java.time.LocalDateTime;

/**
 * Questa classe rappresenta un singolo post-it
 * @author teacher
 *
 */
public class Todo {

	static int counter = 1;
	
	/**
	 * Descrizione del todo
	 */
	public String descrizione;
	public LocalDateTime data;
	public int id;
	public double prezzo;
	
	
	/**
	 * Costruttore del todo
	 * @param desc - Passare una stringa come descrizione del todo
	 */
	public Todo(String descrizione, double prezzo) {
		this.descrizione = descrizione;
		this.data = LocalDateTime.now();
		this.id = counter++;
		this.prezzo = prezzo;
	}
	
	
	
	@Override
	public String toString() {
		return "\n*****************"
				+ "\n* " + this.data
				+ "\n* " + this.id
				+ "\n* " + this.descrizione.toUpperCase()
				+ "\n* " + this.prezzo
				+ "\n*****************";
	}
	
}
