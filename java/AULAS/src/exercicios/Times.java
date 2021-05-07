package exercicios;

import java.util.Scanner;

public class Times {
	public static void main(String[] args) {
		/*
		 * Temos 4 time (SPFC, SANTOS, PALMEIRAS, CORINTHIANS) G-Ganho, P-Perdeu,
		 * E-Empate G = 3p, P= 0p, E=1p 3-Rodadas Lista com nome e pontos.
		 */
		// var

		Scanner leia = new Scanner(System.in);
		final int RODADA = 3;
		String times[] = { "SPFC", "SANTOS", "PALMEIRAS", "CONRINTHIANS" };
		int pontos[] = new int[4];
		char resposta = ' ';

		// entradas
		for (int numero = 0; numero < RODADA; numero++) {// NUMERO DE RODADAS
			for (int i = 0; i < 4; i++) {// PERGUNTA PARA CADA TIME
				System.out.print("O " + times[i] + " (G)anhou, (P)erdeu ou (E)mpatou? ");
				resposta = leia.next().toUpperCase().charAt(0);
				if (resposta == 'G') {
					pontos[i] += 3;
				} else if (resposta == 'P') {
					pontos[i] += 0;
				} else if (resposta == 'E') {
					pontos[i] += 1;
				}
			}
		}

		// escreva(times[1] + "somou" + pontos[1])
		System.out.println("-----------RESULTADOS-----------\n");
		for (int x = 0; x < 4; x++) {
			System.out.println(times[x] + ": " + pontos[x] + "pontos.");
		}
		
		leia.close();
	}
}