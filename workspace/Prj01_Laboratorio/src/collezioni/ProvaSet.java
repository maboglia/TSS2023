package collezioni;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ProvaSet {

	public static void main(String[] args) {
		List<String> note = new ArrayList<>(Arrays.asList("do", "re", "mi", "fa", "mi", "fa", "sol","mi", "fa", "la", "si"));
		note.forEach(System.out::println);

		System.out.println("-------------------------------");
		
		Set<String> noteDistinte = new HashSet<>(note);
		noteDistinte.forEach(System.out::println);
		
		

	}

}
