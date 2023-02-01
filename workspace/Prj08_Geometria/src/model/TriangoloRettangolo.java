package model;

public class TriangoloRettangolo extends Triangolo {

	double base, altezza , ipotenusa;

	public TriangoloRettangolo(Punto a, Punto b, Punto c) {
		super(a, b, c);
		// TODO Auto-generated constructor stub
		this.superficie = this.calcolaSuperficie();
	}

	@Override
	public double calcolaSuperficie() {

		
		 ipotenusa = Math.max(ab.lunghezza, Math.max(ac.lunghezza, bc.lunghezza));
		 altezza = Math.min(ab.lunghezza, Math.min(ac.lunghezza, bc.lunghezza));
		 base = ab.lunghezza + ac.lunghezza + bc.lunghezza - ipotenusa - altezza;
		
		System.out.println("La formula del triangolo generico dice: " + super.calcolaSuperficie());
		double area = (base * altezza)/2;
		System.out.println("La formula del triangolo rettangolo dice: " + area);
		
		return area;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Triangolo rettangolo superficie " + superficie;
	}

	
	
}
