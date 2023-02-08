package model;

import java.time.LocalDate;

public class Dipendente {

	static int contatore = 1;
	
	int nMat;
	String nome;
	String cognome;
	LocalDate dataAssunzione;
	
	public Dipendente(String nome, String cognome) {
		this.nMat = Dipendente.contatore++;
		this.nome = nome;
		this.cognome = cognome;
		this.dataAssunzione = LocalDate.now();
	}

	@Override
	public String toString() {
		return "Dipendente [nMat=" + nMat + ", nome=" + nome + ", cognome=" + cognome + ", dataAssunzione="
				+ dataAssunzione + "]";
	}
	
	
	
	
	
}
