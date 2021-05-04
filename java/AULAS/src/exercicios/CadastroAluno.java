/*
  nome
  anodenascimento
  M MASCULINO - F feminina - O - OUTRO
  nome - idade da pessoa e código do tipo M/F/O
 */

package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class CadastroAluno {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		final int ANO_ATUAL = 2021;
		String nome;
		int anoDeNascimento;
		char genero;
		
		System.out.print("Informe seu nome: ");
		nome = leia.next();
		
		System.out.print("Informe seu ano de nascimento: ");
		anoDeNascimento = ANO_ATUAL - leia.nextInt();
		
		System.out.print("Como você se identifica? (M/F/O): ");
		genero = leia.next().toUpperCase().charAt(0);
		
		System.out.println(nome + " - " + anoDeNascimento + " - " + genero);
		
		leia.close();
	}
}
