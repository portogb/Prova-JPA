package aplicacao;

import java.util.Scanner;

import model.entidades.Aluno;
import model.entidades.AlunoJPA;

public class TesteDeletarAluno {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Qual id do aluno deseja remover?");
		int id = sc.nextInt();
		sc.nextLine();

		AlunoJPA alunoJpa = new AlunoJPA ();
		Aluno aluno = alunoJpa.buscarAluno(id);

		alunoJpa.deletar(id);
		System.out.println("Aluno deletado com sucesso!");

		sc.close();
		alunoJpa.factory.close();

	}

}
