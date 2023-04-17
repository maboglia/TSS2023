package it.bogliaccino.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import it.bogliaccino.entities.Pianeta;

public interface PianetaDAO extends JpaRepository<Pianeta, Integer> {

}
