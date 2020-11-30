programa
{
	
	funcao inicio()
	{  
		  inteiro idadeTotaldias 


            escreva ("Insira sua idade em dias: ")
            leia (idadeTotaldias)

            inteiro idadeAnos = idadeTotaldias/365

            inteiro idadeMeses = (idadeTotaldias%365)/30
            //cacula se o resto

            inteiro idadeDias= (idadeTotaldias%365)%30

            escreva ("Você tem ",idadeAnos," ano(s) ",idadeMeses," mes(es) e ",idadeDias," dia(s)")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 292; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */