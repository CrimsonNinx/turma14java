programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		real raio, area, base, altura

		escreva("|||| Área do Círculo ||||")
		escreva("\n\nInforme a medida do raio do círculo: ")
		leia(raio)

		area = Matematica.PI * (Matematica.potencia(raio, 2))

		escreva("A área do círculo é ", Matematica.arredondar(area, 2))


		escreva("\n\n|||| Área do Triângulo ||||")
		escreva("\nInforme a base do triângulo: ")
		leia(base)

		escreva("Informe a altura do triângulo: ")
		leia(altura)

		area = (base * altura) / 2

		escreva("A área do triângulo é ", Matematica.arredondar(area, 2))

		escreva("\n\n|||| Área do Retangulo ||||")
		escreva("\nInforme a base do retangulo: ")
		leia(base)

		escreva("Informe a altura do retangulo: ")
		leia(altura)

		area = (base * altura)

		escreva("A área do retangulo é ", Matematica.arredondar(area, 2))

		escreva("Programa encerrado")
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 328; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */