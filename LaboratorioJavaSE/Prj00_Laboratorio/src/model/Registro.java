package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Registro {

	ArrayList<Studente> elenco;
	int presenti = 0;
	int assenti = 0;
	LocalDate data;
	
	
	public Registro() {
		this.data = LocalDate.now();
		this.elenco = new ArrayList<>();
	
	}

	public void inizializza() {
		
		//1 leggo il file
		try {
			Scanner scanner = new Scanner(new File("files/studenti.txt"));
			
		while (scanner.hasNextLine()) {
			//2 leggo la riga
			String string = scanner.nextLine();
			//3 spezzo la riga in parole
			String[] parole = string.split(",");
			//4 salvo le parole in variabile per costruire uno studente
			int nMAt = Integer.parseInt(parole[0]);
			String nome = parole[1];
			String cognome = parole[2];
			//5 creo lo studente
			Studente temp = new Studente(nMAt, nome, cognome);
			//6 metto lo studente nel contenitore
			this.elenco.add(temp);
		}
		
		
		
		} catch (FileNotFoundException e) {
			System.err.println("Si è verificato un problema nella lettura del file");
		}
		
		
	}
	
	public void faiAppello() {
		
		Scanner scanner = new Scanner(System.in);
		
		for (Studente studente : elenco) {
			System.out.println("E' presente ");
			System.out.println(studente);
			
			if (scanner.next().equalsIgnoreCase("s")){
				presenti++;
			} else {
				assenti++;
			}
			
			
		}
		
	}
	
	public void stampaReport() {
		System.out.println("In data " + data );
		System.out.println("sono presenti " + presenti);
		System.out.println("sono assenti " + assenti);
	}
	
}
