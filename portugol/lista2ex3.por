/*
 * 3) Desenvolva um sistema em que:
Leia 4 (quatro) números;
Calcule o quadrado de cada um;
Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
Caso contrário, imprima os valores lidos e seus respectivos quadrados.
 */

programa {

	inclua biblioteca Matematica --> mat
	
	funcao inicio() {
		real n1, n2, n3, n4

		escreva("Digite o número 1: ")
		leia(n1)
		escreva("Digite o número 2: ")
		leia(n2)
		escreva("Digite o número 3: ")
		leia(n3)
		escreva("Digite o número 4: ")
		leia(n4)

		se (mat.potencia(n3, 2.0) >= 1000) {
			escreva("\nO valor do terceiro número (" + n3 + ") ao quadrado (" + mat.arredondar(mat.potencia(n3, 2.0), 2) + ") é maior ou igual à 1000.")
		}
		senao {
			escreva("\nNúmero 1: " + n1 + " (" + mat.arredondar(mat.potencia(n1, 2.0), 2) + " elevado ao quadrado).\n")
			escreva("Número 2: " + n2 + " (" + mat.arredondar(mat.potencia(n2, 2.0), 2) + " elevado ao quadrado).\n")
			escreva("Número 3: " + n3 + " (" + mat.arredondar(mat.potencia(n3, 2.0), 2) + " elevado ao quadrado).\n")
			escreva("Número 4: " + n4 + " (" + mat.arredondar(mat.potencia(n4, 2.0), 2) + " elevado ao quadrado).\n")
		}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 313; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */