package LISTA2JAva;

import java.util.Scanner;

public class Ex6Lista2 {
public static void main(String[] args) {
	
	
	Scanner leia = new Scanner (System.in);
	int idadeNadador;
	leia.close();
	
	
	System.out.println("Digite a Idade do nadador");
	idadeNadador = leia.nextInt();
	
	if (idadeNadador<5){
		
		System.out.println("Voce ainda nao tem idade para ser classificado");
		}
	else if (idadeNadador<=5){
	
		System.out.println("Voce esta classificado  na categoria infantil A");
		
		}
	else if (idadeNadador<=8 || idadeNadador<=11)
		{
		System.out.println("Voce esta classificado  na categoria infantil B");
		}

	else if(idadeNadador<=12 || idadeNadador<=13)
		{
		System.out.println("Voce esta classificado  na categoria Julvenil A");
		}

	else if(idadeNadador<=14 || idadeNadador<=17)
		{
		System.out.println("Voce esta classificado  na categoria Julvenil B");
		}
	else
		{
		System.out.println("Voce esta classificado  na categoria adultos");
		}
	

	
	
}
	
	
	
		
}
