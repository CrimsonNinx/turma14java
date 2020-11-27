programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{ 	inteiro diaNascimento
		inteiro mesNascimento
		inteiro idade
		const inteiro anoAtual = 2020
		inteiro anoNascimento
	

		inteiro QTEAno = 365
		inteiro QTEMes = 30
		inteiro CalculoAnosEmdias

		escreva ("dia de nascimento e :")
		leia (diaNascimento)
		
		escreva ("mes de nascimento e : ")
		leia (mesNascimento)
		
		escreva ("ano de nascimento e : ")
		leia (anoNascimento)
		idade = anoAtual - anoNascimento
		escreva (idade)

		CalculoAnosEmdias = (idade *QTEAno) + (mesNascimento *QTEMes)
		escreva ("vc tem " + CalculoAnosEmdias +" dias de vida")
	//	escreva (CalculoAnosEmdias)




//1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias.

		
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 606; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */