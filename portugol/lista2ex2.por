/*
 * 2) Elabore um sistema que leia as variáveis C e N, respectivamente código e número de horas trabalhadas de um operário. 
 * E calcule o salário sabendo-se que ele ganha R$ 10,00 por hora. Quando o número de horas exceder a 50 calcule o excesso de pagamento 
 * armazenando-o na variável E, caso contrário zerar tal variável. A hora excedente de trabalho vale R$ 20,00. 
 * No final do processamento imprimir o salário total e o salário excedente.
 */

programa {
	funcao inicio() {
		const real HORA = 10.00, HORAEXCEDENTE = 20.00
		inteiro C
		real N = 0.00, E = 0.00, salario = 0.00, salarioExcedente = 0.00, salarioTotal = 0.00

		escreva("Informe seu código: ")
		leia(C)
		escreva("Número de horas trabalhadas: ")
		leia(N)

		se (N > 50.0) {
			E = N - 50.0
			salario = 50.0 * HORA
			salarioExcedente = E * HORAEXCEDENTE
			salarioTotal = salario + salarioExcedente
			escreva("\nCódigo:				" + C + "\n")
			escreva("Número de horas trabalhadas:	" + N + "\n")
			escreva("Número de horas excedentes:	" + E + "\n")
			escreva("Salário (R$):			" + salario + "\n")
			escreva("Salário excedente (R$):		" + salarioExcedente + "\n")
			escreva("Salário total (R$):		" + salarioTotal + "\n")
		}
		senao {
			salario = N * HORA
			salarioTotal = salario
			escreva("\nCódigo:				" + C + "\n")
			escreva("Número de horas trabalhadas:	" + N + "\n")
			escreva("Número de horas excedentes:	" + E + "\n")
			escreva("Salário (R$):			" + salario + "\n")
			escreva("Salário excedente (R$):		" + salarioExcedente + "\n")
			escreva("Salário total (R$):		" + salarioTotal + "\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 470; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */