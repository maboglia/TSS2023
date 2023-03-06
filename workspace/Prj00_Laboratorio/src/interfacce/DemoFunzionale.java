package interfacce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

class ComparatoreTitolo implements Comparator<Libro>{

	@Override
	public int compare(Libro o1, Libro o2) {
		return o1.titolo.compareTo(o2.titolo);
	}
	
}




public class DemoFunzionale {

	public static void main(String[] args) {
		
		Libro l1 = new Libro("Zagor", 10, 50);
		Libro l2 = new Libro("Aigor", 20, 30);
		Libro l3 = new Libro("Magor", 30, 10);
		
		List<Libro> libri = new ArrayList<>(Arrays.asList(l1, l2, l3));
		
		
		//Collections.sort(libri, (o1, o2) -> o1.titolo.compareTo(o2.titolo));

		
		List<Libro> libri2 = libri
				.stream()
				.filter(l -> l.prezzo > 15)
				.sorted()
				.toList();
		
		System.out.println(libri2.size());
		
	}

}
