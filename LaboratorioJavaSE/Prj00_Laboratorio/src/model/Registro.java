package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Registro {

	ArrayList<Studente> elenco;
	ArrayList<Studente> presenti;
	ArrayList<Studente> assenti;
	LocalDate data;
	
	
	public Registro() {
		this.data = LocalDate.now();
		this.elenco = new ArrayList<>();
		this.presenti = new ArrayList<>();
		this.assenti = new ArrayList<>();
		
	
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
				presenti.add(studente);
			} else {
				assenti.add(studente);
			}
			
			
		}
		
	}
	
	public void stampaReport() {
		
		try {
			PrintWriter stampante = new PrintWriter(new File("files/output.txt"));

			stampante.println("In data " + data );
			stampante.println("sono presenti " + presenti.size());
			
			
			for (Studente studente : presenti) {
				stampante.println(studente);
			}

			stampante.println("sono assenti " + assenti.size());

			for (Studente studente : assenti) {
				stampante.println(studente);
			}
			
			stampante.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Ho stampato l'elenco nel file output.txt");
	}
	
}
