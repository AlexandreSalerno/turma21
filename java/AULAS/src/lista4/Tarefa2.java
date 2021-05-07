/*
 * 2- Fa�a um programa que receba 6 n�meros inteiros e mostre:
- Os n�meros pares digitados;
- A soma dos n�meros pares digitados;
- Os n�meros �mpares digitados;
- A quantidade de n�meros �mpares digitados.
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
			System.out.printf("Digite o %d� n�mero: ", i+1);
			numeros[i] = sc.nextInt();
			if (numeros[i] % 2 == 0) {
				somaPares += numeros[i];
			}
			else {
				impares++;
			}
		}
		
		System.out.print("\nN�meros pares                : ");
		for (int par : numeros) {
			if (par % 2 == 0) {
				System.out.print(par + "  ");
			}
		}
		System.out.println("\nSoma dos n�meros pares       : " + somaPares);
		System.out.print("N�meros �mpares              : ");
		for (int impar : numeros) {
			if (impar % 2 == 1) {
				System.out.print(impar + "  ");
			}
		}
		System.out.println("\nQuantidade de n�meros �mpares: " + impares);
		
		sc.close();
	}
}
