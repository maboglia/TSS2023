package it.bogliaccino.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.bogliaccino.dal.PrenotazioneDAO;
import it.bogliaccino.dal.ViaggioDAO;
import it.bogliaccino.entities.Prenotazione;
import it.bogliaccino.entities.Viaggio;

@Service
public class PrenotazioneServiceImpl implements PrenotazioneService {

	@Autowired
	private PrenotazioneDAO dao;
	
	@Autowired
	private ViaggioDAO viaggioDAO;
	
	
	@Override
	public Prenotazione addPrenotazione(Prenotazione p) {
		return dao.save(p);
	}

	@Override
	public List<Prenotazione> getPrenotazioni() {
		return dao.findAll();
	}

	@Override
	public List<Viaggio> getViaggi() {
		return viaggioDAO.findAll();
	}

	@Override
	public Viaggio getViaggioById(int id) {
		if (viaggioDAO.findById(id).isPresent())
			return viaggioDAO.findById(id).get();
		
		return null;
	}

}
