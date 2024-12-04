package com.sesisenai.biblioteca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sesisenai.biblioteca.entity.Livro;


public interface LivroRepository extends JpaRepository <Livro,Long>{

}
