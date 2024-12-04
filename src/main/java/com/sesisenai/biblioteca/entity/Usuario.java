package com.sesisenai.biblioteca.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;



	@Entity 
	@Table(name="tb_usuario")

	public class Usuario {

		
		@Id 
		@GeneratedValue( strategy = GenerationType.IDENTITY)
		
		private Long id_usuario;
		
		@Column(name="nome")
		private String nome;
		
		@Column(name="email")
		private String email; 
		
		@Column(name="cpf")
		private Double cpf;
		
		@Column(name="telefone")
		private int telefone;

		@ManyToOne
		@JoinColumn (name = "TIPO_id_tipo")
		private TipoUsuario id_tipo;

		public Long getId_usuario() {
			return id_usuario;
		}

		public void setId_usuario(Long id_usuario) {
			this.id_usuario = id_usuario;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public Double getCpf() {
			return cpf;
		}

		public void setCpf(Double cpf) {
			this.cpf = cpf;
		}

		public int getTelefone() {
			return telefone;
		}

		public void setTelefone(int telefone) {
			this.telefone = telefone;
		}

		public TipoUsuario getId_tipo() {
			return id_tipo;
		}

		public void setId_tipo(TipoUsuario id_tipo) {
			this.id_tipo = id_tipo;
		}

		
		
		
		
	}	
	
	
