package it.bogliaccino.services;

import java.util.List;

import it.bogliaccino.entities.Viaggio;

public interface ViaggioService {

	String MESSAGGIO = "NON DISPONIBILE";
	
	Viaggio addViaggio(Viaggio v);
	Viaggio updateViaggio(Viaggio v);
	void deleteViaggio(Viaggio v);
	
	List<Viaggio> getViaggi();
	Viaggio getViaggioById(int id);
	
}
