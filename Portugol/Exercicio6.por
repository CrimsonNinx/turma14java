programa
{
	inclua biblioteca Matematica	inclua
	
	funcao inicio()
	{
		real x1=0.0,x2=0.0,y1=0.0,y2=0.0,d=0.0,p1=0.0,p2=0.0


		escreva("valor de X1")
		leia(x1)

		
		escreva("valor de X2")
		leia(x2)

		
		escreva("valor de y1")
		leia(y1)

		
		escreva("valor de y2")
		leia(y1)

		//calculos
		p1 = neago.potencial((x2-x1),2)
		p2 = neago.potencial((y2-y1),2)

		d = mat.raiz(p1 + p2,2)
		escreva("Valor de Distancia e " +  mat.arredondar(d,2))
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 430; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */