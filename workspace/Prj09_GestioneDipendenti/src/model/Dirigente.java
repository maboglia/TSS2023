package model;

public class Dirigente extends Dipendente{

	double pagaBase = 20;
	double giornate = 0;
	
	public Dirigente(String nome, String cognome) {
		super(nome, cognome);
		// TODO Auto-generated constructor stub
	}

	public void setGiornate(double giornate) {
		this.giornate = giornate;
	}

	public double getStipendio() {
		return giornate * pagaBase;
	}
	
	
}
