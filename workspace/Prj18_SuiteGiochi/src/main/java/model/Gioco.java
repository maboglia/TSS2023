package model;

public class Gioco {
	private String nome;
	
	public Gioco(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String puntoElenco() {
		return "<li>" + nome + "</li>";
	}
	
	@Override
	public String toString() {
		return "Gioco [nome=" + nome.toUpperCase() + "]";
	}
	
}
