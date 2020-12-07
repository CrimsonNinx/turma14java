package LISTA1;

import java.util.Scanner;

public class EX1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia =new Scanner(System.in);
		int idade;
		int mesNascimento;
		int diasVividosAno;
		int diasVividosMes;
		int diasVividosTotal;
		
		System.out.println("Digite sua idade");
		idade=leia.nextInt();
		System.out.println("Digite Seu mes de nascimento");
		mesNascimento=leia.nextInt();
		diasVividosAno =idade*365;
		diasVividosMes=mesNascimento*30;
		diasVividosTotal =diasVividosMes+diasVividosAno;
		System.out.println("Voce Viveu Por "+diasVividosTotal+" dias");
		
		
		

	}

}
