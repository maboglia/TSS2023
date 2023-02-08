package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import model.Dipendente;
import model.Dirigente;
import model.Fattorino;
import model.Impiegato;

public class DipendenteTest {

	public static void main(String[] args) {

		File f = new File("files/dipendenti.txt");
		Dipendente[] dipendenti = new Dipendente[16];
		
		try {
			Scanner sc = new Scanner(f);
			
			int i = 0;
			
			while (sc.hasNextLine()) {
				String riga = sc.nextLine();
				String[] split = riga.split(", ");
				
				String nome = split[0];
				String cognome = split[1];
				
				dipendenti[i] = new Dipendente(nome, cognome);
				i++;
			}
			
			
			
		} catch (FileNotFoundException e) {
			System.out.println("Problema!!!!!!!!!!");
		}
		
		
		for (Dipendente d : dipendenti) {
			System.out.println(d);
		}
		

	}

}
