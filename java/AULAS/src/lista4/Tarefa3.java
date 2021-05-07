/*
 * 3) Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.
 */

package lista4;

import java.util.Locale;
import java.util.Scanner;

public class Tarefa3 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int matriz[][] = new int[3][3], valoresMaiores10 = 0;
		
		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
				System.out.printf("Insira um valor para a posição [%d][%d]: ", linha, coluna);
				matriz[linha][coluna] = sc.nextInt();
				if (matriz[linha][coluna] > 10) {
					valoresMaiores10++;
				}
			}
		}
		
		System.out.println();
		System.out.println("MATRIZ");
		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
				System.out.print(matriz[linha][coluna] + "\t");
			}
			System.out.println();
		}
		System.out.println();
		System.out.print("A matriz possui " + valoresMaiores10 + " valores maiores que 10.");
		
		sc.close();
	}
}
