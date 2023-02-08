package model;

/**
 * Questa classe rappresenta un singolo contatto
 * @author teacher
 *
 */
public class Contatto {

	/**
	 * Nome del contatto
	 */
	private String nome;
	private String numero;

	/**
	 * Costruttore del contatto
	 * @param nome primo argomento il nome del contatto
	 * @param numero secondo argomento il numero di telefono
	 */
	public Contatto(String nome, String numero) {
		this.nome = nome;
		this.numero = numero;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	/**
	 * Metodo per stampare info sul contatto
	 * @return Ritorna il contatto in formato string
	 */
	public String toString() {
		return this.nome + " - " + this.numero;
	}
	
	
	
}
