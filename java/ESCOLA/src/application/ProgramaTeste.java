package application;

import java.util.Scanner;

import entities.Basico;

public class ProgramaTeste {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o nome do aluno: ");
		String nome = leia.next().toUpperCase();
		System.out.print("Digite o número da matrícula: ");
		int matricula = leia.nextInt();
		System.out.print("Digite o CPF: ");
		String cpf = leia.next();
		System.out.print("Digite o dia de aniversário: ");
		int dia = leia.nextInt();
		System.out.print("Digite a nota inicial: ");
		double pontos = leia.nextDouble();
		
		//Basico aluno1 = new Basico(matricula, cpf, dia);
		
		//aluno1.setNome(nome);
		//aluno1.adicionarNota(pontos);
		
		//System.out.printf("PONTOS ATUAIS DO ALUNO %s = %.0f \n", aluno1.getNome(), aluno1.getPontos());
		System.out.print("Digite o dia atual: ");
		int diaAtual = leia.nextInt();
		//aluno1.bonusAniversario(diaAtual);
		//System.out.printf("PONTOS APÓS MÉTODO DO ALUNO %s = %.0f \n", aluno1.getNome(), aluno1.getPontos());
		
		leia.close();
	}
}
