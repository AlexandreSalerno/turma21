//Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias. 
programa {
	funcao inicio() {
		inteiro anos, meses, dias, idadeEmDias

		escreva("Insira sua idade expressa em dias: ")
		leia(idadeEmDias)

		anos = idadeEmDias / 365
		meses = (idadeEmDias % 365) / 30
		dias = (idadeEmDias % 365) % 30

		escreva("Sua idade é aproximadamente " + anos + " anos, " + meses + " meses e " + dias + " dias.")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 138; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */