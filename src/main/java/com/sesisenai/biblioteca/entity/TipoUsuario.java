package com.sesisenai.biblioteca.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_tipousuario")

public class TipoUsuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_tipo;

	@Column(name = "nome_usuario")
	private String nome_usuario;

	public Long getId_tipo() {
		return id_tipo;
	}

	public void setId_tipo(Long id_tipo) {
		this.id_tipo = id_tipo;
	}

	public String getNome_usuario() {
		return nome_usuario;
	}

	public void setNome_usuario(String nome_usuario) {
		this.nome_usuario = nome_usuario;
	}

}
