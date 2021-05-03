/*
 * 2) Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa que gere um vetor com os lançamentos, escreva esse vetor. 
 * A seguir determine e imprima a média aritmética dos lançamentos, contabilize e apresente também quantas foram as ocorrências da maior pontuação.
 */

programa {

	inclua biblioteca Util

	funcao inicio() {
		const inteiro LANCAMENTOS = 10, MAIOR_PONTUACAO = 6
		inteiro lancamentos[LANCAMENTOS], qtdOcorrenciasMaiorPontuacao = 0
		real mediaLancamentos = 0.0, somaLancamentos = 0.0
		cadeia msg = ""

		para (inteiro linha = 0; linha < LANCAMENTOS; linha++) {
			lancamentos[linha] = Util.sorteia(1, 6)
		  	msg += (linha+1) + "º lançamento: " + lancamentos[linha] + "\n"

			somaLancamentos += lancamentos[linha]

		  	se (lancamentos[linha] == MAIOR_PONTUACAO) {
		  		qtdOcorrenciasMaiorPontuacao++
		  	}
          }

		mediaLancamentos = somaLancamentos / LANCAMENTOS

		escreva("LANÇAMENTOS\n" + msg)
		escreva("Média: " + mediaLancamentos)
		escreva("\nA maior pontuação de lançamento (" + MAIOR_PONTUACAO + ") foi obtida " + qtdOcorrenciasMaiorPontuacao + " vezes.")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 978; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */