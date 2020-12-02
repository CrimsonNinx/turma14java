programa
{
	
	funcao inicio()
	{
		//variaveis
		inteiro numero
		escreva("digite um numero positivo inteiro:")
		leia(numero)
		
		senao se (numero ==0){
			escreva("Vc digitou o zero!!")
		}
		senao
		{
			se ( (numero%2) == 0 )
			{	se(numero>0){
					escreva ("O numero digitado e positivo e ")
							}
				senao se(numero<0){
					escreva ("o numero digitado e negativo e ")
					}
			
				escreva(" o numero digitado é par!!")
			}
			senao
			{	se(numero>0){
					escreva ("O numero digitado e positivo e ")
							}
				senao se(numero<0){
					escreva ("o numero digitado e negativo e ")
					}
					escreva(" o numero digitado é impar!!")
			}
		}
		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 621; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */