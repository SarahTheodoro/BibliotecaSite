package com.sesisenai.biblioteca.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sesisenai.biblioteca.entity.Livro;
import com.sesisenai.biblioteca.repositories.LivroRepository;

@RestController
@RequestMapping("livro")
public class LivroController {

	@Autowired
	private LivroRepository tb_livro;

	@GetMapping
	public List<Livro> findAll() {
		List<Livro> listaLivro = tb_livro.findAll();
		return listaLivro;
	}

	@GetMapping(value = "/{id}")
	public Livro findById(@PathVariable Long id) {
		return tb_livro.findById(id).get();
	}

	@PostMapping
	public Livro insert(@RequestBody Livro obj) {
		return obj = tb_livro.save(obj);

	}

	@DeleteMapping(value = "/{id}")
	public void delete(@PathVariable Long id) {
		tb_livro.deleteById(id);
	}
	
	
}
