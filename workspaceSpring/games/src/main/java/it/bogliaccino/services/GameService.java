package it.bogliaccino.services;

import java.util.List;

import it.bogliaccino.entities.Game;

public interface GameService {

	List<Game> getAll();
	List<Game> getAllByYear(int year);
	List<Game> getAllByPublisher(String publisher);
}
