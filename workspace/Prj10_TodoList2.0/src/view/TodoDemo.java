package view;

import java.util.ArrayList;

import controller.TodoCtrl;
import model.Todo;

public class TodoDemo {

	public static void main(String[] args) {

		TodoCtrl controller = new TodoCtrl();
		controller.addTodo("caffé lungo", 1);
		controller.addTodo("croissant sfoglia ciliegia", 1.5);
		controller.addTodo("spremuta di arance rosse di sicilia", 2);
		controller.addTodo("iris fritto", 2.5);
		controller.addTodo("latte di mandorla", 3);
		
		ArrayList<Todo> lista = controller.getLista();
		
		for (Todo todo : lista) {
			System.out.println(todo);
		}
		
		System.out.println("Il totale dello scontrino");
		System.out.println(controller.getPrezzoTotale());
	}

}
