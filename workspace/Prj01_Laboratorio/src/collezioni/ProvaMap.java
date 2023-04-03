package collezioni;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ProvaMap {

	public static void main(String[] args) {
		Map<Integer, String> mappa = new HashMap<>();
		
		mappa.put(1, "sol");
		mappa.put(2, "la");
		mappa.put(3, "si");
		mappa.put(4, "mi");
		mappa.put(5, "mi");

		Set<Integer> chiavi = mappa.keySet();
		Collection<String> valori = mappa.values();
		Set<Entry<Integer, String>> entrySet = mappa.entrySet();
		
		//valori.forEach(v -> System.out.println(v));
		
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		
		
//		for (int chiave : chiavi) {
//			System.out.println(mappa.get(chiave));
//		}
		
	}

}
