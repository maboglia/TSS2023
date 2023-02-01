package model;

public class Impiegato extends Dipendente {

	double pagaBase = 5.75;
	double oreLavorate = 0;
	
	public Impiegato(String nome, String cognome) {
		super(nome, cognome);
		// TODO Auto-generated constructor stub
	}

	public void setOreLavorate(double oreLavorate) {
		this.oreLavorate = oreLavorate;
	}

	public double getStipendio() {
		return oreLavorate * pagaBase;
	}
	
	
}
