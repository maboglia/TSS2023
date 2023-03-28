package it.bogliaccino.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.bogliaccino.entities.Game;
import it.bogliaccino.repos.GameDAO;

@Service
public class GameServiceImpl implements GameService {

	@Autowired
	private GameDAO dao;
	
	
	@Override
	public List<Game> getAll() {
		
		return dao.findAll();
	}

	@Override
	public List<Game> getAllByYear(int year) {
		
		return getAll()
				.stream()
				.filter(g -> g.getYear()==year)
				.toList();
	}

	@Override
	public List<Game> getAllByPublisher(String publisher) {
		
		return dao.findByPublisherContaining(publisher);
	}

}
