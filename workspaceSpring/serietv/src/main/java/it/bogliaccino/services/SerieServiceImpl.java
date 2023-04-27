package it.bogliaccino.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.bogliaccino.entities.Serie;
import it.bogliaccino.repos.SerieDAO;

@Service
public class SerieServiceImpl implements SerieService {

	@Autowired
	private SerieDAO dao;
	
	
	@Override
	public List<Serie> getSerie() {
		return dao.findAll();
	}

	@Override
	public Serie getSerieById(int id) {
		return dao.getReferenceById(id);
	}

	@Override
	public Serie addSerie(Serie s) {
		return dao.save(s);
	}

}
