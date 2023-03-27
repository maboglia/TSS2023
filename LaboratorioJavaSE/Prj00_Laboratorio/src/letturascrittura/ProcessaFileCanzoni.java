package letturascrittura;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import model.Cantante;
import model.Canzone;

public class ProcessaFileCanzoni {

	public static void main(String[] args) {
		
		File f = new File("files/canzoni_rock.csv");
		List<Canzone> canzoni = new LinkedList<>();
		Set<Cantante> cantantiDisordinati = new HashSet<>();
		Set<Cantante> cantantiOrdinati = new TreeSet<>();
		
		
		try {
			Scanner sc = new Scanner(f);
			
			while(sc.hasNextLine()) {
				
				String riga = sc.nextLine();
				
				String[] parole = riga.split(",");
				
				int id = Integer.parseInt( parole[0] );
				String titolo = parole[1];
				Cantante cantante = new Cantante();
				cantante.setNome(parole[2]);
				
				Canzone c = new Canzone();
				c.setId(id);
				c.setTitolo(titolo);
				c.setCantante(cantante);
				
				
				canzoni.add(c);
				cantantiDisordinati.add(cantante);
				cantantiOrdinati.add(cantante);
				
				
				//System.out.println(cantanti);
				
			}
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("Le canzoni sono " + canzoni.size());
		System.out.println("I cantanti disordinati sono " + cantantiDisordinati.size());
		System.out.println("I cantanti ordinati sono " + cantantiOrdinati.size());
		
		File f2 = new File("files/cantanti.txt");
		try {
			PrintWriter pw = new PrintWriter(f2);
			
			for (Cantante cantante : cantantiOrdinati) {
//				pw.println(cantante.getNome());
			}
			//pw.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		List<Cantante> cantantiLunghi25 = canzoni
			.stream()
			.filter(c -> c.getTitolo().length()>25)
			.map(c -> c.getCantante())
			.toList();
		
		cantantiLunghi25.forEach(System.out::println);
		

	}

}
