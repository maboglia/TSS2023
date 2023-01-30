package model;

public class TriangoloRettangolo extends Triangolo {

	public TriangoloRettangolo(Punto a, Punto b, Punto c) {
		super(a, b, c);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcolaSuperficie() {

		double base, altezza, ipotenusa;
		
		//ab = 4
		//ac = 3
		//cb = 5
		
		base = ab.lunghezza;//5
		altezza = ac.lunghezza;//4
		ipotenusa = bc.lunghezza;//3
		
		if (base > ipotenusa) {
			base = ipotenusa;
		}
		if (altezza > ipotenusa) {
			altezza = ipotenusa;
		}
		
		

		return super.calcolaSuperficie();
	}

	
	
}
