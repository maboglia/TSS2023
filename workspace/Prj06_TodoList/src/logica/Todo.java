package logica;

/**
 * Questa classe rappresenta un singolo post-it
 * @author teacher
 *
 */
public class Todo {

	/**
	 * Descrizione del todo
	 */
	public String descrizione;
	
	/**
	 * Costruttore del todo
	 * @param desc - Passare una stringa come descrizione del todo
	 */
	public Todo(String desc) {
		descrizione = desc;
	}
	
	public String stampa() {
		return "\n*****************"
				+ "\n* " + descrizione
				+ "\n*****************";
	}
	
}
