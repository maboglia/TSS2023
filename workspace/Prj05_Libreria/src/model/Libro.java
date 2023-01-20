package model;

public class Libro {
	
	public String titolo;
	public double prezzo;
	
	public Libro(String _titolo) {
		titolo = _titolo;
		prezzo = 10.0;
	}
	
	public String stampa() {
		return titolo + "...." + prezzo;
	}
}
