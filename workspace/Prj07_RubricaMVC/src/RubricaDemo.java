import controller.Rubrica;
import main.MioScanner;

public class RubricaDemo {

	public static void main(String[] args) {
		
		Rubrica agendaRossa = new Rubrica(10);
		
		MioScanner msc = new MioScanner();
		
		String nome = msc.getParola("Nome del contatto");
		
		String numero = msc.getParola("Numero di telefono");
		
		agendaRossa.add(nome, numero);
		
		System.out.print( agendaRossa.getContatti()[0].mostraInfo() );
		
		

	}

}
