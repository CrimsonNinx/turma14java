package LISTA1;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		int tempoSegundos, horas, minutos, segundos;
		
		System.out.println("Digite o tempo em Segundos ");
		tempoSegundos = leia.nextInt();
		
		horas = tempoSegundos/3600;
		System.out.println("Horas:"+horas);
		
		minutos= (tempoSegundos % 3600)/60;
		System.out.println("Minutos:"+minutos);
	    segundos = (tempoSegundos % 3600)%60;
		System.out.println("Segundos:"+segundos);
				
		
		
		

	}

}
