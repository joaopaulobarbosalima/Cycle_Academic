package com.Cycle.Service;

import java.util.List;

import com.Cycle.Entidades.Aluno;

public interface AlunoService {
	
	void salvar (Aluno aluno);
	
	void editar (Aluno aluno);
	
	void excluir (long id);
	
	Aluno buscarPorId (Long id);
	
	List<Aluno> buscarTodos ();

}
