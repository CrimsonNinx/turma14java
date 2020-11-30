programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
	real custoFabrica, custoConsumidor, custoDistribuidor, imposto
        escreva("Custo de fábrica do carro: ")
        leia(custoFabrica)

        custoDistribuidor= custoFabrica * 0.28
        imposto = custoFabrica * 0.45

        custoConsumidor = custoFabrica + imposto + custoDistribuidor

        escreva("O custo do carro para o consumidor é de R$", Matematica.arredondar(custoConsumidor,2))
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 12; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */