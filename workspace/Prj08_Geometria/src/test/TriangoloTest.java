package test;

import model.Punto;
import model.Triangolo;
import model.TriangoloRettangolo;

public class TriangoloTest {

	public static void main(String[] args) {

		Punto a = new Punto(3, 2);
		Punto b = new Punto(7, 2);
		Punto c = new Punto(3, 5);
		
		Triangolo t = new Triangolo(a, b, c);
		Triangolo t2 = t;
		TriangoloRettangolo tr = new TriangoloRettangolo(a, b, c);
		
		System.out.println(t);
		System.out.println(t2);
		System.out.println(tr);

	}

}
