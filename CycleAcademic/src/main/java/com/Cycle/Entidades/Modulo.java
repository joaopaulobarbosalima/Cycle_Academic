package com.Cycle.Entidades;

import java.util.List;

import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table (name = "MODULOS")
public class Modulo extends EntidadeAbstrata<Long> {
	
	@OneToMany (mappedBy = "modulo")
	private List<Disciplina> disciplinas;
	
	@ManyToOne
	@JoinColumn (name = "grade_id_fk")
	private Grade grade;
	

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	public Grade getGrade() {
		return grade;
	}

	public void setGrade(Grade grade) {
		this.grade = grade;
	}
	
	
	

}
