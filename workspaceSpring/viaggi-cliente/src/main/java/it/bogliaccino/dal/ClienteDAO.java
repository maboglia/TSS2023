package it.bogliaccino.dal;

import org.springframework.data.jpa.repository.JpaRepository;

import it.bogliaccino.entities.Cliente;

public interface ClienteDAO extends JpaRepository<Cliente, Integer> {

}
