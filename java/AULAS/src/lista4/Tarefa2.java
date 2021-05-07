/*
 * 2- Faça um programa que receba 6 números inteiros e mostre:
- Os números pares digitados;
- A soma dos números pares digitados;
- Os números ímpares digitados;
- A quantidade de números ímpares digitados.
 */

package lista4;

import java.util.Locale;
import java.util.Scanner;

public class Tarefa2 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numeros[] = new int[6], somaPares = 0, impares = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.printf("Digite o %dº número: ", i+1);
			numeros[i] = sc.nextInt();
			if (numeros[i] % 2 == 0) {
				somaPares += numeros[i];
			}
			else {
				impares++;
			}
		}
		
		System.out.print("\nNúmeros pares                : ");
		for (int par : numeros) {
			if (par % 2 == 0) {
				System.out.print(par + "  ");
			}
		}
		System.out.println("\nSoma dos números pares       : " + somaPares);
		System.out.print("Números ímpares              : ");
		for (int impar : numeros) {
			if (impar % 2 == 1) {
				System.out.print(impar + "  ");
			}
		}
		System.out.println("\nQuantidade de números ímpares: " + impares);
		
		sc.close();
	}
}
