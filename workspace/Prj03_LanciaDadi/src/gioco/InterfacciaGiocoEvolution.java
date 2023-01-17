package gioco;

public class InterfacciaGiocoEvolution {

	public static void main(String[] args) {

		final int NUM_LANCI = 1000_000;
		int vittorie = 0;
		double percentualeVittorie = 0;

		//dado 1
		//istanziato: costruito oggetto di tipo dado
		Dado d1 = new Dado();
		
		//dado 2		
		//istanziato: costruito oggetto di tipo dado
		Dado d2 = new Dado();
		
		//prendo il tempo prima di cominciare il ciclo
		long start = System.currentTimeMillis();
		for(int i = 0; i < NUM_LANCI; i++) {
			
			//lancio il dado e memorizzo il risultato
			int result1 = d1.lancio();
			
			//lancio il dado e memorizzo il risultato		
			int result2 = d2.lancio();
			
			if (result1 == result2) {
				vittorie++;
				//System.out.println("hai vinto con una coppia di " + result1);
			} else {
				//System.out.println("Non hai vinto, ritenta!");
			}
			
		}
		long stop = System.currentTimeMillis();
		
		System.out.println("hai giocato "  + NUM_LANCI + " volte");
		System.out.println("hai vinto " + vittorie + " volte");
		
		percentualeVittorie =  (double) vittorie / NUM_LANCI * 100;
		
		System.out.println("La percentuale di vittorie è: " + percentualeVittorie +"%");
		
		System.out.println("L'elaborazione è durata " + ( stop - start ) +"ms" );
		
	}

}
