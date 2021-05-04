/*
 * 4) Faça um sistema que leia um número inteiro e mostre uma mensagem indicando se este número é par ou ímpar, e se é positivo ou negativo.
 */

programa {
	funcao inicio() {
		inteiro numero

		escreva("Digite um número: ")
		leia(numero)

		escreva("O número " + numero + " é ")
		se (numero == 0){
			escreva("par e neutro.")
		}
		senao se (numero > 0) {
			se ((numero % 2) == 0) {
				escreva("par e ")
			}
			senao {
				escreva("ímpar e ")
			}
			escreva("positivo.")
		} senao {
			se ((numero % -2) == 0) {
				escreva("par e ")
			}
			senao {
				escreva("ímpar e ")
			}
			escreva("negativo.")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 322; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */