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

import com.sesisenai.biblioteca.entity.TipoUsuario;
import com.sesisenai.biblioteca.repositories.TipoUsuarioRepository;

@RestController
@RequestMapping("/tipousuario")
public class TipoUsuarioController {

	@Autowired
	private TipoUsuarioRepository tb_tipousuario;

	@GetMapping
	public List<TipoUsuario> findAll() {
		List<TipoUsuario> listaTipoUsuario = tb_tipousuario.findAll();
		return listaTipoUsuario;
	}

	@GetMapping(value = "/{id}")
	public TipoUsuario findById(@PathVariable Long id) {
		return tb_tipousuario.findById(id).get();
	}

	@PostMapping
	public TipoUsuario insert(@RequestBody TipoUsuario obj) {
		return obj = tb_tipousuario.save(obj);

	}

	@DeleteMapping(value = "/{id}")
	public void delete(@PathVariable Long id) {
		tb_tipousuario.deleteById(id);
	}

}
