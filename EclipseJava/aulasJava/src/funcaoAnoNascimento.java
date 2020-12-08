

import java.lang.String;
import java.lang.System;
import java.util.Scanner;

public class funcaoAnoNascimento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia =new Scanner(System.in);
		int anoNascimento;
		System.out.println("Digite ANo Nascimento");
		
		anoNascimento =leia.nextInt();
	
		
		if(calculaIdade(anoNascimento)<=18) {
			
			System.out.println("Voce tem "+calculaIdade(anoNascimento)+" anos"+" e e classificado como infanto juvenil");
		}
		 else if(calculaIdade(anoNascimento)>18 && calculaIdade(anoNascimento)<=60)
		{
			
			System.out.println("Voce tem "+calculaIdade(anoNascimento)+" anos"+" e e classificado como adulto");
		}else {
			System.out.println("Voce tem "+calculaIdade(anoNascimento)+" anos"+" e e classificado como ");
		}
		
		
		leia.close();	
		
		
	
		
	}	//funcao que calcula a idade
	  public static int calculaIdade(int AnoNascimento) {
		int idade;
		 idade = 2020-AnoNascimento;
		
		
		 
		return idade;
	}
}
