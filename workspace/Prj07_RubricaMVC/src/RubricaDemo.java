import controller.Rubrica;
import main.MioScanner;
import model.Contatto;

public class RubricaDemo {

	public static void main(String[] args) {

		boolean gira = true;
		Rubrica agendaRossa = new Rubrica(1);
		MioScanner msc = new MioScanner();

		while (gira) {
			System.out.println("1) aggiungi contatto");
			System.out.println("2) mostra contatti");
			System.out.println("9) esci");

			int scelta = msc.getIntero("Fai una scelta");

			switch (scelta) {
			case 1:
				String nome = msc.getParola("Nome del contatto");
				String numero = msc.getParola("Numero di telefono");
				agendaRossa.add(nome, numero);
				break;
			case 2:
				for (Contatto c : agendaRossa.getContatti()) {
					if (c != null) {
						System.out.println(c.mostraInfo());
					} else {
						System.out.println("---VUOTO---");
					}
				}
				break;
			case 9:
				gira = false;
				break;
			default:
				System.out.println("opzione non disponibile");
				break;
			}
		}
		System.out.println("Programma terminato");
//		System.out.print( agendaRossa.getContatti()[0].mostraInfo() );
	}
}
