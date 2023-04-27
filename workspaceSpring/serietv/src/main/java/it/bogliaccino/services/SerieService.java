package it.bogliaccino.services;

import java.util.List;

import it.bogliaccino.entities.Serie;

public interface SerieService {

	List<Serie> getSerie();
	Serie getSerieById(int id);
	
	Serie addSerie(Serie s);
	
}
