package java.lang;
import java.util.Scanner;

public class CelsiusParaF {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		// TODO Auto-generated method stub
		double TemperaturaC;
		double TemperaturaF;
		
		System.out.println("Informe a temperaturaaem F : ");
		TemperaturaF =leia.nextDouble();
		
		TemperaturaC = (TemperaturaF -32) / 1.8;
		
		System.out.println("A temperatura em C e"+TemperaturaC);
		
		
	}

}
