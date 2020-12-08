package LISTA2JAva;

import java.util.Scanner;

public class Ex1Tomates {

	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
			int pesoTomates;
			double tomatesExcesso,valorDaMulta;
			
			 double MULTAPORKG = 4.0;//Como eu faco  constante em java???
			System.out.println("Digite o peso de tomates que esta carregando: ");
			pesoTomates = leia.nextInt();
			leia.close();
			
			if(pesoTomates<=50 && pesoTomates>=0){
			
			System.out.println("Voce nao paga nenhum imposto pelo seus tomates");
			}else if(pesoTomates>50) {
				tomatesExcesso = pesoTomates - 50;
			   valorDaMulta = tomatesExcesso*MULTAPORKG;
				System.out.println("Voce Excedeu o peso de tormates permitido e vai pagar uma multa de "+valorDaMulta+ " reais pelos tomates");
			}else if(pesoTomates<0){
				System.out.println("Isso nao e um numero valido de tomates que voce pode ter");
			}
			
			
			
			
		
		
	}

}
