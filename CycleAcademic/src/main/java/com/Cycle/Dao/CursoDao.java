package com.Cycle.Dao;

import java.util.List;
import com.Cycle.Entidades.Curso;

public interface CursoDao {

	void save (Curso curso);
	
	void update (Curso curso);
	
	void delete (Long id);
	
	Curso findById (Long id);
	
	List<Curso> findAll();


}
