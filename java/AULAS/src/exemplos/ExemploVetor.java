package exemplos;

import java.util.Locale;
import java.util.Scanner;

public class ExemploVetor {
	public static void main(String[] args) {
		/*
		 * Fa�a um programa que crie um vetor por leitura com 5 
		 * valores de pontua��o de uma atividade e o escreva em 
		 * seguida. Encontre ap�s a maior pontua��o e a apresente. 
		 */
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);

		int pontos[] = new int[5];
		int maiorPontuacao=0;

		for (int x=0; x<5; x++) {
		 	System.out.print("Digite sua pontua��o nas atividades: "); 
		 	pontos[x] = leia.nextInt();

		 	if (maiorPontuacao < pontos[x]) {
		 		maiorPontuacao = pontos[x];
		 	}	
		}

		System.out.printf("\nA maior pontua��o de suas atividades �: %d", maiorPontuacao); 
		 
		leia.close();
	}
}
