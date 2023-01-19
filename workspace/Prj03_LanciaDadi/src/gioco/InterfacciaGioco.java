package gioco;

public class InterfacciaGioco {

	public static void main(String[] args) {

		//dado 1
		//istanziato: costruito oggetto di tipo dado
		Dado d1 = new Dado();

		//lancio il dado e memorizzo il risultato
		int result1 = d1.lancio();
		
		//stampo a video il result
		System.out.println("Lancio il dado d1 ed esce " + result1);

		
		//dado 2		
		//istanziato: costruito oggetto di tipo dado
		Dado d2 = new Dado();

		//lancio il dado e memorizzo il risultato		
		int result2 = d2.lancio();

		//stampo a video il result
		System.out.println("Lancio il dado d2 ed esce " + result2);
		
		if (result1 == result2) {
			System.out.println("hai vinto con una coppia di " + result1);
		} else {
			System.out.println("Non hai vinto, ritenta!");
		}
		
		
	}

}
