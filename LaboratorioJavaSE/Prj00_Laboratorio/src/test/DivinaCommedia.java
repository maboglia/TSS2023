package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class DivinaCommedia {

	static ArrayList<String> parole = new ArrayList<>();
	static TreeSet<String> paroleNonRipetute = new TreeSet<>();
	
	
	public static void main(String[] args) {
		
		
		int nParole = contaParole();
		System.out.println("Ci sono " + nParole + " parole");
		
//		Collections.sort(parole); 
//		
//		for (String parola : parole) {
//			System.out.println(parola);
//		}
		
		for (String parola : paroleNonRipetute) {
			System.out.println(parola);
		}
		System.out.println(paroleNonRipetute.size());

	}

	private static int contaParole() {
		File f = new File("files/commedia.txt");
		try {
			Scanner sc = new Scanner(f);
			
			while (sc.hasNext()) {
				String parola = sc.next();
				
				parola = parola.replaceAll(",", "");
				parola = parola.replaceAll("\\.", "");
				parola = parola.replaceAll(";", "");
				parola = parola.replaceAll(":", "");
				parola = parola.replaceAll("\"", "");
				
				if (parola.length()>3) {
					//System.out.println(parola);
					parole.add(parola);
					paroleNonRipetute.add(parola);
				}
				
			}
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return parole.size();
	}

}
