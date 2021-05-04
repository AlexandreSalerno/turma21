//Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias.
programa {
	funcao inicio() {
		inteiro anos, meses, dias, idade

		escreva("Insira sua idade expressa em anos, meses e dias, respectivamente.\n")
		escreva("Anos: ")
		leia(anos)
		escreva("Meses: ")
		leia(meses)
		escreva("Dias: ")
		leia(dias)

		//Meses - para um resultado aproximado, multiplique o valor de tempo por 30,417

		idade = (anos * 365) + (meses * 30) + dias

		escreva("Sua idade é aproximadamente " + idade + " em dias.")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 144; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */