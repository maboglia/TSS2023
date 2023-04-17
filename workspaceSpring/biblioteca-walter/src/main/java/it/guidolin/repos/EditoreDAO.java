package it.guidolin.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import it.guidolin.entities.Editore;

public interface EditoreDAO extends JpaRepository<Editore, Integer> {

}
