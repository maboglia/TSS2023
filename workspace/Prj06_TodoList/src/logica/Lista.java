package logica;

public class Lista {

	public Todo[] elencoTodo;
	
	public Lista(int lunghezza) {
		elencoTodo = new Todo[lunghezza];
	}
	
	public void add(Todo t) {
		//aggiungere un todo all'elenco della Lista
		int posizione = trovaPosizioneLibera();
		
		if (posizione > -1) {
			elencoTodo[posizione] = t;
		} else {
			System.out.println("Non c'è posto per il todo " + t.descrizione);
		}
	}
	
	private int trovaPosizioneLibera() {
		
		for (int i = 0; i < elencoTodo.length; i++) {
			if (elencoTodo[i] == null)
				return i;
		}
		
		return -1;
	}
	
	public Todo get(int pos) {
		return elencoTodo[pos];
	}
	
	public Todo[] getAll() {
		return elencoTodo;
	}
	
}
