programa
{
	funcao menuEntrada(){
        inteiro opcao
        escreva(" \n■■■■■■■■■■■■■■ BEM VINDO AO G5 BANK ■■■■■■■■■■■■■■■■ ","\n")
        escreva("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■")
        escreva("\n             DIGITE O NUMERO DA CONTA : ","\n")
        leia(numeroUsuario)
        escreva("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■")
        escreva("\n DIGITE O CPF : ","\n")
        leia(cpfUser)
        escreva("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■")
        limpa()

        se( numeroUsuario==numeroConta e cpfUser==cpf  )
        {

            menu()
        }
        senao
        {
        	  limpa()
            escreva(" CONTA INVALIDA ou CPF INVALIDO ! ")
            escreva("\n■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■")

            menuEntrada()
            
        }

	}

    funcao menu()
    {
        inteiro opcao
        escreva(" \n■■■■■■■■■■■■■■ BEM VINDO AO G5 BANK ■■■■■■■■■■■■■■■■ ","\n")
        escreva("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■█")
        escreva("\n█♣♣♣♣♣♣♣♣♣♣ ESCOLHA UMA OPERAÇÃO ♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣█")
        escreva("\n█ 1- SALDO  ►                                      █")
        escreva("\n█ 2- SAQUE  ►                                      █")
        escreva("\n█ 3- EMPRÉSTIMO ►                                  █")
        escreva("\n█ 4- LIMITE ►                                      █")
        escreva("\n█ 5- TALÃO  ►                                      █")
        escreva("\n█ 6- SAIR  ►                                       █","\n")
        escreva("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■█")
        leia(opcao)
        limpa()
        escolha(opcao){
        caso 1 : 
        olhaSaldo()
        pare
        caso 2:
        saque()
        pare
        caso 3:
        deposito()
        pare
        caso 4:
        limite()
        caso 5:
        contaTalao()
        pare
        caso 6:
         ContaUniversidade()
        
        caso 7:
         sair()
        pare

        }
    }
    	   real emprestado = 0.0
    	   real emprestimo = 500.0
	   real saldo = 0.0
        real credito = 1000.0
        real debito = 0.0
        inteiro movimento = 0 
        caracter voltar = 'V'
        inteiro numeroConta = 1
        cadeia nomeUsuario
        inteiro numeroUsuario = 0
        inteiro cpf = 111
        inteiro cpfUser = 0
        real saldoatual =0.0
        real dinheiro = 0.0
        inteiro x=0
        inteiro dia = 5;
        real retirada
        real armazenadorDoSaldo
        inteiro acumuladorTalao=0
        
        real Creditouniversidade =400.0
        real saldoUniversitario =0.0
        real saldoAtualUni=0.0



        
       
    funcao inicio()
    {
    		menuEntrada()
    		menu()
    }
   funcao olhaSaldo()
    {
            escreva("\n","Seu Saldo atual é de ",saldo," R$")
            escreva("\n■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■")
            escreva("\n","Seu Limite atual de crédito é de :", credito ," R$              █")
            escreva("\n■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■")
            escreva("\n","Aperte V para retornar")
            leia(voltar)
		  limpa()
            se(voltar == 'V' ou voltar == 'v'){
            	menu()
            }
    }
  funcao limite()
    {
    	
    		caracter tipo 
   		escreva("\n","■■■■■■■■■■■■■■■■■■■■■■ Saldo de :", saldo," R$"," ■■■■■■■■■■■■■■■■■■■■■■","\n")
		escreva(" \n■■■■■■■■■■■■■ Crédito disponivel é de :", credito,"R$"," ■■■■■■■■■■■■■■","\n")
		escreva("\n Deseja adicionar credito ao Saldo atual ? ","\n","\n[S]Sim","\n","\n[N]Não","\n")
		leia(tipo)
		limpa()
		se (tipo =='S' ou tipo== 's')             
		{
		escreva("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■\n")	
		escreva("\n Quanto deseja adicionar ? \n")	
		escreva("\n■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■\n")	
		leia(dinheiro)
		}
		se ((movimento<2) e (dinheiro >=0 )e (dinheiro<=credito))             
		{
		movimento++
       	saldo = saldo + dinheiro
        	saldoatual = saldo
        	credito = credito-saldo
        	limpa()
        	escreva(" VOCÊ FEZ ", movimento," MOVIMENTO !!! ")
        	menu()
		}senao se(tipo =='N' ou tipo== 'n')
		{                
			escreva("G5 BANK AGRADECE !!!")
			escreva("\n■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■\n")           
		}senao 
		{
        		escreva("\n OPERAÇÃO INVALIDA ")
        	}
		escreva("\n","Aperte V para retornar")
		escreva("\n")
          leia(voltar)

          se(voltar == 'V' ou voltar == 'v' ){
            	limpa()
            	menu()
            	
            }
    }
    	
    	

    	
    	

    funcao sair()
            {
               menuEntrada()
            }
    

	funcao numeroDeMovimentos()
	{
		escreva("\n","Aperte V para retornar")
           leia(voltar)

            se(voltar == 'V')
            {
            	menu()
         	}
		
	}

	funcao saque(){
		escreva("\n■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■\n")
		escreva(" \nQuanto dinheiro você vai sacar ? \n")
		escreva("\n■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■\n")
        	leia(retirada)
		escreva("\n■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■\n")
        	se(saldo > 0.0)
        	{
        		se(saldo==0 ou saldo<0)
        		{
        		saldo = saldo - retirada
        		saldoatual = saldo
        		}
        	}
        	senao se ((saldo==0)ou(saldo<0))
        	{
        		escreva("\n■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■\n")
        		escreva(" OPERAÇÃO NÃO PERMITIDA !!!")
        		escreva("\n■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■\n")
        	}
        	senao
        	{
        		escreva("Operação não permitida")
        	}
        	
		escreva("\n","Aperte V para retornar")
          leia(voltar)

          se(voltar == 'V' ou voltar == 'v'){
            	menu()
            }
	}
	funcao deposito(){

		escreva("\n■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■\n")
        	escreva(" \n PODEMOS TE EMPRESTAR ",emprestimo," R$ \n"  )
        	escreva("\n■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■\n")
		escreva("\n Quanto dinheiro você quer emprestado ? \n")
		escreva("\n■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■\n")
        	leia(emprestado)
        	se( (emprestado >=0 e emprestado<=credito ))
        	{	 movimento++
        		se((movimento<2) e emprestado<emprestimo))
			         
			       	saldo = saldo + emprestado
			        	saldoatual = saldo
			        	emprestimo = emprestimo-saldo
			        	limpa()
			        	escreva(" VOCÊ FEZ ", movimento," MOVIMENTO !!! ")
			     	}
     	senao se(emprestado<0)
     	{
     		escreva("\n OPERAÇÃO INVALIDA ")
     	}
        	
      senao {
        		escreva("\n OPERAÇÃO INVALIDA ")
        	}
		escreva("\n","Aperte V para retornar")
		escreva("\n")
          leia(voltar)

          se(voltar == 'V' ou voltar == 'v' )
          {
            	limpa()
            	menu()
          }
		
	}
	
     funcao contaTalao()
    {
             
        caracter tipo

        para (inteiro x=0;x<10;x++){
            escreva ("\nImpressão de Talão de Cheque (S) para Sim, (N) para Não.")
            leia(tipo)
            se (tipo =='S' ou tipo== 's')
            {
                acumuladorTalao=acumuladorTalao++
                
                escreva("\nTalão de cheque impresso com sucesso")
                escreva("\nO saldo atual é de:", saldo)
                escreva("\nTotal de talão impresso até hoje: ",acumuladorTalao)
            }
            senao se(tipo =='N' ou tipo== 'n'){
                escreva("Obrigado por usar o G5 Bank!")
            }
            
            escreva("\n","Aperte V para retornar")
            escreva("\n")
            leia(voltar)
            se(voltar == 'V' ou voltar == 'v' ){
                menu()
            }
        }
    }
    funcao ContaUniversidade(){
    
    		caracter tipo 
   		escreva("\n","■■■■■■■■■■■■■■■■■■■■■■ Saldo Universitario :", saldoUniversitario," R$"," ■■■■■■■■■■■■■■■■■■■■■■","\n")
		escreva(" \n■■■■■■■■■■■■■ Crédito Universitario é de :", Creditouniversidade,"R$"," ■■■■■■■■■■■■■■","\n")
		escreva("\n Deseja adicionar credito ao Saldo atual ? ","\n","\n[S]Sim","\n","\n[N]Não","\n")
		leia(tipo)
		limpa()
		se (tipo =='S' ou tipo== 's') 
		{
		escreva("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■\n")	
		escreva("\n Quanto deseja adicionar ? \n")	
		escreva("\n■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■\n")	
		leia(dinheiro)
		} 
		senao se(tipo =='N' ou tipo== 'n')
		{                
			escreva("G5 BANK AGRADECE !!!")
			escreva("\n■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■\n")  
			menu()         
		}
		senao 
		{
        		escreva("\n OPERAÇÃO INVALIDA ")
        	}
		
			se ((movimento<2) e (dinheiro >=0 )e (dinheiro<=credito))             
		{
		movimento++
       	saldoUniversitario = saldoUniversitario + dinheiro
        	saldoAtualUni = saldoUniversitario
        	Creditouniversidade = Creditouniversidade-saldoUniversitario
        	limpa()
        	escreva("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■\n")	
		escreva("\Seu Saldo Universidade agora e de "+ saldoUniversitario+"\n")	
		escreva("\n■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■\n")	
        	escreva(" VOCÊ FEZ ", movimento," MOVIMENTO !!! ")
        	escreva("\n","Aperte V para retornar")
		escreva("\n")
          leia(voltar)
          se(voltar == 'V' ou voltar == 'v'){
            	menu()
            }
        	
		}
		{
        		escreva("\n OPERAÇÃO INVALIDA ")
        	}
		
		
    	
    }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 9303; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */