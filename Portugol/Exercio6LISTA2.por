programa
{
	
	funcao inicio()
	{		inteiro idade
	
	escreva("Digite sua idade para vizualizar em qual faixa voce se encaixa")
	
	leia (idade)

			se (idade<5){
			escreva("Voce ainda nao tem idade para ser classificado")
			}
			senao se (idade<=5){
			escreva("Voce esta classificado  na categoria infantil A" )
			}
			senao se (idade<=8 ou idade<=11)
			{
				escreva("Voce esta classificado na categoria infantil B" )
			}

			senao se (idade<=12 ou idade<=13)
			{
				escreva("Voce esta classificado na categoria Juvenil A" )
			}

			senao se (idade<=14 ou idade<=17)
			{
				escreva("Voce esta classificado  na categoria Juvenil B" )
			}
			senao 
			{
				escreva("Voce esta classificado  na categoria Adultos " )
			}

			
			
	
//Elabore um sistema que dada a idade de um nadador classifique-o em uma das seguintes categorias:
//Infantil A = 5 a 7 anos
//Infantil B = 8 a 11 anos
//Juvenil A = 12 a 13 anos
//Juvenil B = 14 a 17 anos
//Adultos = Maiores de 18 anos	
		
	}
}



/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 445; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */