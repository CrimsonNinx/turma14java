programa
{
	
	funcao inicio()
	{	inteiro pontos [5]
	inteiro maiorPontos=0

	para (inteiro x=0;x<5;x++){
		escreva("Digites todos os pontos\n")
		leia(pontos [x])

		se(pontos[x]>maiorPontos){
			maiorPontos = pontos[x]
		}
	}
	escreva("\n")
	para (inteiro x=0;x<5;x++){
	
		escreva("\n Os pontos sao "+pontos[x])
	}

	//enquanto (maiorPontos<pontos [5]){
	//	 maiorPontos= pontos [5]
		 
		escreva("\n")
		
		escreva("A maior pontuacao e "+maiorPontos)
	


		
	}
}
/*Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma atividade e o escreva em seguida. 
 * Encontre após a maior pontuação e a apresente. 
 */
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 192; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {pontos, 5, 11, 6};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */