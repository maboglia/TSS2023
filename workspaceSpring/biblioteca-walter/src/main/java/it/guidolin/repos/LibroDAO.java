package it.guidolin.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import it.guidolin.entities.Libro;

public interface LibroDAO extends JpaRepository<Libro, Integer> {

}
