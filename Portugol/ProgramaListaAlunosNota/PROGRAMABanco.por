programa
{
	funcao menuEntrada(){
        inteiro opcao
        escreva(" \nBEM VINDO AO G5 BANK ","\n")
        escreva("=================================================")
        escreva("\n DIGITE O NUMERO DA CONTA : ")
        leia(numeroUsuario)
        escreva("\n DIGITE O CPF : ")
        leia(cpfUser)

        se( numeroUsuario==numeroConta e cpfUser==cpf  )
        {

            menu()
        }
        senao
        {
            escreva(" CONTA INVALIDA ou CPF INVALIDO ! ")
            escreva("\n=================================================")

            menuEntrada()
        }

	}

    funcao menu()
    {
        inteiro opcao
        escreva(" \nBEM VINDO AO G5 BANK ","\n")
        escreva("=================================================")
        escreva("\n ESCOLHA UMA OPERAÇÃO : ")
        escreva("\n1- SALDO >>")
        escreva("\n2- SAQUE >>")
        escreva("\n3- EMPRÉSTIMO >>")
        escreva("\n4- SAIR >>","\n")
        escreva("==================================================","\n")
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
        sair()
        pare

        }
    }
    
	real saldo = 0.0
        real credito = 1000.0
        real debito = 0.0
        inteiro movimento[10]
        caracter voltar = 'x'
        inteiro numeroConta = 1
        cadeia nomeUsuario
        inteiro numeroUsuario = 0
        inteiro cpf =111
        inteiro cpfUser = 0
       real saldoatual =0
       real dinheiro = 0
       inteiro x=0
       inteiro dia = 5;
       real retirada
       inteiro teste =11
       
    funcao inicio()
    {
    		menuEntrada()
    		menu()
    }

    funcao olhaSaldo()
    {
            escreva("\n","Seu Saldo atual é de ",saldo," R$")
            escreva("\n=============================================================")
            
            se(credito<0){

			escreva("\nVoce nao pode mais pegar emprestimos!  ")
		}
            escreva("\n","Seu Credito atual é de ",credito - saldo ," R$")
            
            escreva("\n=============================================================")
            escreva("\n","Aperte V para retornar")
            leia(voltar)

		

            se(voltar == 'v'){
            	menu()
            }
    }

    funcao sair()
            {
               menuEntrada()
            }

	funcao numeroDeMovimentos(){
		escreva("\n","Aperte V para retornar")
           leia(voltar)

            se(voltar == 'v'){
            	menu()
            }
		
	}

	funcao saque(){
		escreva("Quanto dinheiro você vai sacar")
        	leia(retirada)

        	se(saldo > 0.0){
        		
        		saldo = saldo - retirada
        		saldoatual = saldo
        	}
        	senao{
        		escreva("Operação não permitida")
        		escreva("\n","Aperte V para retornar")
          leia(voltar)

          se(voltar == 'v'){
          	voltar ='x'
            	menu()
            }
        	}
        	
		
	}
	funcao deposito(){
		para(inteiro x =0;x<10;x++){
		escreva("Quanto voce quer de emprestimo ?  "+ teste-- +" vezes")
        	leia(dinheiro)
       	saldo = saldo + dinheiro
       	
       	
        	saldoatual = saldo
        	se(x>10){
        		escreva("voce nao pode mais fazer isso")
        	}
		}

		escreva("\n","Aperte V para retornar")
          leia(voltar)

          se(voltar == 'v'){
          	voltar ='x'
            	menu()
          
            }
		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 3384; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */