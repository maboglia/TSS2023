package controller;

import model.Dado;



public class LanciaDati
{
	static Dado d1 = new Dado();
	static Dado d2 = new Dado();
	
	public static int result1, result2;
	public static int vittorie = 0;
	public static String risultato;
	
	public static void play()
	{
			result1 = d1.lancio();
			System.out.println("Lancio il dado d1 ed esce " + result1);
			
			result2 = d2.lancio();
			System.out.println("Lancio il dado d2 ed esce " + result2);

			
			if (result1 == result2) {
				risultato = "vittoria";
				vittorie++;
				System.out.println("hai vinto con una coppia di " + result1);
				}
			else 
			{
				risultato = "Non hai vinto";
			}
	}
	
	
	
}