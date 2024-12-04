package com.sesisenai.biblioteca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sesisenai.biblioteca.entity.TipoUsuario;

public interface TipoUsuarioRepository extends JpaRepository <TipoUsuario,Long> {
	
	
}
