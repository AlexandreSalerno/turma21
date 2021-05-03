programa {

	inclua biblioteca Util
	inclua biblioteca Calendario
	
	funcao inicio() {
		/*Trabalho em Equipe do Grupo:6*/
		/*Alune:Lorrans Facca Fez: Caracter,logico,inteiro,real,msg, escreva e leia*/
		/*Alune:Alexandre     Fez:                                                 */
		/*Alune:Isa           Fez:                                                 */
		/*Alune:Arthur        Fez:                                                 */
		/*Alune:Israel        Fez:                                                 */

		/*
		caracter nome,sair,valor,movimento
		logico status = falso
		inteiro matricula,diaAniversario,contadorBoletim,numero
	     real pontos,bonus,credito,creditoMestrado
	     cadeia cpf,msg
	     */

	     inteiro codigo = 0, numeroStatus = 0, matricula = 0, diaAniversario = 0, tipo = 0, lancamento = 0
	     real pontos = 0.0, movimentos[10], valorMovimento = 0.0
	     cadeia categoria = "", nome = "", cpf = ""
	     caracter continuarMovimento = 'S', operacao, solicitarBoletim
	     logico opcaoCorreta = falso, status = falso

	     faca {
	     	escreva ("\n\n")

		     escreva("--ESCOLA G6--\n")
		     escreva("--SLOGAN--\n")
	
		     escreva("1 - BﾃヾICO\n")
		     escreva("2 - Mﾃ吋IO\n")
		     escreva("3 - GRADUAﾃ�ﾃグ\n")
		     escreva("4 - Pﾃ鉄\n") 
		     escreva("5 - MESTRADO\n")     
		     escreva("6 - SAIR\n")
	
			escreva("DIGITE O Cﾃ泥IGO DA OPﾃ�ﾃグ SELECIONADA: ")
		     leia(codigo)		     

		     escolha (codigo) {
		     	caso 1: 
		     	opcaoCorreta = verdadeiro
		     	categoria = "BﾃヾICO"
		     	tipo = 1
		     	pare
	
		     	caso 2:
		     	opcaoCorreta = verdadeiro
		     	categoria = "Mﾃ吋IO"
		     	tipo = 2
		     	pare
	
		     	caso 3: 
		     	//usarBonus
		     	opcaoCorreta = verdadeiro
		     	categoria = "GRADUAﾃ�ﾃグ"
		     	tipo = 3
		     	pare
	
		     	caso 4:
		     	//pedirCreditoPos
		     	opcaoCorreta = verdadeiro
		     	categoria = "Pﾃ鉄"
		     	tipo = 4
		     	pare
	
		     	caso 5:
		     	//usarCreditoMestrado
		     	opcaoCorreta = verdadeiro
		     	categoria = "MESTRADO"
		     	tipo = 5
		     	pare
	
		     	caso 6:
		     	//sair
		     	opcaoCorreta = verdadeiro
		     	pare
	
		     	caso contrario:
		     	limpa()
		     	escreva("OPﾃ�ﾃグ INVﾃ´IDA. POR FAVOR, DIGITE UM Cﾃ泥IGO Vﾃ´IDO.")
		     	Util.aguarde(3000)
		     	limpa()
		     }
	     } enquanto (opcaoCorreta == falso)
		limpa()

	     escreva("--ESCOLA G6--\n")
	     escreva("--SLOGAN--\n")

	     escreva("\nENSINO " + tipo + "\n") 
	     
	     escreva("\nNome: ")
	     leia(nome)

	     escreva("\nDia de aniversﾃ｡rio: ")
	     leia(diaAniversario)
	     
	     escreva("Matricula: ")
	     leia(matricula)
	     escreva("CPF: ")
	     leia(cpf)
	     escreva("Status (1 - Ativo / 2 - Inativo): ")
	     leia(numeroStatus)
	     se (numeroStatus == 1) {
	     	status = verdadeiro
	     }
	     senao se (numeroStatus == 2) {
	     	status = falso
	     }

		inteiro contador = 0
	     enquanto (contador < 10 e continuarMovimento == 'S') {
	     	limpa()
	     	escreva("MOVIMENTO: " + (contador+1) + "\n")
	     	escreva("Total atual (" + pontos + "): \n")
		    	escreva("Movimento (I - Inclusﾃ｣o de Nota / R - Retirada de Nota): ")
		    	leia(operacao)

		     escreva("Valor do movimento: ")
		     leia(valorMovimento)

		     se (operacao == 'I') {
		    		adicionarNota(pontos, valorMovimento, movimentos, contador)
		    	}
		    	senao se (operacao == 'R') {
		    		tirarNota(pontos, valorMovimento, movimentos, contador)
		    	}

		     escreva("Continuar S/N: ")
		     leia(continuarMovimento)
		     contador++
	     }

	     se (tipo == 1) {
	     	bonusAniversario(diaAniversario, pontos)
	     }
	     senao se (tipo == 2) {
	     	para (inteiro outroContador = 2; outroContador > 0; outroContador--) {
	     		escreva("Deseja solicitar a emissﾃ｣o do boletim? (S/N) (" + (outroContador + 1) + ") emissﾃｵe(s) restante(s): ")
	     		leia(solicitarBoletim)

	     		se (solicitarBoletim == 'S') {
	     			escreva("Qual lanﾃｧamento? ")
	     			leia(lancamento)
					
	     			escreva("Lanﾃｧamento " + lancamento + ": " + pedirBoletim (movimentos, (lancamento-1) ) + "\n")
	     		}
	     	}
	     }

		limpa()
	     escreva("Total atual: " + pontos)

	}

	funcao vazio adicionarNota(real &pontos, real valor, real &movimentos[], inteiro contador) {
		pontos = pontos + valor
		movimentos[contador] = valor
	}

	funcao vazio tirarNota(real &pontos, real valor, real &movimentos[], inteiro contador) {
		pontos = pontos - valor
	}

	funcao vazio bonusAniversario(inteiro &diaAniversario, real &pontos){
		se (diaAniversario == Calendario.dia_mes_atual()){
			pontos = (pontos * 0.1) + pontos
		}
	}

	funcao real pedirBoletim(real &movimentos[], inteiro contador){
		retorne movimentos[contador]
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1060; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */