package LISTA2JAva;

import java.util.Scanner;

public class Ex2Lista2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int horasTrabahadas;
		int horasTrabahadasPadrao = 50;
		double excessoTrabalho,salarioFuncionario;
	 final double salarioPorHora = 10.0;//constante
	 final double salarioPorHoraBonus = 20.0;//constante
		
		
		System.out.println("Quantas Horas voce trabalhou hoje? ");
		horasTrabahadas = leia.nextInt();
		leia.close();
		
		
		if(horasTrabahadas<=50 && horasTrabahadas>0){
			salarioFuncionario= horasTrabahadas *salarioPorHora;
			excessoTrabalho =0;
			System.out.println("Voce trabalhou por"+horasTrabahadas+" horas ,sem hora extra  e ganhou um salario de "+salarioFuncionario+" reais");
		}else if(horasTrabahadas>50)
		{
			excessoTrabalho=horasTrabahadas-50;
			salarioFuncionario= (horasTrabahadasPadrao *salarioPorHora)+(excessoTrabalho*salarioPorHoraBonus);
			System.out.println("Voce trabalhou por "+horasTrabahadas+" horas,com horas extra e ganhou um salario de "+salarioFuncionario+
					" reais fazendo "+excessoTrabalho+"Horas Extras");
		}
		
		
	}

}
