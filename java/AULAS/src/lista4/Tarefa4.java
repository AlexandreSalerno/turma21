/*
 * 4) Faça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça ao usuário um
menu de opções:
(1) somar as duas matrizes
(2) subtrair a primeira matriz da segunda
(3) adicionar uma constante as duas matrizes
(4) imprimir as matrizes
Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada. Na terceira opção o valor
da constante deve ser lido e o resultado da adição da constante deve ser armazenado na
própria matriz.
 */

package lista4;

import java.util.Locale;
import java.util.Scanner;

public class Tarefa4 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double matriz1[][] = new double[2][2];
		double matriz2[][] = new double[2][2];
		double matrizSoma[][] = new double[2][2];
		double matrizSubtracao[][] = new double[2][2];
		char op = ' ';
		
		for (int linha = 0; linha < matriz1.length; linha++) {
			for (int coluna = 0; coluna < matriz1[linha].length; coluna++) {
				System.out.printf("Valor da matriz 1 na posição %d - %d : ", linha, coluna);
				matriz1[linha][coluna] = sc.nextDouble();
				System.out.printf("Valor da matriz 2 na posição %d - %d : ", linha, coluna);
				matriz2[linha][coluna] = sc.nextDouble();
				System.out.println();
			}
		}
		
		do {
			System.out.println("(1) Somar as duas matrizes");
			System.out.println("(2) Subtrair a primeira matriz da segunda");
			System.out.println("(3) Adicionar uma constante as duas matrizes");
			System.out.println("(4) Imprimir as matrizes");
			System.out.print("Escolha uma opção: ");
			op = sc.next().charAt(0);
			
			System.out.println();
			switch (op) {
				case '1': 
					for (int linha = 0; linha < matriz1.length; linha++) {
						for (int coluna = 0; coluna < matriz1[linha].length; coluna++) {
							matrizSoma[linha][coluna] = matriz1[linha][coluna] + matriz2[linha][coluna];
							System.out.printf("Soma de m1 + m2 na posição [%d][%d] - %.2f + %.2f = %.2f\n", linha, coluna, matriz1[linha][coluna], matriz2[linha][coluna], matrizSoma[linha][coluna]);
						}
					}
					System.out.println();
				break;
				case '2':
					for (int linha = 0; linha < matriz1.length; linha++) {
						for (int coluna = 0; coluna < matriz1[linha].length; coluna++) {
							matrizSubtracao[linha][coluna] = matriz1[linha][coluna] - matriz2[linha][coluna];
							System.out.printf("Subtração de m1 - m2 na posição [%d][%d] - %.2f + %.2f = %.2f\n", linha, coluna, matriz1[linha][coluna], matriz2[linha][coluna], matrizSubtracao[linha][coluna]);
						}
					}
					System.out.println();
				break;
				case '3':
					System.out.print("Digite o valor da constante: ");
					final double VALOR = sc.nextDouble();
					for (int linha = 0; linha < matriz1.length; linha++) {
						for (int coluna = 0; coluna < matriz1[linha].length; coluna++) {
							matriz1[linha][coluna] += VALOR;
							matriz2[linha][coluna] += VALOR;
						}
					}
				break;
				case '4':
					System.out.println("MATRIZ 1");
					for (int linha = 0; linha < matriz1.length; linha++) {
						for (int coluna = 0; coluna < matriz1[linha].length; coluna++) {
							System.out.printf("%.2f\t", matriz1[linha][coluna]);
						}
						System.out.println();
					}
					System.out.println("MATRIZ 2");
					for (int linha = 0; linha < matriz2.length; linha++) {
						for (int coluna = 0; coluna < matriz2[linha].length; coluna++) {
							System.out.printf("%.2f\t", matriz2[linha][coluna]);
						}
						System.out.println();
					}
					System.out.println("MATRIZ SOMA");
					for (int linha = 0; linha < matriz1.length; linha++) {
						for (int coluna = 0; coluna < matriz1[linha].length; coluna++) {
							System.out.printf("%.2f\t", matrizSoma[linha][coluna]);
						}
						System.out.println();
					}
					System.out.println("MATRIZ SUBTRAÇÃO");
					for (int linha = 0; linha < matriz1.length; linha++) {
						for (int coluna = 0; coluna < matriz1[linha].length; coluna++) {
							System.out.printf("%.2f\t", matrizSubtracao[linha][coluna]);
						}
						System.out.println();
					}
					System.out.println();
				break;
				default:
					System.out.println("Escolha uma opção válida.");
				break;
			}
		} while (op != '4');
		
		sc.close();
	}
}
