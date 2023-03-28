package it.bogliaccino.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import it.bogliaccino.entities.Game;

public interface GameDAO extends JpaRepository<Game, Integer> {

	List<Game> findByPublisherContaining(String publisher);
	
}
