package lista5;

import java.util.Scanner;

public class lista5_ex2 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double peso, altura, imc;
		
		System.out.println("VAMOS CALCULAR SEU IMC!");
		System.out.println("Digite seu peso (Kg): ");
		peso = leia.nextDouble();
		System.out.println("Digite sua altura (m): ");
		altura = leia.nextDouble();
		imc = peso/Math.pow(altura, 2);
		
		if(imc < 18.5) {
			System.out.printf("Seu IMC é de %.2f, você está abixo do peso ideal.", imc);
		} else if(imc >=18.5 && imc < 25) {
			System.out.printf("Seu IMC é de %.2f, seu peso é normal.", imc);
		} else if(imc>=25 && imc <=30) {
			System.out.printf("Seu IMC é de %.2f, você está acima do peso.", imc);
		} else {
			System.out.printf("Seu IMC é de %.2f, você está obeso.", imc);
		}
	}
}