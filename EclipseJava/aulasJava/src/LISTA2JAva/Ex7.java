package LISTA2JAva;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
	Scanner leia = new Scanner (System.in);
	double base;
	double altura;
	double areaTriangulo;
	System.out.println("Digite a um numero positivo para a base");
	base = leia.nextInt();
	System.out.println("Digite a um numero positivo para a altura");
	altura = leia.nextInt();
	leia.close();
	if(base<=0 ||altura<=0) {
		System.out.println("Vc digitou um valor invalido para a base ou altura");
	}else {
		areaTriangulo = (base*altura)/2;
		System.out.println("A area do triangulo e "+areaTriangulo);
	}
	
	
	
	
	}
	

}
