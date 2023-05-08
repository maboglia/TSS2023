package funzionale;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

//class Filtro implements Predicate<String> {
//
//	@Override
//	public boolean test(String frutto) {
//		return frutto.length() == 4;
//	}
//	
//}

//class Consumatore implements Consumer<String>{
//
//	@Override
//	public void accept(String frutto) {
//		System.out.println(frutto);
//	}
//	
//}

public class ProvaFilter {

	public static void main(String[] args) {

//		String[] frutti = new String[4];
//		String[] frutti = new String[]{"banane", "mele", "pere", "fragole"};
		String[] frutti = {"banane",  "pere", "kiwi","mele", "fragole"};
		
//		List<String> fruttiList = Arrays.asList(new String[]{"banane", "mele", "pere", "fragole"});
		Collection<String> fruttiList = new LinkedList<>(Arrays.asList(frutti));
		
//		Predicate<String> f = frutto -> frutto.length() == 4;
//		Consumer<String> c = frutto -> System.out.println(frutto);
		
		fruttiList
			.stream()
			.filter(frutto -> frutto.length() == 4)
			.sorted()
			.limit(2)
			.forEach(System.out::println);
		
		
		

	}

}
