package com.Cycle.Entidades;

import java.util.List;

import javax.persistence.*;

import com.Cycle.Entidades.Tipo.Tipo;

@SuppressWarnings("serial")
@Entity
@Table(name = "CURSOS")
public class Curso extends EntidadeAbstrata<Long> {
	
	@Column (name = "nome", nullable = false, unique = true, length = 60)
	private String nome;
	
	@OneToMany (mappedBy = "curso")
	private List<Aluno> alunos;
	
	@Column (nullable = false, length = 20)
	@Enumerated (EnumType.STRING)
	private Tipo tipo;
	
	@Column (nullable = false)
	private Integer cargaHoraria;
	
	@OneToMany (mappedBy = "curso")
	private List<Grade> grades;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public List<Grade> getGrades() {
		return grades;
	}

	public void setGrades(List<Grade> grades) {
		this.grades = grades;
	}
	
	
	
	
	


}
