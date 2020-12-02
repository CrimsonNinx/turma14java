programa
{
	
	funcao inicio()
	{
		inteiro horasTrabahadas
		inteiro horasTrabahadasPadrao = 50
		real excessoTrabalho,salarioFuncionario
		const  real salarioPorHora = 10.0
		const  real salarioPorHoraBonus = 20.0
		
	escreva("Digite o numero de horas que vc trabalhou: ")
	leia(horasTrabahadas)

	se(horasTrabahadas<=50 e horasTrabahadas>0){
		salarioFuncionario= horasTrabahadas *salarioPorHora
		excessoTrabalho = 0
		escreva ("Voce trabalhou por "+horasTrabahadas+" horas,sem hora extra e ganhou um salario de "+salarioFuncionario+"reais")
	   }
	   senao se (horasTrabahadas>50){
	   	excessoTrabalho = horasTrabahadas-50
	   	salarioFuncionario= (horasTrabahadasPadrao *salarioPorHora)+(excessoTrabalho*salarioPorHoraBonus)
	   	escreva ("Voce trabalhou por "+horasTrabahadas+" horas,com horas extra e ganhou um salario de "+salarioFuncionario+" reais fazendo 	"+
	   excessoTrabalho+" Horas Extras"	)
			
	   	
	   }
		
	}
}

/*Elabore um sistema que leia as variáveis C e N, respectivamente código e número de horas trabalhadas de um operário. E calcule o salário
sabendo-se que ele ganha R$ 10,00 por hora. Quando o número de horas exceder a 50 calcule o excesso de pagamento armazenando-o na variável
E, caso contrário zerar tal variável. A hora excedente de trabalho vale R$ 20,00. No final do processamento imprimir o salário total e o
salário excedente.*/

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 868; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */