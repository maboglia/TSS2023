package model;

public class CartaDaGioco {

	String seme;
	int valore;
	
	String stampaCarta() {
		return "Il valore di questa carta è: " + valore + " e il seme: "+ seme;
	}
	
	static void stampaMarca() {
		System.out.println("Carte TSS2023");
	}
	
}
