package com.Cycle.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Cycle.Entidades.Aluno;
import com.Cycle.Service.AlunoService;

@Controller
@RequestMapping("/aluno")
public class CadastroAlunoController {
	
	@Autowired
	private AlunoService service;
	
	@GetMapping("/cadastrar")
	public String cadastrar(Aluno aluno) {
		return "Aluno/cadastroAluno";
	}
	
	@PostMapping("/salvar")
	public String salvar(Aluno aluno) {
		service.salvar(aluno);
		return "Aluno/cadastroAluno";
		
	}

}
