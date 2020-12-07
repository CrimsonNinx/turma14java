programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
	 inteiro vetor[3]
	 inteiro matriz[3][3]

	para(inteiro x=0;x<3;x++){
	vetor[x] = Util.sorteia(1,9)
	escreva(vetor[x]+" ")
		}
		escreva("\n")
		escreva("\nMatriz------------------")
		escreva("\n")
		escreva("\n")
		para(inteiro linha=0;linha<3;linha++){
			para(inteiro coluna=0;coluna<3;coluna++){
				matriz[linha][coluna] =Util.sorteia(1, 9)
				escreva(matriz[linha][coluna]+" ") 
			}
			escreva("\n")
		}
	
			//( ˘ ³˘)♥









		
	 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 259; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */