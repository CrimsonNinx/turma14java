programa
{
	inclua biblioteca Matematica -->mat
	
	funcao inicio()
	{
		real const HABITANTES = 3
		real numFilhos=0.0,totalFilhos=0.0,mediaNumFilhos=0.0
		real salario=0.0,totalSalario=0.0,mediaSalario=0.0,maiorSalario=0.0
		real pessoasQganham100ouMenos=0.0,percentualPessoasQganham100ouMenos=0.0


		para( inteiro habitantes=1;habitantes<=HABITANTES;habitantes++){
			escreva("Digite o salario do habitante: ")
			leia(salario)
			escreva("Quantos filhos o habitante tem: ")
			leia(numFilhos)


			//calculo Salario total
			totalSalario = totalSalario + salario
			//calculo do total de filhos
			totalFilhos = totalFilhos +numFilhos
			//para saber qual o maior salario
			se (maiorSalario<salario){
				maiorSalario = salario
			}
			//saber quanatas pessoas ganham 100 ou menos
			se(salario<=100){
			pessoasQganham100ouMenos++
				
			}
			//calculo media salario
			mediaSalario = mat.arredondar((totalSalario/HABITANTES),2)
			mediaNumFilhos = mat.arredondar((totalFilhos/HABITANTES),2)
			percentualPessoasQganham100ouMenos=(pessoasQganham100ouMenos/HABITANTES)*100

		 escreva("\n A Média dos Salarios e: "+ mediaSalario)
		 escreva("\n A Media de filhos e: ", mediaNumFilhos)
		 escreva("\nO Maior Salario e de:  ", maiorSalario)
	 escreva("\nO Percentual de pessoas com salário até R$100,00  e de: ", percentualPessoasQganham100ouMenos,"%")
		
			
			
			
			
			
			
		}
	}
}
		 /* 1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes,
		  coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:
		a) média do salário da população;
		
		b) média do número de filhos;
		
		c) maior salário;
		
		d) percentual de pessoas com salário até R$100,00.
		 */
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1205; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = vetor, matriz, funcao;
 */