package view;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import controller.LeggiParole;

public class ParoleDemo {

	public static void main(String[] args) {

		LeggiParole lp = new LeggiParole("files/1000_parole_italiane_comuni.txt");
		
		List<String> parole = lp.getParole();

//		for (String parola : parole) {
//			if (parola.length()==5)
//			System.out.println(parola);
//		}
		
//		List<String> list = parole
//			.stream()
//			.filter(p -> p.length()==5)
//			.toList();
//		int totale = 0;
//		for (int i = 1; i <= 13; i++) {
//			System.out.println("Parole da " +i +": " 
//					+ lp.getParoleByLunghezza(i).size());
//			totale+= lp.getParoleByLunghezza(i).size();
//		}
//		System.out.println(totale);
		
		GsonBuilder builder = new GsonBuilder();
		builder.setPrettyPrinting();
		
		Gson gson = builder.create();
		
		StringBuilder sb = new StringBuilder();
		for (String parola : lp.getParoleByLunghezza(5)) {
			sb.append(parola);
		}
		String json = gson.toJson(lp.getParoleByLunghezza(5));
		
		System.out.println(json);
		
		
		try {
			lp.scriviSuFile("files/paroleda5.txt", 5);
			lp.scriviSuFile("files/paroleda10.txt", 10);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
