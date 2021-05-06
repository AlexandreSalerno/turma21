/*
 * 4) Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.
 */

package lista2;

import java.util.Locale;
import java.util.Scanner;

public class Tarefa4 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.print("Insira um número: ");
		numero = sc.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("Par.");
			System.out.println(Math.sqrt(numero));
		}
		else {
			System.out.println("Ímpar.");
			System.out.println(Math.pow(numero, 2.0));
		}
		
		sc.close();
	}
}
