package model;

public class Triangolo extends Figura{
	
	Punto a, b, c;
	Segmento ab, ac, bc;
	double perimetro;
	double superficie;
	
	
	public Triangolo(Punto a, Punto b, Punto c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.ab = new Segmento(a, b);
		this.ac = new Segmento(a, c);
		this.bc = new Segmento(b, c);
		this.perimetro = this.calcolaPerimetro();
		this.superficie = this.calcolaSuperficie();
	}
	
	public double calcolaPerimetro() {
		return ab.lunghezza + ac.lunghezza + bc.lunghezza;
	}
	
	public double calcolaSuperficie() {
		//applico la formula di erone
		double sp = perimetro / 2;
		return Math.sqrt( sp * (sp-ab.lunghezza) * (sp-bc.lunghezza) * (sp-ac.lunghezza) );
		
	}

	@Override
	public String toString() {
		return "Triangolo [a=" + a + ", b=" + b + ", c=" + c + ", ab=" + ab + ", ac=" + ac + ", bc=" + bc
				+ ", perimetro=" + perimetro + ", superficie=" + superficie + "]";
	}
	
}
