package model;

public class Dado {

	private int facce = 6;
	private String colore = "bianco";
	
	public int lancio() {
		
		int casuale = 0;

		//calcolare un valore intero casuale 
		//compreso tra 1 e 6
		
		casuale = (int)(Math.random() * facce) + 1;
		
		return casuale;
	}
}
