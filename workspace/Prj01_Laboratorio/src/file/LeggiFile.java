package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

class Gioco{
	String nome;
	public Gioco(String nome) {
		this.nome = nome;
	}
	
	public String puntoElenco() {
		return "<li>" + nome + "</li>";
	}
	
	
	@Override
	public String toString() {
		return "Gioco [nome=" + nome.toUpperCase() + "]";
	}
	
}


public class LeggiFile {

	public static void main(String[] args) {

		File f = new File("files/giochi.txt");
		File output = new File("files/giochi.html");
		
		
		try {
			Scanner scanner = new Scanner(f);
			PrintWriter pw = new PrintWriter(output);
			
			pw.println("<ul>");
			
			while( scanner.hasNextLine()) {
				Gioco g = new Gioco(scanner.nextLine());
				
				pw.println(g.puntoElenco());
			}

			pw.println("</ul>");

			pw.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		} 
		
		System.out.println("programma terminato");
		

	}

}
