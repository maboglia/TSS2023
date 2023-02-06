package view;

import java.util.ArrayList;

import controller.Rubrica;
import model.Contatto;

public class RubricaDemo {

	public static void main(String[] args) {

		Rubrica r1 = new Rubrica("agenda rossa");
		Rubrica r2 = new Rubrica("agenda blu");
		
		r1.addContatto("mauro", "12345");
		r1.addContatto("paolo", "123456");
		r1.addContatto("paola", "612345");
		
		ArrayList<Contatto> contatti = r1.getContatti();
		
		for (Contatto contatto : contatti) {
			System.out.println(contatto);
		}

		r2.addContatto("Pippo", "123456");
		
		for (Contatto contatto : r2.getContatti()) {
			System.out.println(contatto);
		}
		
		
		
	}

}
