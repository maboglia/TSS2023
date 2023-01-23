package vista;

import java.util.Scanner;

import logica.Lista;
import logica.Todo;

public class TodoListDemo {

	public static void main(String[] args) {
		
		boolean gira = true;
		
		int lunghezzaLista = getInt("Quanto la vuoi lunga?..la lista!");
		
		Lista primaLista = new Lista(lunghezzaLista);
		
		while(gira) {
			
			System.out.println( menu() );
			
			int scelta = getInt("quale operazione scegli?");
			
			switch (scelta) {
			
			case 1:
			//1 add todo
			//get descrizione
				String oggettoDaInserire = getString("Cosa vuoi inserire?");
				//creo un todo
				Todo t = new Todo(oggettoDaInserire);
				//lista add
				primaLista.add(t);
				break;
			
			case 2:
				//2 get todo by pos
				//get int posizione
				int posizione = getInt("Quale nota vuoi vedere?");
				//get from list
				Todo todo = primaLista.get(posizione);
				//print todo
				System.out.println(todo.descrizione);
				break;
				
			case 3:
				//3 get all todo
				//get all
				for(Todo tt : primaLista.getAll()) {
					//print all
					if (tt != null)
						System.out.println(tt.stampa());
				}
				break;
				
			case 4:
				//4 esci dal programma
				//saluta ed esci
				gira = false;
				System.out.println("programma terminato");
				break;

			default:
				System.out.println("Opzione non disponibile");
				break;
			}
			
		}

	}

	private static String getString(String domanda) {
		System.out.println(domanda);
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}
	
	private static int getInt(String domanda) {
		System.out.println(domanda);
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
	
	private static String menu() {
		return "Benvenuto nel SW TodoList"
				+"\n1) Aggiungi un todo"	
				+"\n2) Trova un todo"	
				+"\n3) Vedi tutti i todo"	
				+"\n4) Esci dal programma";	
				
	}
	
	
	
}
