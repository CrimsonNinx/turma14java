programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{	inteiro diaNascimento
		inteiro mesNascimento
		inteiro idade
		const inteiro anoAtual = 2020
		inteiro anoNascimento
	

		inteiro QTEAno = 365
		inteiro QTEMes = 30
		inteiro CalculoAnosEmdias
		real CalculoDiasEmAnos
		real DiasVividos
		inteiro mesesVividos

		//escreva ("dia de nascimento e :")
		//leia (diaNascimento)
		
		//escreva ("mes de nascimento e : ")
		//leia (mesNascimento)
		
		escreva ("ano de nascimento e : ")
		leia (anoNascimento)

	
		
		escreva (" Por quantos dias voce viveu ")
		leia (DiasVividos)
		
	//calculo em anos
	//	CalculoDiasEmAnos = DiasVividos/365
		//escreva("voce viveu por " +  Matematica.arredondar(CalculoDiasEmAnos,0)   + " anos")
		
	//	idade = anoAtual - anoNascimento
	//	escreva("\n")
	//	escreva (idade)
		//Calculo em dias
	//	CalculoAnosEmdias = (idade *QTEAno)
	//	escreva("\n")
	//	escreva ("voce viveu por " + CalculoAnosEmdias + " dias")
	//	escreva("\n")
	
		mesesVividos = (DiasVividos/QTEMes)
		escreva("\n")
		escreva ("voce viveu por " + mesesVividos+ " meses")
		escreva("\n")

		idade = DiasVividos/QTEAno
		escreva("Sua idade e de "  + idade + " anos" )

		
		
		

	
	
	}
	//2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-
	//a expressa em anos, meses e dias.

}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 593; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */