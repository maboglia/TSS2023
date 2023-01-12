package programma;

import java.util.Scanner;

public class CalcolatriceDemo {

	public static void main(String[] args) {
		
		int a = leggiIntero();
		int b = leggiIntero();
		
		double risultato = 0;
		
//		risultato = a + b;
//		System.out.println(risultato);

		risultato = Calcolatrice.addizione(a, b);
		System.out.println("Il risultato dell'addizione: " + risultato);
		
		System.out.println("Il risultato della sottrazione: " +  Calcolatrice.sottrazione(a, b)                        );

		System.out.println("Il risultato della moltiplicazione: " +  Calcolatrice.moltiplicazione(a, b)                        );
		
		System.out.println("Il risultato della divisione: " +  Calcolatrice.divisione(a, b)                        );
		
		
//		risultato = a * b;
//		System.out.println(risultato);
//
//		risultato = a / b;
//		System.out.println(risultato);
		
	}

	private static int leggiIntero() {

		Scanner scannatore = new Scanner(System.in);
		System.out.println("Inserisci un numero intero");
		return scannatore.nextInt();
	}

	
}
