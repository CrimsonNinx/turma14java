programa
{
	funcao inicio()
	{	inteiro media
		inteiro n1,n2 ,n3,r1,r2,r3
		inteiro p1=2,p2=3,p3=5
		inteiro pesoTotal
		escreva("insira sua primeira nota : ")	
		leia(n1)
		//multiplica a nota(n1,n2,n3 pelo peso,2,3,5
		r1 = n1*p1	
		
		escreva("insira sua primeira nota : ")	
		leia(n2)
		
		r2 =n2*p2
		escreva("insira sua primeira nota : ")
			
		leia(n3)
		r3 = n3*p2
		//somadas notas divido pela soma dos pesos
		pesoTotal = (p1+p2+p3)
		media = (r1 + r2 +r3)/pesoTotal
		escreva (media)
		//media = (n1 +n2 n3)/3	
	}
	//Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5, respectivamente.
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 359; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */