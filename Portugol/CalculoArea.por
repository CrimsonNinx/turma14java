programa
{
	inclua biblioteca Matematica -->mat
	
	funcao inicio()
	{
		real baseTriangulo,alturaTriangulo,areaTriangulo
		
		real areaCirculo
		real areaRetangulo
		real raioCircuferencia
		real ladoRetangulo

		
	
		//retangulo
		escreva("digite o lado do retangulo:")
		leia(ladoRetangulo)

		
		//triangulo
		escreva("digite a base do triangulo:")
		leia(baseTriangulo)
		
		escreva("digite a altura do triangulo:")
		leia(alturaTriangulo)
		
		//circulo
		escreva("digite o raio da circunferencia:")
		leia(raioCircuferencia)


		
		//calculos
		areaCirculo = mat.PI* mat.potencia(raioCircuferencia,2)
		areaRetangulo = ladoRetangulo*ladoRetangulo
		areaTriangulo = (baseTriangulo*alturaTriangulo)/2
		
		
		escreva("A area do retangulo e: " +areaRetangulo)

		escreva("\n")

		escreva("A area do triangulo: " +areaTriangulo)
		
		escreva("\n")
		
		escreva("a area do circulo e: " + mat.arredondar(areaCirculo,2))
	

		

			
		
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 213; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */