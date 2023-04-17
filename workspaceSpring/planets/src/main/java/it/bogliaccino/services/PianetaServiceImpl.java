package it.bogliaccino.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.bogliaccino.entities.Pianeta;
import it.bogliaccino.repos.PianetaDAO;

@Service
public class PianetaServiceImpl implements PianetaService {

	@Autowired
	private PianetaDAO dao;
	
	@Override
	public List<Pianeta> getPianeti() {
		return dao.findAll();
	}

	@Override
	public Pianeta getPianetaById(int id) {
		return dao.getReferenceById(id);
	}

	@Override
	public Pianeta addPianeta(Pianeta p) {
		return dao.save(p);
	}

	@Override
	public Pianeta updatePianeta(Pianeta p) {
		return dao.save(p);
	}

	@Override
	public void deletePianeta(int id) {
		dao.deleteById(id);

	}

}
