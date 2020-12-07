package LISTA1;

import java.util.Scanner;

public class CparaF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		// TODO Auto-generated method stub
		double TemperaturaC;
		double TemperaturaF;
		
		System.out.println("Informe a temperaturaaem C : ");
		TemperaturaC =leia.nextDouble();
		
		TemperaturaF =(TemperaturaC *1.8) +32;
		System.out.println("A temperatura em F e"+Math.round(TemperaturaF));
		

	}

}
