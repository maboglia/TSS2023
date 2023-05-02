package it.bogliaccino.services;

import java.util.List;

import it.bogliaccino.entities.Genere;
import it.bogliaccino.entities.Serie;

public interface SerieService {

	List<Serie> getSerie();
	Serie getSerieById(int id);
	
	Serie addSerie(Serie s);
	
	Genere addGenere(Genere g);
	
	List<Genere> addGeneri(List<Genere> lista);
	
	List<Genere> getGeneri();
}
