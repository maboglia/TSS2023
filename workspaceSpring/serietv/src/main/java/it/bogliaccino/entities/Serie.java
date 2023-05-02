package it.bogliaccino.entities;

import java.util.List;
import java.util.Set;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

@Entity
public class Serie {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String titolo;
	private String locandina;
	private double rating;
	@Column(length = 4096)
	private String descrizione;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(
			name = "serie_genere",
			joinColumns = @JoinColumn(name= "serie_id", referencedColumnName = "id"),
			inverseJoinColumns = @JoinColumn(name = "genere_id", referencedColumnName = "id")
			)
	private Set<Genere> genere;
	
	
	public Set<Genere> getGenere()
	{
		return genere;
	}
	public void setGenere(Set<Genere> genere)
	{
		this.genere = genere;
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
	public String getLocandina() {
		return locandina;
	}
	public void setLocandina(String locandina) {
		this.locandina = locandina;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	
	
}
