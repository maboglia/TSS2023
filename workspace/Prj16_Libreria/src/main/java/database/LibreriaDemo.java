package database;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import model.Libro;

public class LibreriaDemo {

	public static void main(String[] args) throws FileNotFoundException {
		
		PrintWriter pw = new PrintWriter(new File("files/output.txt"));
		
		for (Libro l:   DBLibri.getLibri()) {
			
			String s ="libri.add(new Libro("+l.getId()+", \""+l.getAutore()+"\", \""+l.getTitolo()+"\", \""+l.getPosizione()+"\",\""+l.getGenere()+"\" ));";
			
			pw.println(s);
			
			
		}
		pw.close();
	}

}
