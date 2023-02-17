package interfacce;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


class ComparatoreId implements Comparator<Libro>{
	@Override
	public int compare(Libro libro1, Libro libro2) {
		return libro1.id  - libro2.id;
	}
}




public class Biblioteca {

	public static void main(String[] args) {

		Libro[] libriArray = new Libro[3];
		
		libriArray[0] = new Libro("Zanna bianca", 40, 50);
		libriArray[1] = new Libro("Alba sul tramonto", 70, 40);
		libriArray[2] = new Libro("Mele marce", 30, 30);
		
		Arrays.sort(libriArray);
		
		//Comparator<Libro> cp = (libro1, libro2) -> Double.compare(libro1.prezzo, libro2.prezzo);;
		
		Arrays.sort(libriArray, (libro1, libro2) -> Double.compare(libro1.prezzo, libro2.prezzo));
		
//		for (int i = 0; i < libriArray.length; i++) {
//			System.out.println(libriArray[i]);
//		}
//		
		for (Libro libro : libriArray) {
			System.out.println(libro);
		}
//		
		
//		List<Libro> listaLibri = Arrays.asList(libriArray);
//		
//		listaLibri.stream()
//			.filter(libro -> libro.prezzo > 15)
//			.filter(libro -> libro.prezzo < 30)
//			.forEach(libro -> System.out.println(libro));
		
		

	}

}
