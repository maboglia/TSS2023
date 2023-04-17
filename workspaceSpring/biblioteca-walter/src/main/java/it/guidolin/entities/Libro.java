package it.guidolin.entities;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "libri")
public class Libro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String titolo;
	private double prezzo;
	
	@ManyToMany
	@JoinTable(name = "relazione_libri_autori", 
				joinColumns = {		
						@JoinColumn(name = "libro_id")
				},
				inverseJoinColumns = {
						@JoinColumn(name = "autore_id")
				}
			)
	private Set<Autore> autori = new HashSet<>();
	
	@OneToOne
	@JoinColumn(name = "editore_id")
	private Editore editore;
	
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
	
	public double getPrezzo() {
		return prezzo;
	}
	
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	
	public Set<Autore> getAutori() {
		return autori;
	}

	public void setAutori(Set<Autore> autori) {
		this.autori = autori;
	}

	public Editore getEditore() {
		return editore;
	}
	
	public void setEditore(Editore editore) {
		this.editore = editore;
	}

}
