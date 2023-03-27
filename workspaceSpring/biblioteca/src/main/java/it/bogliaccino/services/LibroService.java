package it.bogliaccino.services;

import java.util.List;

import it.bogliaccino.entities.Libro;

public interface LibroService {

	List<Libro> getAll();
	Libro getLibroById(int id);
	
	void addLibro(Libro l);
	
}
