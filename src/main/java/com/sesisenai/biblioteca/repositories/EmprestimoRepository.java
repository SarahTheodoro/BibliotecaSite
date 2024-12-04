package com.sesisenai.biblioteca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sesisenai.biblioteca.entity.emprestimo;


public interface EmprestimoRepository extends JpaRepository <emprestimo,Long> {
	
	
}

