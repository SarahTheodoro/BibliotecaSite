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

import com.sesisenai.biblioteca.entity.emprestimo;
import com.sesisenai.biblioteca.repositories.EmprestimoRepository;

@RestController
@RequestMapping("emprestimo")
public class emprestimoController {

	@Autowired
	private EmprestimoRepository tb_emprestimo;

	@GetMapping
	public List<emprestimo> findAll() {
		List<emprestimo> listaLivro = tb_emprestimo.findAll();
		return listaLivro;
	}

	@GetMapping(value = "/{id}")
	public emprestimo findById(@PathVariable Long id) {
		return tb_emprestimo.findById(id).get();
	}

	@PostMapping
	public emprestimo insert(@RequestBody emprestimo obj) {
		return obj = tb_emprestimo.save(obj);

	}

	@DeleteMapping(value = "/{id}")
	public void delete(@PathVariable Long id) {
		tb_emprestimo.deleteById(id);
	}
	
	
}

