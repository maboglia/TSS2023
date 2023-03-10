package model;

public class Cantante implements Comparable<Cantante>{

	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Cantante [nome=" + nome + "]";
	}

	@Override
	public int compareTo(Cantante altro) {
		
		return this.nome.compareTo(altro.nome);
	}
	
	
	
}
