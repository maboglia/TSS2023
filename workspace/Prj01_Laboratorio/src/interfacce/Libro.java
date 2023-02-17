package interfacce;

public class Libro implements Comparable<Libro> {

	String titolo;
	double prezzo;
	int id;
	public Libro(String titolo, double prezzo, int id) {
		this.titolo = titolo;
		this.prezzo = prezzo;
		this.id = id;
	}
	@Override
	public String toString() {
		return "Libro [titolo=" + titolo + ", prezzo=" + prezzo + ", id=" + id + "]";
	}
	@Override
	public int compareTo(Libro altroLibro) {
		// TODO Auto-generated method stub
		return this.titolo.compareTo(altroLibro.titolo);
	}
	
	
}
