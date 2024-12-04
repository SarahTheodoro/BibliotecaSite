package com.sesisenai.biblioteca.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;


@Entity 
@Table(name="tb_emprestimo")


public class emprestimo {


		@Id 
		@GeneratedValue( strategy = GenerationType.IDENTITY)
		
		private Long id_emprestimo;
		
		@Column(name="dataEmprestimo")
		private LocalDate dataEmprestimo;
		
		@Column(name="dataDevolucao")
		private LocalDate dataDevolucao;
		
		@OneToOne
		@JoinColumn (name = "ALUNO_id_aluno")
		private Usuario id_aluno;

		@ManyToOne
		@JoinColumn (name = "LIVRO_id_livro")
		private Livro id_livro;

		public Long getId_emprestimo() {
			return id_emprestimo;
		}

		public void setId_emprestimo(Long id_emprestimo) {
			this.id_emprestimo = id_emprestimo;
		}

		public LocalDate getDataEmprestimo() {
			return dataEmprestimo;
		}

		public void setDataEmprestimo(LocalDate dataEmprestimo) {
			this.dataEmprestimo = dataEmprestimo;
		}

		public LocalDate getDataDevolucao() {
			return dataDevolucao;
		}

		public void setDataDevolucao(LocalDate dataDevolucao) {
			this.dataDevolucao = dataDevolucao;
		}

		public Usuario getId_aluno() {
			return id_aluno;
		}

		public void setId_aluno(Usuario id_aluno) {
			this.id_aluno = id_aluno;
		}

		public Livro getId_livro() {
			return id_livro;
		}

		public void setId_livro(Livro id_livro) {
			this.id_livro = id_livro;
		}
		
		

	
	
}
