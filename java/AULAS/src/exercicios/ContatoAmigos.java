package exercicios;

import java.util.Locale;
import java.util.Scanner;

import entidades.Pessoa;

public class ContatoAmigos {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		Pessoa pessoa = new Pessoa();
		
		char estado = ' ';
		
		System.out.print("Insira o nome do amigo: ");
		pessoa.nome = leia.nextLine();
		System.out.print("Insira o ano de nascimento do amigo: ");
		pessoa.anoNascimento = leia.nextInt();
		System.out.print("Insira o genero do amigo (F/M/O): ");
		pessoa.genero = leia.next().toUpperCase().charAt(0);
		System.out.print("O amigo está vivo? (1 - Sim / 2 - Não): ");
		estado = leia.next().charAt(0);
		
		if (estado == '1') {
			pessoa.vivo = true;
		}
		else {
			pessoa.vivo = false;
		}
		
		System.out.println();
		System.out.println("Seu amigo se chama " + pessoa.nome);
		pessoa.idadeAproximada();
		System.out.println("Genero: " + pessoa.genero);
		if (pessoa.vivo) {
			System.out.println("Seu amigo está vivo!");
		}
		else {
			System.out.println("Seu amigo não está vivo..");
		}
		
		leia.close();
	}
}
