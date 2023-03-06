package interfacce;

public class Libro implements Comparable<Libro> {

	String titolo;
	double prezzo;
	int id;
	public Libro(String titolo, double prezzo, int id) {
		super();
		this.titolo = titolo;
		this.prezzo = prezzo;
		this.id = id;
	}
	@Override
	public String toString() {
		return "Libro [titolo=" + titolo + ", prezzo=" + prezzo + ", id=" + id + "]";
	}
	@Override
	public int compareTo(Libro o) {
		// TODO Auto-generated method stub
		return this.id - o.id;
	}
	
	
	
	
}
