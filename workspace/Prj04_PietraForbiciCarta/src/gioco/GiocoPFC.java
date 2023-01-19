package gioco;

import java.util.Scanner;

public class GiocoPFC {

	public static void main(String[] args) {
		
		//1 chiedi all'umano di scegliere tra PFC
		String sceltaUmano = chiediUmano();
		//2 far scegliere a random al PC tra PFC
		String sceltaPC = chiediPC();
		//3 confronta le scelte di umano e PC
		String result = valutaScelte(sceltaUmano, sceltaPC);
		//4 stampa il risultato a video
		System.out.println(sceltaUmano);
		System.out.println(sceltaPC);
		stampaRisultato(result);

	}

	private static void stampaRisultato(String result) {
		System.out.println("il vincitore è: " + result);
	}

	private static String valutaScelte(String sceltaUmano, String sceltaPC) {

		String result = null;
		
		if (  sceltaUmano.equals(sceltaPC)  ) {
			result = "PAREGGIO";
		}
		else 
		{
			//1 UMANO = forbici
			if (sceltaUmano.equals("pietra")) {
				if (sceltaPC.equals("forbici")) {
					result = "VINCE UMANO";
				} else {
					result = "VINCE PC";
				}
			}

			//2 UMANO = carta
			if (sceltaUmano.equals("carta")) {
				if (sceltaPC.equals("pietra")) {
					result = "VINCE UMANO";
				} else {
					result = "VINCE PC";
				}
			}
			
			//3 UMANO = pietra
			if (sceltaUmano.equals("pietra")) {
				if (sceltaPC.equals("forbici")) {
					result = "VINCE UMANO";
				} else {
					result = "VINCE PC";
				}
			}
			
			
		}
		
		return result;
	}

	private static String chiediPC() {
		
		String risposta = "";
		double casuale = Math.random();//da 0.0 a minore di 1
		
		if (casuale < 0.33) {
			risposta = "pietra";
		} else if (casuale < 0.66) {
			risposta = "forbici";
		} else {
			risposta = "carta";
		}
		return risposta;
	}

	private static String chiediUmano() {
		
		Scanner scannerEpson = new Scanner(System.in);
		System.out.println("UMANO! scegli tra pietra, forbici, carta");
		return scannerEpson.nextLine();
	}

}
