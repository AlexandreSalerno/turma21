/*
 * 3) Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
categoria ela se encontra:
 10-14 infantil
 15-17 juvenil
 18-25 adulto
 */

package lista2;

import java.util.Locale;
import java.util.Scanner;

public class Tarefa3 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int idade;
		
		System.out.print("Insira sua idade: ");
		idade = sc.nextInt();
		
		if (idade >= 10 && idade <= 14) {
			System.out.println("Categoria: infantil.");
		}
		else if (idade >= 15 && idade <= 17) {
			System.out.println("Categoria: juvenil.");
		}
		else if (idade >= 18 && idade <= 25) {
			System.out.println("Categoria: adulto.");
		}
		else {
			System.out.println("Não se encaixa em nenhuma categoria.");
		}
		
		sc.close();
	}
}
