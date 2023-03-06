package test;

import java.util.ArrayList;

import model.Figura;
import model.Punto;
import model.Quadrato;
import model.Rettangolo;
import model.Segmento;
import model.Triangolo;

public class ProvaGeometria {

	public static void main(String[] args) {
		
		Punto a = new Punto(3, 2);
		Punto b = new Punto(7, 2);
		Punto c = new Punto(3, 5);
		
		Segmento ab = new Segmento(a, b);//4
		Segmento ac = new Segmento(a, c);//3
		
		Figura r = new Rettangolo(ab, ac);
		
		Figura q = new Quadrato(ab);
		
		Figura t = new Triangolo(a, b, c);
		
		ArrayList<Figura> figure = new ArrayList<>();
				
		figure.add(t);
		figure.add(r);
		figure.add(q);
		
		for (Figura figura : figure) {
			System.out.println(figura);
		}
		

	}

}
