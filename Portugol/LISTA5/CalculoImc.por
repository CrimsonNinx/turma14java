programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real imc = 0.0
		real altura = 0.0
		real peso=0


		escreva("CALCULO DE IMC")
		escreva("Infome seu peso e altura respectivamente\n")
		leia(peso)
		leia(altura)
		imc =(peso/mat.potencia(altura, 2.0))
		

		se(imc<=18.5 e imc >0){
			escreva("Seu Imc e de "+mat.arredondar(imc, 2)+" Voce esta abaixo do peso")
		}senao se(imc>18.5 e imc<=25){
			escreva("Seu Imc e de "+mat.arredondar(imc, 2)+" Voce esta no  peso normal")
		}senao se(imc>25 e imc<=30){
			escreva("Seu Imc e de "+mat.arredondar(imc, 2)+" Voce esta acima do peso")
		}senao se(imc>30){
			escreva("Seu Imc e de "+mat.arredondar(imc, 2)+" Voce esta obeso")
		}senao{
			escreva("Digite um valor valido de altura(0.0)e peso positivos!")
		}
		
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 279; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */