package controller;

import java.util.ArrayList;

import model.Gioco;

public class GiocoCtrl {

	private ArrayList<Gioco> giochi;
	
	public GiocoCtrl() {
		this.giochi = new ArrayList<>();
	}
	
	public ArrayList<Gioco> getGiochi() {
		return giochi;
	}
	
	public void addGioco(Gioco g) {
		this.giochi.add(g);
	}
	
	public Gioco getGioco(String nome) {
		
		for (Gioco gioco : giochi) {
			if (gioco.getNome().startsWith(nome))
				return gioco;
		}
		
		return null;
	}
	
}
