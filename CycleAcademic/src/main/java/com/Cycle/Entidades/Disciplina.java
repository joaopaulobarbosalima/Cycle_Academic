package com.Cycle.Entidades;

import javax.persistence.*;

import com.Cycle.Entidades.Tipo.Tipo;

@SuppressWarnings("serial")
@Entity
@Table (name = "DISCIPLINAS")
public class Disciplina extends EntidadeAbstrata<Long> {
	
	@Column (name = "nome", nullable = false, unique = true, length = 60)
	private String nome;
	
	@ManyToOne
	@JoinColumn (name = "modulo_id_fk")
	private Modulo modulo;
	
	@Column (nullable = false, length = 20)
	@Enumerated (EnumType.STRING)
	private Tipo tipo;
	
	@Column
	private Integer cargaHoraria;
	
	@Column
	private String emenda;
	
	@Column
	private String objetivos; 
	
	@Column
	private String conteudo;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Modulo getModulo() {
		return modulo;
	}

	public void setModulo(Modulo modulo) {
		this.modulo = modulo;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public Integer getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(Integer cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public String getEmenda() {
		return emenda;
	}

	public void setEmenda(String emenda) {
		this.emenda = emenda;
	}

	public String getObjetivos() {
		return objetivos;
	}

	public void setObjetivos(String objetivos) {
		this.objetivos = objetivos;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	
	
	
	
	

}
