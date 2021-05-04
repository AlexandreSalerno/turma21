programa {

	inclua biblioteca Util
	inclua biblioteca Calendario
	
	funcao inicio() {
	     inteiro codigo = 0, numeroStatus = 0, matricula = 0, diaAniversario = 0, lancamento = 0
	     real pontos = 0.0, movimentos[10], valorMovimento = 0.0
	     cadeia nome = "", cpf = "", categoria = ""
	     caracter continuarMovimento = 'S', operacao, solicitarBoletim
	     logico opcaoValida = falso, status = falso

	     faca {
		     escreva("--ESCOLA G6--\n")
		     escreva("--SLOGAN--\n\n")
	
		     escreva("1 - BÁSICO\n")
		     escreva("2 - MÉDIO\n")
		     escreva("3 - GRADUAÇÃO\n")
		     escreva("4 - PÓS\n") 
		     escreva("5 - MESTRADO\n")     
		     escreva("6 - SAIR\n")
	
			escreva("\nDIGITE O CÓDIGO DA OPÇÃO SELECIONADA: ")
		     leia(codigo)
		     limpa()		     

		     escolha (codigo) {
		     	caso 1: 
		     	categoria = "BÁSICO"
		     	opcaoValida = verdadeiro
		     	pare
	
		     	caso 2:
		     	categoria = "MÉDIO"
		     	opcaoValida = verdadeiro
		     	pare
	
		     	caso 3: 
		     	categoria = "GRADUAÇÃO"
		     	opcaoValida = verdadeiro
		     	pare
	
		     	caso 4:
		     	categoria = "PÓS"
		     	opcaoValida = verdadeiro
		     	pare
	
		     	caso 5:
		     	categoria = "MESTRADO"
		     	opcaoValida = verdadeiro
		     	pare
	
		     	caso 6:
		     	//sair
		     	opcaoValida = verdadeiro
		     	pare
	
		     	caso contrario:
		     	limpa()
		     	escreva("OPÇÃO INVÁLIDA. POR FAVOR, DIGITE UM CÓDIGO VÁLIDO.")
		     	Util.aguarde(3000)
		     	limpa()
		     }
	     } enquanto (opcaoValida == falso)
		//limpa()

	     escreva("--ESCOLA G6--\n")
	     escreva("--SLOGAN--\n")

	     escreva("\nENSINO " + categoria + "\n")
	     
	     escreva("\nNome: ")
	     leia(nome)

	     escreva("\nDia de aniversário: ")
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
		    	escreva("Movimento (I - Inclusão de Nota / R - Retirada de Nota): ")
		    	leia(operacao)

		     escreva("Valor do movimento: ")
		     leia(valorMovimento)

		     se (operacao == 'I') {
		     	//adicionarNota
		     	pontos = pontos + valorMovimento
		     	movimentos[contador] = valorMovimento
		    	}
		    	senao se (operacao == 'R') {
		    		//tirarNota
		    		pontos = pontos - valorMovimento
		    		movimentos[contador] = valorMovimento
		    	}

		    	se (categoria == "MESTRADO"){
		    		escreva("Quer solicitar os creditos?")
		    	}

		     escreva("Continuar S/N: ")
		     leia(continuarMovimento)
		     contador++
	     }

	    escolha (codigo) {
	    		//BASICO
	    		caso 1: 
	     	se (diaAniversario == Calendario.dia_mes_atual()){
				pontos = (pontos * 0.1) + pontos
			}
	     	pare

			//MEDIO
	     	caso 2:
	     	
	     	pare

	     	//GRADUACAO
	     	caso 3:

	     	pare

	     	//PÓS
	     	caso 4:

	     	pare

			//MESTRADO
	     	caso 5:
			
	     	pare
	     }

		limpa()
	     escreva("Total atual: " + pontos)

	}

	/*
	funcao vazio adicionarNota(real &pontos, real valor, real &movimentos[], inteiro contador) {
		pontos = pontos + valor
		movimentos[contador] = valor
	}

	funcao vazio tirarNota(real &pontos, real valor, real &movimentos[], inteiro contador) {
		pontos = pontos - valor
		movimentos[contador] = valor
	}

	funcao vazio bonusAniversario(inteiro &diaAniversario, real &pontos){
		se (diaAniversario == Calendario.dia_mes_atual()){
			pontos = (pontos * 0.1) + pontos
		}
	}

	funcao real pedirBoletim(real &movimentos[], inteiro contador){
		retorne movimentos[contador]
	}
	*/
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 3377; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */