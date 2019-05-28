package com.Cycle.Dao;

import java.util.List;

import com.Cycle.Entidades.Disciplina;

public interface DisciplinaDao {
void save (Disciplina disciplina);
	
	void update (Disciplina disciplina);
	
	void delete (Long id);
	
	Disciplina findById (Long id);
	
	List<Disciplina> findAll();


}
