package model;

public class Studente {

	private int nMat;
	private String nome;
	private String cognome;
	
	public Studente(int nMat, String nome, String cognome) {
		this.nMat = nMat;
		this.nome = nome;
		this.cognome = cognome;
	}

	public int getnMat() {
		return nMat;
	}

	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}

	@Override
	public String toString() {
		return "Studente [nMat=" + nMat + ", nome=" + nome + ", cognome=" + cognome + "]";
	}
	
	
}
