package model;

public class Rettangolo extends Figura {
	
	Segmento base, altezza;
	double perimetro;
	double superficie;
	
	public Rettangolo(Segmento base, Segmento altezza) {
		this.base = base;
		this.altezza = altezza;
		this.perimetro = calcolaPerimetro();
		this.superficie = calcolaSuperficie();
	}

	protected double calcolaSuperficie() {
		System.out.println("Metodo del rettangolo");
		return base.lunghezza * altezza.lunghezza;
	}

	protected double calcolaPerimetro() {
		return 2 * (base.lunghezza + altezza.lunghezza) ;
	}

	@Override
	public String toString() {
		return "Rettangolo [base=" + base + ", altezza=" + altezza + ", perimetro=" + perimetro + ", superficie="
				+ superficie + "]";
	}
	
	
	
	

}
