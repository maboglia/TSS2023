package it.bogliaccino.dal;

import org.springframework.data.jpa.repository.JpaRepository;

import it.bogliaccino.entities.Viaggio;

public interface ViaggioDAO extends JpaRepository<Viaggio, Integer> {

}
