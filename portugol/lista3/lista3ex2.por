/*
 * 2- Desenvolver um sistema que efetue a soma de todos os números ímpares que são  múltiplos de três e que se encontram no conjunto dos números 
 * de 1 até 500.
 */

programa {
	funcao inicio() {
		inteiro somaValores = 0
		para (inteiro contador = 1; contador <= 500; contador++) {
			//Encontrar números ímpares e números que são múltiplos de 3
			se ((contador % 2 == 1) e (contador % 3 == 0)) {
				escreva(somaValores)
				somaValores = somaValores + contador
				escreva(" + " + contador + " = " + somaValores + "\n")
			}
		}
		escreva("Soma: " + somaValores)
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 199; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */