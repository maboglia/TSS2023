package interfacce;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollezioneFumetti {

	public static void main(String[] args) {
		
		String fumetto1 = "Alan Ford";
		String fumetto2 = "Dylan Dog";
		String fumetto3 = "Superman";
		String fumetto4 = "Rat Man";
		String fumetto5 = "Alan Ford";
		
		List<String> collezione = new ArrayList<>(); 

		collezione.add(fumetto1);
		collezione.add(fumetto2);
		collezione.add(fumetto3);
		collezione.add(fumetto4);
		collezione.add(fumetto5);
		
		for (String fumetto : collezione) {
			System.out.println(fumetto);
		}
		
		if (collezione.contains(fumetto4)) {
			System.out.println("C'è il fumetto " + fumetto4);
		}

				
		Set<String> setFumetti = new TreeSet<>(collezione);
		
		for (String fumetto : setFumetti) {
			System.out.println(fumetto);
		}
	}

}
