package cicli;

import java.util.Scanner;

public class ProvaWhile {

	public static void main(String[] args) {

		boolean gira = true;
		
		
		Scanner sc = new Scanner(System.in);
		
		while(gira) {
			menu();
			
			int scelta = sc.nextInt();
			
			switch (scelta) {
				case 1:
					System.out.println("hai scelto 1");
					break;
				case 2:
					System.out.println("hai scelto 2");
					break;
				case 3:
					System.out.println("hai scelto 3");
					break;
				case 0:
					System.out.println("programma terminato");
					gira = false;
					break;
				default:
					System.out.println("Opzione non disponibile");
					break;
			}
			
			
//			if (scelta == 0) {
//				System.out.println("programma terminato");
//				gira = false;
//			} else {
//				
//				if (scelta == 1) {
//					System.out.println("hai scelto 1");
//				}
//				if (scelta == 2) {
//					System.out.println("hai scelto 2");
//				}
//				if (scelta == 3) {
//					System.out.println("hai scelto 3");
//				}
//			}
		}
	}

	private static void menu() {
		System.out.println("******************");
		System.out.println("1) per elenco libri");
		System.out.println("2) per prenotare un libro");
		System.out.println("3) per aggiungere un libro");
		System.out.println("0) per uscire");
		System.out.println("******************");
		
	}

}
