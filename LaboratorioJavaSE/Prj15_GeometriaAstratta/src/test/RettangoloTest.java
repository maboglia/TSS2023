package test;

import model.Punto;
import model.Quadrato;
import model.Rettangolo;
import model.Segmento;

public class RettangoloTest {

	public static void main(String[] args) {
		
		Punto a = new Punto(3, 2);
		Punto b = new Punto(7, 2);
		Punto c = new Punto(3, 5);
		
		Segmento ab = new Segmento(a, b);//4
		Segmento ac = new Segmento(a, c);//3

		Rettangolo r = new Rettangolo(ab, ac);
		
		System.out.println(r);
		
		Quadrato q = new Quadrato(ab);
		
		System.out.println(q);
		

	}

}
