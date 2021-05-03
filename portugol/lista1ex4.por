programa {
	inclua biblioteca Matematica
	funcao inicio(){
		real A, B, C, D, R, S

		escreva("Insira um número inteiro e positivo para os seguinte valores.\n")
		escreva("A: ")
		leia(A)
		escreva("B: ")
		leia(B)
		escreva("C: ")
		leia(C)

		R = Matematica.potencia(A, 2.0) + Matematica.potencia(B, 2.0)
		S = Matematica.potencia(B, 2.0) + Matematica.potencia(C, 2.0)

		D = (R + S) / 2

		escreva("R = " + R + ", S = " + S + ", D = " + D)

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 364; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */