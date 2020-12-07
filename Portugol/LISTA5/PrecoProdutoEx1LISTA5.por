programa
{
	inclua biblioteca Matematica-->mat
	
	funcao inicio()
	{inteiro opcao

	real precoDoDisconto = 0.0
	real precoJuros =0.0
	real precoProduto =100.0
	real precoFinal =0.0
	escreva("Como voce vai querer pagar pelo seu Produto ?\n")
	escreva("(1) À vista em dinheiro ou cheque(2)À vista no cartão de crédito(3) parcelado em duas vezes s/juros(4)parcelado em tres vezes c/ juros de 10%")
	leia (opcao)
	escolha(opcao){

	caso 1:
	escreva("Voce tem 20% de desconto nesse metodo de pagamento")
	precoDoDisconto = (precoProduto*20)/100
	escreva("\no valor do desconto e de "+precoDoDisconto+" reais")
	precoFinal =precoProduto-precoDoDisconto
	escreva("\nVoce ira para "+precoFinal+" reais pelo produto")
	
	escreva("")
	pare
	caso 2:
	escreva("Voce tem 15% de desconto nesse metodo de pagamento")
	precoDoDisconto = (precoProduto*15)/100
	escreva("\no valor do desconto e de "+precoDoDisconto)
	precoFinal =precoProduto-precoDoDisconto
	escreva("\nVoce ira para "+precoFinal+" reais pelo produto")
	pare
	caso 3:
	escreva("Voce nao tem desconto nesse metodo de pagamento")
	precoProduto = precoProduto/2
	escreva("\nVoce ira para 2 vezes de "+precoProduto+" reais pelo produto")	
	pare
	caso 4:
	escreva("Voce tem 10% de juros nesse metodo de pagamento")
	precoJuros = (precoProduto*110)/100
	precoJuros =precoJuros-precoProduto
	escreva("\no valor do juros  e de "+precoJuros)
	precoFinal =precoProduto+precoJuros
	precoFinal=precoFinal/3
	escreva("\nVoce ira para pagar em 3 vezes de "+mat.arredondar(precoFinal, 2)+" reais pelo produto")	
	pare
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1521; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */