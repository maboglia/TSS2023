package it.boglia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.boglia.entities.ContoCorrente;
import it.boglia.repos.ContoCorrenteDAO;

@Service
public class ContoCorrenteServiceImpl implements ContoCorrenteService {

	@Autowired
	private ContoCorrenteDAO dao;
	
	@Override
	public List<ContoCorrente> getAllConti() {
		return dao.findAll();
	}

	@Override
	public ContoCorrente getContoCorrenteByNumero(String numeroConto) {
		return dao.findByNumeroConto(numeroConto);
	}

}
