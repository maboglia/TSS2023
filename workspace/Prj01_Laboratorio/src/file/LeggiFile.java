package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

class Gioco{
	String nome;
	int id;
	public Gioco(String nome, int id) {
		this.id = id;
		this.nome = nome;
	}
	
	public String puntoElenco() {
		return "<li><a href='?gioco="+id+"'>" + nome + "</a></li>";
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
			int counter = 1;
			
			pw.println("<ul>");
			
			while( scanner.hasNextLine()) {
				Gioco g = new Gioco(scanner.nextLine(), counter++);
				
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
