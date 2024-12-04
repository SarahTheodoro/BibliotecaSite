package com.sesisenai.biblioteca.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_livro")

public class Livro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Long id_livro;

	@Column(name = "nome")
	private String nome;

	@Column(name = "categoria")
	private String categoria;

	@Column(name = "codigo")
	private int codigo;

	@Column(name = "alugado")
	private boolean alugado;
	
	@Column(name = "descricao")
	private String descricao;
	
	@Column(name = "imagem")
	private String imagem;

	public Livro() {
	}

	public Livro(Long id_livro, String nome, String categoria, int codigo, boolean alugado, String descricao,
			String imagem) {
		this.id_livro = id_livro;
		this.nome = nome;
		this.categoria = categoria;
		this.codigo = codigo;
		this.alugado = alugado;
		this.descricao = descricao;
		this.imagem = imagem;
	}

	public boolean isAlugado() {
		return alugado;
	}

	public void setAlugado(boolean alugado) {
		this.alugado = alugado;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}

	public Long getId_livro() {
		return id_livro;
	}

	public void setId_livro(Long id_livro) {
		this.id_livro = id_livro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

}
