package model;

public class Fattorino extends Dipendente {

	double pagaBase = 2.5;
	int nConsegne;
	
	
	public Fattorino(String nome, String cognome) {
		super(nome, cognome);
		// TODO Auto-generated constructor stub
	}

	public void setNConsegne(int consegne) {
		this.nConsegne = consegne;
	}
	
	public double getStipendio() {
		return nConsegne * pagaBase;
	}
	
	
}
