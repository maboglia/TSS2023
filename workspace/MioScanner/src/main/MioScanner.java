package main;

import java.util.Scanner;

public class MioScanner {

	static Scanner input = new Scanner(System.in);
	
	/**
	 * Metodo che ritorna l'intera riga
	 * @param domanda inserire la domanda da fare all'utente
	 * @return la stringa di risposta dell'utente fino a enter
	 */
	public String getRiga(String domanda) {
		System.out.println(domanda);
		return input.nextLine();
	}
	
	/**
	 * Metodo che ritorna LA PRIMA PAROLA
	 * @param domanda inserire la domanda da fare all'utente
	 * @return la stringa di risposta dell'utente (prima parola)
	 */
	public String getParola(String domanda) {
		System.out.println(domanda);
		return input.next();
	}
	
	/**
	 * Metodo che ritorna un intero
	 * @param domanda inserire la domanda da fare all'utente
	 * @return l'intero di risposta dell'utente 
	 */
	public int getIntero(String domanda) {
		System.out.println(domanda);
		return input.nextInt();
	}
	
	/**
	 * Metodo che ritorna un double
	 * @param domanda inserire la domanda da fare all'utente
	 * @return il double di risposta dell'utente 
	 */
	public double getDouble(String domanda) {
		System.out.println(domanda);
		return input.nextDouble();
	}
	
}
