package it.guidolin.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import it.guidolin.entities.Autore;

public interface AutoreDAO extends JpaRepository<Autore, Integer> {

}
