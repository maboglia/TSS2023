package it.boglia.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import it.boglia.entities.Bollettino;

public interface BollettinoDAO extends JpaRepository<Bollettino, Integer> {

}
