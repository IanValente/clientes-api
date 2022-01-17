package io.github.IanValente.clientes.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.IanValente.clientes.model.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

}
