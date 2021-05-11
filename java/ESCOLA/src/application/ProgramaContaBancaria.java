package application;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

import entities.ContaBancaria;

public class ProgramaContaBancaria {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Random gerador = new Random();
		
		System.out.println("CADASTRO DE CONTA BANCÁRIA");
		int numero = gerador.nextInt(9999);
		System.out.print("Informe a agência: ");
		String agencia = sc.nextLine();
		System.out.print("Informe seu nome: ");
		String titulo = sc.nextLine();
		System.out.print("Insira o tipo de conta (1 - Conta Conjunta / 2 - Conta Corrente / 3 - Conta Poupança / 4 - Conta Salário): ");
		char tipo = sc.next().toUpperCase().charAt(0);
		System.out.print("Insira o deposito inicial: ");
		double saldo = sc.nextDouble();
		
		ContaBancaria conta = new ContaBancaria(numero, agencia, titulo, tipo, saldo);
		
		char op = ' ';
		while (op != '4') {
			System.out.println();
			System.out.println("================ MENU ================");
			System.out.println("1 - VISUALIZAR SALDO");
			System.out.println("2 - DEPOSITAR");
			System.out.println("3 - SACAR");
			System.out.println("4 - IMPRIMIR DADOS E SAIR");
			System.out.print("ESCOLHA A OPÇÃO DESEJADA: ");
			op = sc.next().charAt(0);
			System.out.println();
			
			switch (op) {
				case '1':
					System.out.println("SALDO ATUAL: " + conta.getSaldo());
					break;
				case '2':
					System.out.print("INSIRA O VALOR A SER DEPOSITADO: ");
					conta.depositar(sc.nextDouble());
					break;
				case '3':
					System.out.print("INSIRA O VALOR A SER SACADO: ");
					conta.sacar(sc.nextDouble());
					break;
				case '4':
					conta.imprimirDados();
					System.out.println("\nFIM DE PROGRAMA.");
					break;
				default:
					System.out.println("ESCOLHA UMA OPÇÃO VÁLIDA.");
					break;
			}
		}
		
		sc.close();
	}
}
