package LISTA4;

import java.util.Scanner;

public class Ex1 {
	
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int TAMANHO = 5;
		double pontos[] = new double[TAMANHO], maiorPonto = -99.0;

		for (int i = 0; i < TAMANHO; i++) {
			System.out.println("\nDigite a " + (i + 1) + " ponto:");
			pontos[i] = sc.nextDouble();
			if (pontos[i] > maiorPonto) {
				maiorPonto = pontos[i];
			}
		}
		System.out.println("Pontos:\n");

		for (int i = 0; i < TAMANHO; i++) {
			System.out.println(pontos[i] + "\n");
		}
		System.out.println("A maior pontuacao foi: " + maiorPonto);
		sc.close();
	}

}