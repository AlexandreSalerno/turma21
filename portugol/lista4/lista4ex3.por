/*
 * 3) Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição das matrizes N1 e N2;
b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma posição das matrizes N1 e N2.
 */

programa {
	funcao inicio() {
		const inteiro LINHAS = 4, COLUNAS = 6
		inteiro N1[LINHAS][COLUNAS], N2[LINHAS][COLUNAS]
		inteiro M1[LINHAS][COLUNAS], M2[LINHAS][COLUNAS]
		cadeia msgM1 = "", msgM2 = ""

		para (inteiro linha = 0; linha < LINHAS; linha++) {
			para (inteiro coluna = 0; coluna < COLUNAS; coluna++){
				escreva("Insira um número para a matriz N1, posição [" + linha + "][" + coluna + "]: ")
				leia(N1[linha][coluna])
			}
		}
		escreva("\n")

		para (inteiro linha = 0; linha < LINHAS; linha++) {
			para (inteiro coluna = 0; coluna < COLUNAS; coluna++){
				escreva("Insira um número para a matriz N2, posição [" + linha + "][" + coluna + "]: ")
				leia(N2[linha][coluna])
			}
		}

		para (inteiro linha = 0; linha < LINHAS; linha++) {
			para (inteiro coluna = 0; coluna < COLUNAS; coluna++){
				M1[linha][coluna] = N1[linha][coluna] + N2[linha][coluna]
				msgM1 += "Posição [" + linha + "][" + coluna + "]: " + M1[linha][coluna] + "\n"
			}
		}

		para (inteiro linha = 0; linha < LINHAS; linha++) {
			para (inteiro coluna = 0; coluna < COLUNAS; coluna++){
				M2[linha][coluna] = N1[linha][coluna] - N2[linha][coluna]
				msgM2 += "Posição [" + linha + "][" + coluna + "]: " + M2[linha][coluna] + "\n"
			}
		}

		escreva("\nMATRIZ M1\n" + msgM1)
		escreva("\nMATRIZ M2\n" + msgM2)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1529; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */