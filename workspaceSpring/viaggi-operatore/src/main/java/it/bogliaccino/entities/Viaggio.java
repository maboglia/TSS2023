package it.bogliaccino.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="viaggi")
public class Viaggio {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String destinazione;
	private int giorni;
	private double prezzo;
	
	private String percorsoFile;
	
	
	public String getPercorsoFile() {
		return percorsoFile;
	}
	public void setPercorsoFile(String percorsoFile) {
		this.percorsoFile = percorsoFile;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDestinazione() {
		return destinazione;
	}
	public void setDestinazione(String destinazione) {
		this.destinazione = destinazione;
	}
	public int getGiorni() {
		return giorni;
	}
	public void setGiorni(int giorni) {
		this.giorni = giorni;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	@Override
	public String toString() {
		return "Viaggio [id=" + id + ", destinazione=" + destinazione + ", giorni=" + giorni + ", prezzo=" + prezzo
				+ "]";
	}
	
	
	
	
}
