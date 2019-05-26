package com.Cycle.Entidades;

import java.util.List;

import javax.persistence.*;


@SuppressWarnings("serial")
@Entity
@Table (name= "GRADES")
public class Grade extends EntidadeAbstrata<Long> {
	
	@Column (nullable = false, unique = true, length = 20)
	private String semestre;
	
	@ManyToOne
	@JoinColumn (name = "id_curso_fk")
	private Curso curso;
	
	@OneToMany (mappedBy = "grade")
	private List<Modulo> modulos;

	public String getSemestre() {
		return semestre;
	}

	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	

}
