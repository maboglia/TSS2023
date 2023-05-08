package it.bogliaccino.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.bogliaccino.dal.ViaggioDAO;
import it.bogliaccino.entities.Viaggio;

@Service
public class ViaggioServiceImpl implements ViaggioService {

	@Autowired
	private ViaggioDAO dao;
	
	@Override
	public Viaggio addViaggio(Viaggio v) {
		return dao.save(v);
	}

	@Override
	public Viaggio updateViaggio(Viaggio v) {
		return dao.save(v);
	}

	@Override
	public void deleteViaggio(Viaggio v) {
		dao.delete(v);
	}

	@Override
	public List<Viaggio> getViaggi() {
		return dao.findAll();
	}

	@Override
	public Viaggio getViaggioById(int id) {
		return dao.getReferenceById(id);
	}

}
