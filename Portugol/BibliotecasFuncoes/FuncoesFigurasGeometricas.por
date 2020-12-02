programa
{
	inclua biblioteca Matematica -->mat
	
	funcao inicio()
	{
		escreva("Olá Mundo")
	}

	//ESCRECE UMA LINHA
	funcao linha(){
		escreva("---------------------------------------\n")
	}
	//PULA UMA LINHA
	funcao pula(){
		escreva("\n")
	}
	//calculos de figuras geotricas
	funcao real lerAltura(real altura){
		escreva ("Digite o valor da altura: ")
		leia(altura)	
		retorne altura	
		
	}
	funcao real lerBase(real base){
		escreva ("Digite o valor da base: ")
		leia(base)	
		retorne base
		
	}
	funcao real lerRaio(real raioCirculo){
		escreva ("Digite o raio do Círculo: ")
		leia(raioCirculo)
		retorne raioCirculo
	}
	
	funcao  imprimirArea(real area){
		escreva( "A área é " +mat.arredondar(area,2))
	}
	funcao imprimirMenu(){
		escreva("Olá, escolha uma figura geométrica")
		escreva ("\n0-Triangulo\n1-Retangulo\n2-Circulo\n")	
	}
	funcao imprimirMensagem(){
		escreva(" Os valores digitados são inválidos, digite números maiores que 0")
	}
	
	funcao real calculaAreaRetangulo(real base, real altura){
			real area = altura * base
			retorne area 	
	}
	
	funcao real calculaAreaTriangulo(real base, real altura){
		real area = (base*altura)/2
		retorne area
	}
	
	funcao real calculaAreaCirculo(real raioCirculo){
		real area=mat.PI*(mat.potencia(raioCirculo,2))
		retorne area	
	}

	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 278; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */