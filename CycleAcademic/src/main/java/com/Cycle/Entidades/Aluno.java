package com.Cycle.Entidades;

import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table (name = "ALUNOS")
public class Aluno extends EntidadeAbstrata<Long> {
	
	@Column (name = "nome", nullable = false, unique = true)
	private String nome;
	
	@Column (nullable = false, unique = true)
	private String email;
	
	@Column (nullable = false, unique = true)
	private String senha;
	
	@ManyToOne
	@JoinColumn (name = "curso_id_fk")
	private Curso curso;

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

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	
	

}
