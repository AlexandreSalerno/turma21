programa {

	inclua biblioteca Util
	inclua biblioteca Calendario
	
	funcao inicio() {
		const inteiro MOVIMENTOS = 10
		const cadeia SLOGAN = "SEU FUTURO COMEÇA AQUI!"
	     inteiro codigo = 0, numeroStatus = 0, matricula = 0, diaAniversario = 0, lancamento = 0
	     real pontos = 0.0, movimentos[MOVIMENTOS], valorMovimento = 0.0
	     cadeia nome = "", cpf = "", categoria = "", mensagemFim = "OBRIGADO POR NAVEGAR EM NOSSA PÁGINA (ESCOLA G6)"
	     caracter continuarMovimento = 'S', operacao, solicitarBoletim
	     logico opcaoValida = falso, status = falso, sair = falso

	     faca {
		     escreva("ESCOLA G6\n")
		     escreva(SLOGAN + "\n\n")
	
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
		     	sair = verdadeiro
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

		se (sair == falso) {
		     escreva("ESCOLA G6\n")
		     escreva(SLOGAN + "\n")
	
		     escreva("\nENSINO " + categoria + "\n")
		     
		     escreva("\nNOME: ")
		     leia(nome)
	
		     escreva("\nDIA DE ANIVERSÁRIO: ")
		     leia(diaAniversario)
		     
		     escreva("MATRÍCULA: ")
		     leia(matricula)
		     escreva("CPF: ")
		     leia(cpf)
		     escreva("STATUS (1 - ATIVO / 2 - INATIVO): ")
		     leia(numeroStatus)
		     se (numeroStatus == 1) {
		     	status = verdadeiro
		     }
		     senao se (numeroStatus == 2) {
		     	status = falso
		     }
	
			inteiro contador = 0
		     enquanto (contador < MOVIMENTOS e continuarMovimento == 'S') {
		     	limpa()
		     	escreva("MOVIMENTO: " + (contador+1) + "\n")
		     	escreva("TOTAL DA NOTA ATUAL (" + pontos + ")\n\n")
			    	escreva("MOVIMENTO (I - INCLUSÃO DE NOTA / R - RETIRADA DE NOTA): ")
			    	leia(operacao)
	
			     escreva("VALOR DO MOVIMENTO: ")
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

				limpa()
			    	escreva("MOVIMENTO: " + (contador+1) + "\n")
		     	escreva("TOTAL DA NOTA ATUAL (" + pontos + ")\n\n")
			    	escreva("MOVIMENTO (I - INCLUSÃO DE NOTA / R - RETIRADA DE NOTA): " + operacao + "\n")
			    	escreva("VALOR DO MOVIMENTO: " + valorMovimento + "\n")
			    	
				se (contador < (MOVIMENTOS - 1)) {
			     	escreva("CONTINUAR? (S/N): ")
			     	leia(continuarMovimento)
				}
			     contador++
		     }
	
		    escolha (codigo) {
		    		//BASICO
		    		caso 1: 
		     	se (diaAniversario == Calendario.dia_mes_atual()){
					pontos = (pontos * 0.1) + pontos
				}
				Util.aguarde(1000)
		     	escreva("\nCARREGANDO ")
		     	Util.aguarde(1000)
		     	escreva(". ")
		     	Util.aguarde(1000)
		     	escreva(". ")
		     	Util.aguarde(1000)
		     	escreva(". ")
		     	Util.aguarde(1000)
		     	pare
	
				//MEDIO
		     	caso 2:
		     	para (inteiro outroContador = 2; outroContador >= 0; outroContador--) {
		     		escreva("\nDESEJA SOLICITAR A EMISSÃO DO BOLETIM? (S/N) (" + (outroContador + 1) + ") EMISSÕES RESTANTE(S): ")
		     		leia(solicitarBoletim)
	
		     		se (solicitarBoletim == 'S') {
		     			escreva("QUAL LANÇAMENTO? ")
		     			leia(lancamento)
		     									
		     			escreva("LANÇAMENTO " + lancamento + ": " + movimentos[lancamento-1] + "\n")
		     		}
		     		senao se (solicitarBoletim == 'N') {
		     			pare
		     		}
		     	}
		     	Util.aguarde(1000)
		     	escreva("\nCARREGANDO ")
		     	Util.aguarde(1000)
		     	escreva(". ")
		     	Util.aguarde(1000)
		     	escreva(". ")
		     	Util.aguarde(1000)
		     	escreva(". ")
		     	Util.aguarde(1000)
		     	pare
	
		     	//GRADUACAO
		     	caso 3:
	               inteiro maisBonus = 2
	          	se (pontos < 0){
	          		pontos += maisBonus
	          	}
	          	Util.aguarde(1000)
		     	escreva("\nCARREGANDO ")
		     	Util.aguarde(1000)
		     	escreva(". ")
		     	Util.aguarde(1000)
		     	escreva(". ")
		     	Util.aguarde(1000)
		     	escreva(". ")
		     	Util.aguarde(1000)
	               pare
	
		     	//PÓS
		     	caso 4:
				caracter creditoExtra = 'S'
		     	real extra = 5.0
	     		escreva("DESEJA UTILIZAR O VALOR DO CRÉDITO EXTRA (+5) (S/N)? :")
	     		leia (creditoExtra)     
	               se (creditoExtra == 'S'){
	               	pontos += extra
	               }
	               Util.aguarde(1000)
		     	escreva("\nCARREGANDO ")
		     	Util.aguarde(1000)
		     	escreva(". ")
		     	Util.aguarde(1000)
		     	escreva(". ")
		     	Util.aguarde(1000)
		     	escreva(". ")
		     	Util.aguarde(1000)
		     	pare
	
				//MESTRADO
		     	caso 5:
	               caracter limite = 'S'
	               real creditos = 10.0
	          	escreva("DESEJA UTILIZAR O VALOR DO CRÉDITO EXTRA (+10) (S/N)? :")
	          	leia(limite)
	          	se (limite == 'S'){
	          		pontos += creditos
	          	}
	          	Util.aguarde(1000)
		     	escreva("\nCARREGANDO ")
		     	Util.aguarde(1000)
		     	escreva(". ")
		     	Util.aguarde(1000)
		     	escreva(". ")
		     	Util.aguarde(1000)
		     	escreva(". ")
		     	Util.aguarde(1000)
		     	pare
		     }

			limpa()
			escreva("DADOS CADASTRAIS\n\n")
			escreva("NOME          : " + nome + "\n")
			escreva("MATRICULA     : " + matricula + "\n")
			escreva("CPF           : " + cpf + "\n")
			escreva("ALUNE         : ")
			se (status == verdadeiro){
				escreva("ATIVO\n")
			}
			senao {
				escreva("INATIVO\n")
			}
		     escreva("TOTAL DA NOTA : " + pontos + "\n")
		}
		escreva("------------------------------------------------------------------\n")
		escreva(mensagemFim + "\n")
		escreva(SLOGAN + "\n")
		escreva("\n------------------------------------------------------------------")	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 4267; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */