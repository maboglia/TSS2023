package controller;

import java.util.ArrayList;

import model.Todo;

public class TodoCtrl {

	private ArrayList<Todo> lista;
	
	public TodoCtrl() {
		this.lista = new ArrayList<>();
	}
	
	public ArrayList<Todo> getLista() {
		return this.lista;
	}
	
	

	public void addTodo(String descrizione, double prezzo) {
		Todo t = new Todo(descrizione, prezzo);
		boolean aggiuntoOk = this.lista.add(t);
		if (aggiuntoOk)
			System.out.println("Todo aggiunto alla lista");
	}
	
	public double getPrezzoTotale() {
		double totale = 0;
		for (Todo todo : lista) {
			totale += todo.prezzo;
		}
		return totale;
	}
}
