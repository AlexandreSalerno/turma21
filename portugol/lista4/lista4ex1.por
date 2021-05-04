/*
 * 1) Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma atividade e o escreva em seguida.
 * Encontre após a maior pontuação e a apresente.
 */

programa {
	funcao inicio() {
		real pontuacao[5], maiorPontuacao = 0.0
		cadeia msg = ""

		para (inteiro linha = 0; linha < 5; linha++) {
			escreva("Digite a pontuação: ")
			leia(pontuacao[linha])

			msg += pontuacao[linha] + "\n"

			se (pontuacao[linha] > maiorPontuacao) {
				maiorPontuacao = pontuacao[linha]
			}
		}

		escreva("\nPONTUAÇÕES\n" + msg)
		escreva("\nA maior pontuação obtida foi " + maiorPontuacao)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 272; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */