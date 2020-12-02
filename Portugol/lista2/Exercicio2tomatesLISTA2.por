programa
{
	
	funcao inicio()
	{
		inteiro pesoTomates
		real tomatesExcesso,valorDaMulta
		const real MULTAPORKG = 4.0


		escreva("Quantos Kg de tomate voce tem? ")
		leia(pesoTomates)

	se (pesoTomates<=50 e pesoTomates>=0)	{
		escreva("Voce nao paga nenhum imposto pelo seus tomates")
						}
	senao se (pesoTomates>50){
		
		tomatesExcesso = pesoTomates - 50
		valorDaMulta = tomatesExcesso*MULTAPORKG
		escreva ("voce excedeu o valor dos tomates em " +tomatesExcesso + "e vai pagar uma multa de "+valorDaMulta+" reais." )
		
		
						}
	senao se(pesoTomates<0)  {
		
					escreva(pesoTomates + " Isso nao e um numero valido de tomates que voce pode ter")		
						}
			
					
		
	}
}


/*João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho. Toda vez que ele traz
um peso de tomate maior que o estabelecido pelo regulamento do estado de São Paulo (50 quilos) deve pagar um multa de R$ 4,00 por quilo 
excedente. João precisa que você faça um sistema que leia a variável P (peso de tomates) e verifique se há excesso. Se houver, gravar na 
variável E (Excesso) e na variável M o valor da multa que João deverá pagar. Caso contrário mostrar tais variáveis com o conteúdo ZERO.
*/

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 598; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */