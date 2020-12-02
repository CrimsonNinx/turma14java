programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		 inteiro numeroLancamentos[10]
		 inteiro numDado[6] = {1,2,3,4,5,6}
		 inteiro media = 0
		 inteiro somaNum=0
		 inteiro cont =0
		 inteiro maiorNum =0

		 
		para( inteiro x=9;x>0;x--){
				numeroLancamentos[x] = Util.sorteia(1,6)
			escreva("Os numeros sorteados foram : " + numeroLancamentos[x])
			
			escreva("\n")
			//maiorPontuacao = 
			somaNum = numeroLancamentos[x]+somaNum
			
			se(numeroLancamentos[x]>maiorNum){
				maiorNum =numeroLancamentos[x]
			
			}
			
		}
		para( inteiro x=9;x>0;x--){
			se(numeroLancamentos[x]==maiorNum){
				cont++
				
			
				
				}
		
			
			}
	
		escreva(somaNum)
		
		escreva("\n")
		media=somaNum/10
		
		escreva("A media e "+media)
		escreva("\n")
		escreva("O maior numero e " +maiorNum+"e ele apareceu "+cont)

		
		
	}
	
	
}

/*Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa que gere um vetor com os lançamento
 * s, escreva esse vetor. A seguir determine e imprima a média aritmética dos lançamentos, contabilize e apresente 
 * também quantas foram as ocorrências da maior pontuação.

 */
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 637; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */