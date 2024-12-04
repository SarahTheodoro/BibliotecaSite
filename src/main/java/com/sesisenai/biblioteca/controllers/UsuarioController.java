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

import com.sesisenai.biblioteca.entity.Usuario;
import com.sesisenai.biblioteca.repositories.UsuarioRepository;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

	@Autowired
	private UsuarioRepository tb_usuario;

	@GetMapping
	public List<Usuario> findAll() {
		List<Usuario> listaUsuario = tb_usuario.findAll();
		return listaUsuario;
	}

	@GetMapping(value = "/{id}")
	public Usuario findById(@PathVariable Long id) {
		return tb_usuario.findById(id).get();
	}

	@PostMapping
	public Usuario insert(@RequestBody Usuario obj) {
		return obj = tb_usuario.save(obj);

	}

	@DeleteMapping(value = "/{id}")
	public void delete(@PathVariable Long id) {
		tb_usuario.deleteById(id);
	}
	
	
}
