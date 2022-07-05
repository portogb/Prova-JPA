package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.entidades.Aluno;
import model.entidades.AlunoJPA;

public class TesteInserirJPA {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Aluno> alunos = new ArrayList<Aluno>();
		AlunoJPA alunoJpa = new AlunoJPA();

		int op = 1;
		while (op == 1) {

			System.out.println("Digite o nome do aluno: ");
			String nome = sc.nextLine();
			System.out.println("Digite o email: ");
			String email = sc.nextLine();
			System.out.println("Digite o CPF: ");
			long cpf = sc.nextLong();
			sc.nextLine();
			System.out.println("Digite a data de nascimento(dd/MM/yyyy): ");
			String data = sc.nextLine();
			System.out.println("Digite a naturalidade(UF): ");
			String naturalidade = sc.nextLine();
			System.out.println("Digite o endereco: ");
			String endereco = sc.nextLine();

			Aluno aluno = new Aluno(nome, email, cpf, data, naturalidade, endereco);
			alunos.add(aluno);

			alunoJpa.inserirAluno(aluno);

			System.out.println("Novo cadastro(1)/Sair(2)");
			op = sc.nextInt();
			sc.nextLine();
			if (op == 2) {
				System.out.println("saindo...");
			}
			
		}
		
		sc.close();
		alunoJpa.factory.close();
	}

}
