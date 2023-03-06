package controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LeggiParole {

	private File f;
	
	public LeggiParole(String percorso) {//new LeggiParole("files/1000_parole_italiane_comuni.txt");
		f = new File(percorso);
	}
	
	public List<String> getParole(){
		
		List<String> temp = new ArrayList<>() ;
		
		//con scanner
		try {
			Scanner scanner = new Scanner(f);
			
			while(scanner.hasNextLine()) {
				
				//String parola = scanner.nextLine();
				temp.add(scanner.nextLine());
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return temp;
	}
	
	public List<String> getParoleByLunghezza(int lunghezza){
		
		return this.getParole()
				.stream()
				.filter(p -> p.length()==lunghezza)
				.toList();
		
	}
	
	public List<String> getParoleOldWay() throws IOException{
		
		FileReader fr = new FileReader(f);
		
		int c;
		
		while ( (c =  fr.read())!=-1) {
			
			if (c == 10 || c == 13)
			System.out.println();
			else
			System.out.print((char) c);
			
			
		}
		
		return null;
		
	}
	
	public List<String> getParoleNewWay() throws IOException{
		return Files.readAllLines(f.toPath());
	}
	
	public void scriviSuFile(String path, int lunghezza) throws FileNotFoundException {
		PrintWriter pw = new PrintWriter(new File(path));
		
		for (String parola :  getParoleByLunghezza(lunghezza)) {
			pw.println(parola.toUpperCase());
		}
		pw.close();
	}
	
}
