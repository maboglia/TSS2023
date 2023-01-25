package controller;

import model.Contatto;

public class Rubrica {

	Contatto[] contatti;
	
	public Rubrica(int n) {
		this.contatti = new Contatto[n];
	}
	
	private void delete(int i) {
		// TODO implementare il metodo per eliminare i contatti
		
	}

	public void add(String nome, String numero) {

		//trova la prima posiz disponibile
		int pos = trovaUnPostoLiberoNelContenitoreDeiContatti();
		if (pos > -1) {
			//Contatto c = new Contatto(nome, numero);
			//aggiungere il contatto 
			this.contatti[pos] = new Contatto(nome, numero);
		} else {
			System.out.println("Posti in rubrica esauriti, non posso aggiungere questo contatto");
		}
	}

	public Contatto[] getContatti() {
		return contatti;
	}
	
	private int trovaUnPostoLiberoNelContenitoreDeiContatti() {
		
		for (int i = 0; i < contatti.length; i++) {
			if (contatti[i] == null)
				return i;
		}
		
		return -1;
	}
	
	
	
}
