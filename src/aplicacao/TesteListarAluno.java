package aplicacao;

import java.util.List;

import model.entidades.Aluno;
import model.entidades.AlunoJPA;

public class TesteListarAluno {

	public static void main(String[] args) {
		
		AlunoJPA alunoJpa = new AlunoJPA();
		
		List<Aluno> alunos = alunoJpa.listarAluno();
		
		for (Aluno aluno : alunos) {
			System.out.println("-----------------------------");
			System.out.println("ID: " + aluno.getId());
			System.out.println("Nome: " + aluno.getNome());
			System.out.println("Email: " + aluno.getEmail());
			System.out.println("cpf: " + aluno.getCpf());
			System.out.println("Data: " + aluno.getDataDeNascimento());
			System.out.println("Naturalidade: " + aluno.getNaturalidade());
			System.out.println("Endereco: " + aluno.getEndereco());
		}

		alunoJpa.factory.close();
	}

}
