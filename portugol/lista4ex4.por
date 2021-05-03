/*
 * 4) Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e em seguida, 
 * exiba a soma dos valores dela e a soma dos valores da primeira diagonal, ou seja, diagonal principal.
 */

programa {
	funcao inicio() {
		const inteiro LINHAS = 3, COLUNAS = 3
		inteiro matriz[LINHAS][COLUNAS], somaValores = 0, somaDiagonalPrincipal = 0

		para (inteiro linha = 0; linha < LINHAS; linha++) {
			para (inteiro coluna = 0; coluna < COLUNAS; coluna++) {
				escreva("Insira um número para a posição [" + linha + "][" + coluna + "]: ")
				leia(matriz[linha][coluna])
				somaValores += matriz[linha][coluna]
				se (linha == coluna) {
					somaDiagonalPrincipal += matriz[linha][coluna]
				}
			}
		}
		escreva ("\nSoma dos valores da matriz: " + somaValores)
		escreva ("\nSoma dos valores da diagional principal da matriz: " + somaDiagonalPrincipal)
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 222; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */