package interfaccia;

import model.Libro;

public class LibreriaDemo {

	public static void main(String[] args) {
		
		
		stampaElenco();
	}

	private static void stampaElenco() {
		
		Libro[] libri = new Libro[10];
		
		libri[0] = new Libro("io, robot");
		libri[1] = new Libro("1984");
		libri[2] = new Libro("Ad occhi chiusi");
		
		System.out.println(libri.length);
		
		for (int i = 0; i < libri.length; i++) {
			if (libri[i] != null)
				System.out.println(libri[i].stampa());
		}
	}
	
	
}
