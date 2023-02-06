package controller;

import java.util.ArrayList;

import model.Contatto;

public class Rubrica {

	private String nome;
	private ArrayList<Contatto> contatti;
	
	public Rubrica(String nome) {
		this.contatti = new ArrayList<>();
		this.nome = nome;
	}
	
	public boolean addContatto(String nome, String numero) {
		//Contatto c = new Contatto(nome, numero);
		return this.contatti.add(new Contatto(nome, numero));
	}
	
	public ArrayList<Contatto> getContatti() {
		return contatti;
	}
	
}
