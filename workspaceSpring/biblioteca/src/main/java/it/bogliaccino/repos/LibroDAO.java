package it.bogliaccino.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.bogliaccino.entities.Libro;

@Repository
public interface LibroDAO extends JpaRepository<Libro, Integer> {

}
