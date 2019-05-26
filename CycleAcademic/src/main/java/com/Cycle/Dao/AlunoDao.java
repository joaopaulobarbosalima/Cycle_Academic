package com.Cycle.Dao;

import java.util.List;

import com.Cycle.Entidades.Aluno;

public interface AlunoDao {
	
	void save (Aluno aluno);
	
	void update (Aluno aluno);
	
	void delete (Long id);
	
	Aluno findById (Long id);
	
	List<Aluno> findAll();

}
