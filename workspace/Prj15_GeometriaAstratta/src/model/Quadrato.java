package model;

public class Quadrato extends Rettangolo {

	Segmento lato;
	
	public Quadrato(Segmento lato) {
		super(lato, lato);
		this.lato = lato;
	}

	@Override
	protected double calcolaSuperficie() {
		if (this.lato == null)
			return super.calcolaSuperficie();
		return Math.pow(this.lato.lunghezza, 2);
	}

	@Override
	protected double calcolaPerimetro() {
		if (this.lato == null)
			return super.calcolaPerimetro();
		return 4 * this.lato.lunghezza;
	}

	@Override
	public String toString() {
			return "Quadrato [superficie= " + this.calcolaSuperficie() + ""
				+ " perimetro=" + this.calcolaPerimetro() + "]";
	}

	
}
