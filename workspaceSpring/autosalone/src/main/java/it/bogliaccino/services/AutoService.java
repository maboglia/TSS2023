package it.bogliaccino.services;

import java.util.List;

import org.springframework.stereotype.Service;

import it.bogliaccino.model.Auto;

@Service
public interface AutoService {

	List<Auto> trovaTutti();
	Auto aggiungiUno(Auto a);

	
}
