/*
 * 1) Fa�a um programa que possua um vetor denominado A que armazene 6 n�meros
inteiros. O programa deve executar os seguintes passos:
(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7.
(b) Armazene em uma vari�vel inteira (simples) a soma entre os valores das posi��es
A[0], A[1] e A[5] do vetor e mostre na tela esta soma.
(c) Modifique o vetor na posi��o 4, atribuindo a esta posi��o o valor 100.
(d) Mostre na tela cada valor do vetor A, um em cada linha.
 */

package lista4;

import java.util.Locale;
import java.util.Scanner;

public class Tarefa1 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int A[] = {1, 0, 5, -2, -5, 7}, soma = 0;

		for (int i = 0; i < A.length; i++) {
			if (i == 0 || i == 1 || i == 5) {
				soma += A[i];
			}
			if (i == 4) {
				A[i] = 100;
			}
		}
		
		System.out.println("A soma de A[0], A[1] e A[5] � " + soma);
		
		System.out.println();
		for (int posicao : A) {
			System.out.println(posicao);
		}
		
		sc.close();
	}
}
