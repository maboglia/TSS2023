package model;

public class Veicolo {

	// mettendo protected le sottoclassi vedono gli attributi, con private no.
	protected String marca;
	protected String modello;
	protected double prezzo;
	
	/**
	 * costruttore del veicolo 
	 * @param marca : inserire la marca del veicolo
	 * @param modello : inserire il modello del veicolo
	 * @param prezzo : inserire il prezzo del veicolo
	 */
	public Veicolo(String marca, String modello, double prezzo) 
	{
		this.marca = marca;
		this.modello = modello;
		this.prezzo = prezzo;
	}

	public String getMarca() 
	{
		return marca;
	}

	public void setMarca(String marca) 
	{
		this.marca = marca;
	}

	public String getModello() 
	{
		return modello;
	}

	public void setModello(String modello) 
	{
		this.modello = modello;
	}

	public double getPrezzo() 
	{
		return prezzo;
	}

	public void setPrezzo(double prezzo) 
	{
		this.prezzo = prezzo;
	}

	@Override
	public String toString() 
	{
		return "Marca del veicolo: " + marca + ", modello: " + modello + ", prezzo: " + prezzo + "]";
	}
	
	
	
	
	
	
	
	
}
