package aplicacao;

import java.util.Scanner;

import model.entidades.Aluno;
import model.entidades.AlunoJPA;

public class TesteAtualizarAluno {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o id que deseja altear: ");
		int id = sc.nextInt();
		sc.nextLine();

		AlunoJPA alunoJpa = new AlunoJPA();
		Aluno aluno = alunoJpa.buscarAluno(id);

		System.out.println(aluno.toString());

		System.out.println("Informe o dado que deseja alterar: ");
		System.out.println("1 - (nome), 2 - (email), 3 - (endereco)");
		int op = sc.nextInt();
		sc.nextLine();

		switch (op) {

		case 1: {
			System.out.println("Digite o novo nome: ");
			aluno.setNome(sc.nextLine());
			System.out.println("Nome alterado!");
		}
			break;

		case 2: {
			System.out.println("Digite um novo email: ");
			aluno.setEmail(sc.nextLine());
			System.out.println("Email alterado!");
		}
			break;

		case 3: {
			System.out.println("Digite um novo endereco: ");
			aluno.setEndereco(sc.nextLine());
			System.out.println("Endereco alterado!");
		}
			break;
		default:
			System.out.println("Opcao invalida, escolha uma opcao entre 1 e 3");
		}

		alunoJpa.atualizarAluno(aluno);
		System.out.println("------------------");
		System.out.println("Cadastro atualizado: ");
		System.out.println(aluno.toString());

		sc.close();
		alunoJpa.factory.close();
	}

}
