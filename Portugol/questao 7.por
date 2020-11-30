programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{	real valorA, valorC, valorB, valorD, valorE, valorF
		real resultadoX,resultadoY

		escreva ("Digite o valor de A: ")
		leia(valorA)

		
		escreva ("Digite o valor de B: ")
		leia(valorB)

		escreva ("Digite o valor de c: ")
		leia(valorC)

		escreva ("Digite o valor de D: ")
		leia(valorD)

		escreva ("Digite o valor de E: ")
		leia(valorE)

		escreva ("Digite o valor de F: ")
		leia(valorF)

		
			resultadoX = ((valorC*valorE)-(valorB*valorF))/((valorA*valorE)-(valorB*valorD))
			resultadoY = ((valorA*valorF)-(valorC*valorD))/((valorA*valorE)-(valorB*valorD))
			
			escreva("O valor de x e ", Matematica.arredondar(resultadoX,2))
			escreva("\n")
			escreva("O valor de Y e ", Matematica.arredondar(resultadoY,2))
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 634; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */