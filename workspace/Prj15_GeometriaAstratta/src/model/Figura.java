package model;

public abstract class Figura {//NON posso creare istanze

	public Figura() {
		System.out.println("Figura generica costruita");
	}
	
	protected abstract double calcolaSuperficie();
	
}
