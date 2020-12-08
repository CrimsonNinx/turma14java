package LISTA2JAva;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
	Scanner leia = new Scanner (System.in);
	int numero;
	
	System.out.println("Digite um numero");
	numero =leia.nextInt();
	leia.close();
	if(numero>100) {
		System.out.println("O numero "+numero+" e maior que 100");
	}else {
		numero=0;
		System.out.println(numero);
	}
	
	
	}

}
