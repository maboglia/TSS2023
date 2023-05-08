package it.bogliaccino.entities;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="prenotazioni")
public class Prenotazione {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private LocalDate dataViaggio;
	private int viaggiatori;
	
	@OneToOne
	private Cliente cliente;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getDataViaggio() {
		return dataViaggio;
	}

	public void setDataViaggio(LocalDate dataViaggio) {
		this.dataViaggio = dataViaggio;
	}

	public int getViaggiatori() {
		return viaggiatori;
	}

	public void setViaggiatori(int viaggiatori) {
		this.viaggiatori = viaggiatori;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Prenotazione [id=" + id + ", dataViaggio=" + dataViaggio + ", viaggiatori=" + viaggiatori + ", cliente="
				+ cliente + "]";
	}
	
	
}
