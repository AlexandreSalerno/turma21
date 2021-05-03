/*
 * 3) Elaborar um programa que efetue a leitura sucessiva de valores numéricos e apresente no final o total do somatório, 
 * a média e o total de valores lidos. O programa deve fazer as leituras dos valores enquanto o usuário estiver fornecendo valores positivos. 
 * Ou seja, o programa deve parar quando o usuário fornecer um valor negativo.
 */

programa {
	funcao inicio() {
		real valor = 0.0, totalSomatorio = 0.0, mediaSomatorio = 0.0
		inteiro totalValoresLidos = 0
		
		escreva ("Digite um valor (positivo para somar, ou de zero abaixo para sair): ")
		leia(valor)
		
		enquanto (valor > 0.0){
			totalSomatorio = totalSomatorio + valor
			totalValoresLidos++
			escreva ("Digite outro valor: ")
			leia(valor)
		}

		mediaSomatorio = totalSomatorio / totalValoresLidos

		escreva("\nTotal do somatório: " + totalSomatorio + "\n")
		escreva("Média do somatório: " + mediaSomatorio + "\n")
		escreva("Toal de valores lidos: " + totalValoresLidos)
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 362; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */