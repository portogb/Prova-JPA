package model.service;

import java.util.List;

import model.entidades.Aluno;

public interface InterfaceActions {
	
	void atualizarAluno(Aluno obj);
	void deletar(Integer id);
	void inserirAluno(Aluno obj);
	Aluno buscarAluno(Integer id);
	List <Aluno> listarAluno();
	List <Aluno> filtrarPorLetra(String letra);
}
