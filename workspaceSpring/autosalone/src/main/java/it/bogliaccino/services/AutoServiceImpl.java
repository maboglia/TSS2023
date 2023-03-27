package it.bogliaccino.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.bogliaccino.model.Auto;
import it.bogliaccino.repos.AutoDAO;

@Service
public class AutoServiceImpl implements AutoService {

	@Autowired
	private AutoDAO dao;
	
	@Override
	public List<Auto> trovaTutti() {
		return dao.findAll();
	}

	@Override
	public Auto aggiungiUno(Auto a) {
		return dao.save(a);
	}

}
