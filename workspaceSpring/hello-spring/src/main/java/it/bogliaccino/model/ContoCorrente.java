package it.bogliaccino.model;

public class ContoCorrente {//POJO Plain Old Java Object - JavaBean

	private String titolare;
	private double saldo;
	private int numero;
	
	public ContoCorrente() {
		
	}

	public ContoCorrente(String titolare, int numero) {
		this.titolare = titolare;
		this.numero = numero;
	}

	public String getTitolare() {
		return titolare;
	}

	public void setTitolare(String titolare) {
		this.titolare = titolare;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "ContoCorrente [titolare=" + titolare + ", saldo=" + saldo + ", numero=" + numero + "]";
	}
	
	 
	
	
}
