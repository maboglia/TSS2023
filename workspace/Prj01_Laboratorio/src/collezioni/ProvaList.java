package collezioni;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProvaList {

	public static void main(String[] args) {
		List<String> note = new ArrayList<>(Arrays.asList("do", "re", "mi", "fa", "sol", "la", "si"));

		((ArrayList)note).add("do-");
//		
//		for (String nota : note) { 
//			System.out.println(nota);
//		}
		
//		note.forEach(nota -> System.out.println(nota));
		note.forEach(System.out::println);
		
	}

}
