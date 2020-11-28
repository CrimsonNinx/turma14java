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
		escreva ("ano de nascimento e : ")
		leia (anoNascimento)
		escreva (" Por quantos dias voce viveu ")
		leia (DiasVividos)
		mesesVividos = (DiasVividos/QTEMes)
		escreva("\n")
		//calculo Meses
		escreva ("voce viveu por " + mesesVividos+ " meses")
		escreva("\n")
		//CalculoAnos
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
 * @POSICAO-CURSOR = 318; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */