package it.boglia.services;

import java.util.List;

import it.boglia.entities.ContoCorrente;

public interface ContoCorrenteService {
	
	List<ContoCorrente> getAllConti();
	ContoCorrente getContoCorrenteByNumero(String numeroConto);
}
