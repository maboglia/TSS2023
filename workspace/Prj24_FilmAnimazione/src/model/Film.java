package model;

public class Film {

	private int id;
	private String titolo;
	private int anno;
	private double rating;
	
	public Film() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Film(int id, String titolo, int anno, double rating) {
		super();
		this.id = id;
		this.titolo = titolo;
		this.anno = anno;
		this.rating = rating;
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public int getAnno() {
		return anno;
	}
	public void setAnno(int anno) {
		this.anno = anno;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Film [id=" + id + ", titolo=" + titolo + ", anno=" + anno + ", rating=" + rating + "]";
	}
	
	
	
}
