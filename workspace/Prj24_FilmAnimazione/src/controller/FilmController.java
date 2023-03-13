package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import model.Film;

public class FilmController {

	File f;
	
	public FilmController(String percorso) {
		this.f = new File(percorso);
	}
	
	public FilmController(File diverso) {//dependency injection
		this.f = diverso;
	}
	
	public List<Film> leggiFileInList(){
		List<Film> temp = new ArrayList<>();
		
		try {
			FileReader fr = new FileReader(f);
			BufferedReader reader = new BufferedReader(fr);
			
			while (true) {
				
				String s = reader.readLine();
				
				if (s == null) {
					break;
				}
				
				String[] split = s.split(",");
				
				int id =  Integer.parseInt(split[0]);
				String titolo = split[1];
				int anno = Integer.parseInt(split[2]);
				double rating = Double.parseDouble(split[3]);
				
				//Film filmTemp = new Film(id, titolo, anno, rating);
				
				temp.add(new Film(id, titolo, anno, rating));
				
				//System.out.println(s);
				
				
			}
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return temp;
	}
	
	
	
	
}
