package interfacce;

import java.util.Arrays;
import java.util.List;

public class Biblioteca {

	public static void main(String[] args) {

		Libro[] libriArray = new Libro[3];
		
		libriArray[0] = new Libro("Zanna bianca", 10, 50);
		libriArray[1] = new Libro("Alba sul tramonto", 20, 40);
		libriArray[2] = new Libro("Mele marce", 30, 30);
		
		Arrays.sort(libriArray);
		
//		for (int i = 0; i < libriArray.length; i++) {
//			System.out.println(libriArray[i]);
//		}
//		
//		for (Libro libro : libriArray) {
//			System.out.println(libro);
//		}
//		
		
		List<Libro> listaLibri = Arrays.asList(libriArray);
		
		listaLibri.stream()
			.filter(libro -> libro.prezzo > 15)
			.filter(libro -> libro.prezzo < 30)
			.forEach(libro -> System.out.println(libro));
		
		

	}

}
