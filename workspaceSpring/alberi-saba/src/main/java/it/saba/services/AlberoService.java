package it.saba.services;

import java.util.List;

import it.saba.entities.Albero;

public interface AlberoService {
	
	List<Albero> getAlberi();
	Albero getAlberoById(int id);
	Albero addAlbero(Albero a);
	Albero updateAlbero(Albero a);
	void deleteAlbero(int id);
	

}
