programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{	const inteiro LINHA = 3,COLUNA = 3
		inteiro valorUsuario [LINHA][COLUNA]
		inteiro somaValores =0
		inteiro somadiagonal =0



		para(inteiro linha=0;linha<LINHA;linha++){
			para(inteiro coluna=0;coluna<COLUNA;coluna++){
				
			valorUsuario[linha][coluna] = Util.sorteia(1,6) 
			
			escreva(valorUsuario [linha][coluna]+"  ")
			

			somaValores = valorUsuario[linha][coluna]+somaValores
				//somadiagonal =valorUsuario[0][0]+valorUsuario[1][1]+valorUsuario[2][2]
				se(linha ==coluna){
					somadiagonal = somadiagonal + valorUsuario[linha][coluna]
				}

	
			}
		escreva("\n")
		}
 		escreva("\n")

		
		
		escreva("A soma dos valores e  " + somaValores+"e a soma das diagonais e " +somadiagonal )

	
		



		
	}
}


/*Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e em seguida, exiba a soma dos valores dela e a soma dos valores da 
 * primeira diagonal, ou seja, diagonal principal.

Nota Fiscal referente ao pagamento recebido na data 02/10/2020 Pelo serviço prestado de Instrutor Auxiliar Dev Júnior na Associação Generation.

33605902/0001 - 00

 * 
 */
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 468; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */