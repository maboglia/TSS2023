package it.bogliaccino.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import it.bogliaccino.entities.Serie;

public interface SerieDAO extends JpaRepository<Serie, Integer> {

}
