package it.boglia.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import it.boglia.entities.ContoCorrente;

public interface ContoCorrenteDAO extends JpaRepository<ContoCorrente, Integer> {

	ContoCorrente findByNumeroConto(String numeroConto);

}
