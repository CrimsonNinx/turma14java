package lista5;

public class ex4 {
	public static void main(String[] args) {
		double soma=0.0, somaL=0.0;
		int dividendo=1;
		
		for(int i=1; i<50; i++) {
			dividendo += 2;
			somaL += (dividendo/(i+1)); 
			System.out.print(dividendo +  "/" +  (i+1) + " + ");			
		}
		soma = 1 + somaL;
		System.out.println("\nA soma das frações é: " + soma);
	}
}