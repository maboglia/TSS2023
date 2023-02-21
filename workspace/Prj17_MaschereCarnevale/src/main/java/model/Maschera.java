package model;

public class Maschera
{
	private String nome;
	private String foto;
	

	
	public Maschera(String nome)
	{
		System.out.println("Costr. 1 parametri");
		this.nome = nome;
		this.foto = "fotoGenerica.jpeg";
	}
	
	public Maschera(String nome, String foto)
	{
		System.out.println("Costr. 2 parametri");
		this.nome = nome;
		this.foto = foto;
	}


	public String getNome()
	{
		return nome;
	}


	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public String getFoto()
	{
		return foto;
	}

	public void setFoto(String foto)
	{
		this.foto = foto;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
