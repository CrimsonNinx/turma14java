package LISTA2JAva;

import java.util.Scanner;

public class ex4Lista2 {
	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int numero;
		
		System.out.println("Digite um numero qualquer ");
		numero = leia.nextInt();
		leia.close();	
		
		
		
		if(numero%2==0)
		{
			if(numero>0) {
				System.out.println("o numero digitado e par e positivo");
		}else if(numero<0)
			{
				System.out.println("o numero digitado e par e negativo");
				
			}
		}
		else {
			if(numero>0)
			{
				System.out.println("o numero digitado e impar e positivo");
			}
			else if(numero<0) 
			{
				System.out.println("o numero digitado e impar e negativo");
			}
		}
	}

}
