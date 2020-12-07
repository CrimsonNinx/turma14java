package LISTA1;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner leia =new Scanner(System.in);
		int idadeTotalDias;
		int idadeMeses;
		int idadeAnos;
		int idadeDias;
		
		System.out.println("Digite seus dias vividos ");
		idadeTotalDias=leia.nextInt();
		
		idadeAnos =idadeTotalDias/365;
		idadeMeses =(idadeTotalDias%365)/30;
		idadeDias =(idadeTotalDias%365)%30;
		
		System.out.println("Voce tem "+ idadeAnos+" anos "+idadeMeses+" meses e "+idadeDias+" dias.");
		
		

	}

}
