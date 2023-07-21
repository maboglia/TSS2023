package it.boglia.services;

import java.util.List;

import it.boglia.entities.Bollettino;

public interface BollettinoService {

	List<Bollettino> getAllBollettini();
	Bollettino getBollettinoById(int id);
	
	Bollettino addBollettino(Bollettino b);
	
	
}
