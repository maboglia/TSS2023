package model;

public class Libro implements Comparable<Libro> {

	private int id;
	private String autore;
	private String titolo;
	private String posizione;
	private String genere;
	
	public Libro() {//noARGS
		// TODO Auto-generated constructor stub
	}
	
	public Libro(int id, String autore, String titolo, String posizione, String genere) {
		this.id = id;
		this.autore = autore;
		this.titolo = titolo;
		this.posizione = posizione;
		this.genere = genere;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getPosizione() {
		return posizione;
	}

	public void setPosizione(String posizione) {
		this.posizione = posizione;
	}

	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}

	@Override
	public String toString() {
		return "Libro [id=" + id + ", autore=" + autore + ", titolo=" + titolo + ", posizione=" + posizione
				+ ", genere=" + genere + "]";
	}

	@Override
	public int compareTo(Libro altro) {
		// TODO Auto-generated method stub
		return this.titolo.compareTo(altro.titolo);
	}

	
	
}
