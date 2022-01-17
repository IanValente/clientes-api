package io.github.IanValente.clientes.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.IanValente.clientes.model.entity.Cliente;


public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
