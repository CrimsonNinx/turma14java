package LISTA1;
import java.util.Scanner;

public class FparaC {

	public static void main(String[] args) 
	{
		Scanner leia = new Scanner (System.in);
		double temperaturaC, temperaturaF;
		System.out.println("Informe a temperatura em F: ");
		temperaturaF=leia.nextDouble();
		temperaturaC = (temperaturaF -32) / 1.8;
		System.out.println("A temperatura em C é: "+Math.round(temperaturaC));
		
	}

}
