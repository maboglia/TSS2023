package it.boglia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.boglia.entities.Bollettino;
import it.boglia.repos.BollettinoDAO;

@Service
public class BollettinoServiceImpl implements BollettinoService {

	@Autowired
	private BollettinoDAO dao;
	
	@Override
	public List<Bollettino> getAllBollettini() {
		return dao.findAll();
	}

	@Override
	public Bollettino getBollettinoById(int id) {
		return dao.findById(id).get();
	}

	@Override
	public Bollettino addBollettino(Bollettino b) {
		return dao.save(b);
	}

}
