package it.guidolin.services;

import java.util.List;

import it.guidolin.entities.Autore;
import it.guidolin.entities.Editore;
import it.guidolin.entities.Libro;

public interface BibliotecaService {
	
	List<Autore> getAutori();
	List<Editore> getEditori();
	List<Libro> getLibri();
	Libro addLibro(Libro l);

}
