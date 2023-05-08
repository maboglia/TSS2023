package it.bogliaccino.services;

import java.util.List;

import it.bogliaccino.entities.Prenotazione;
import it.bogliaccino.entities.Viaggio;

public interface PrenotazioneService {

	
	Prenotazione addPrenotazione(Prenotazione p);
	List<Prenotazione> getPrenotazioni();

	List<Viaggio> getViaggi();
	Viaggio getViaggioById(int id);
	
	
}
