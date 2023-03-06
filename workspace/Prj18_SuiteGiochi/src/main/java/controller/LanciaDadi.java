package controller;

import model.Dado;

public class LanciaDadi {

	//istanziato: costruito oggetto di tipo dado
	static Dado d1 = new Dado();
	//dado 2		
	//istanziato: costruito oggetto di tipo dado
	static Dado d2 = new Dado();
	
	public static int result1, result2;
	public static int vittorie=0;
	public static String risultato;
	
	public static void play() {
		//dado 1

				//lancio il dado e memorizzo il risultato
				result1 = d1.lancio();
				
				//stampo a video il result
				System.out.println("Lancio il dado d1 ed esce " + result1);

				
				

				//lancio il dado e memorizzo il risultato		
				result2 = d2.lancio();

				//stampo a video il result
				System.out.println("Lancio il dado d2 ed esce " + result2);
				
				if (result1 == result2) {
					risultato = "Hai vinto!";
					vittorie++;
					System.out.println("hai vinto con una coppia di " + result1);
				} else {
					risultato = "Hai perso!";
					System.out.println("Non hai vinto, ritenta!");
				}
	}
	
	
	
}
