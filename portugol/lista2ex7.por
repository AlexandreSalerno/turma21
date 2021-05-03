/*
 * 7) Receber valores de base e altura de um triângulo e verificar se são valores válidos (positivos maiores que zero). 
 * Em caso afirmativo, calcular a área do triângulo.
 */

programa {
	funcao inicio() {
		real baseTriangulo, alturaTriangulo, areaTriangulo = 0.0

		escreva("Informe a base do triângulo: ")
		leia(baseTriangulo)
		escreva("Informe a altura do triângulo: ")
		leia(alturaTriangulo)

		se (baseTriangulo > 0 e alturaTriangulo > 0){
			areaTriangulo = (baseTriangulo * alturaTriangulo) / 2
			escreva("A área do triângulo de base " + baseTriangulo + " e altura " + alturaTriangulo + " é " + areaTriangulo)
		}
		senao {
			escreva("Por favor, insira valores positivos (maiores que zero) para calcular a área do triângulo.")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 631; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */