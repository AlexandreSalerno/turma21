/*
 * 8. O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem do distribuidor e dos impostos 
 * (aplicados ao custo de fábrica). Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%, escrever 
 * um sistema que leia o custo de fábrica de um carro e escreva o custo ao consumidor.
 * 
 * carro novo = custo de fabrica + % do distribuidor + impostos
 */

programa
 {
	funcao inicio(){
		const real pdistribuidor = 0.28, pimposto = 0.45
		real custoFabrica = 0.0, custoConsumidor = 0.0, porcentagemDistribuidor = 0.0, impostos = 0.0

		escreva("Digite o custo de fabrica do carro: R$ ")
		leia(custoFabrica)

		porcentagemDistribuidor = custoFabrica * pdistribuidor
		impostos = custoFabrica * pimposto
		custoConsumidor = custoFabrica + porcentagemDistribuidor + impostos

		escreva("Custo consumidor: " + custoConsumidor)
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 876; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */