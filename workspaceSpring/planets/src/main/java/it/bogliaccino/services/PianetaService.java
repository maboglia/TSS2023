package it.bogliaccino.services;

import java.util.List;

import it.bogliaccino.entities.Pianeta;

public interface PianetaService {

	List<Pianeta> getPianeti();
	Pianeta getPianetaById(int id);
	
	Pianeta addPianeta(Pianeta p);
	Pianeta updatePianeta(Pianeta p);
	void deletePianeta(int id);
	
	
}
