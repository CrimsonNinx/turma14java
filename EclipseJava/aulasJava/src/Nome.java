import java.util.Scanner;

public class Nome {
public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
	//variaveis
	String nome;
	int anoNascimento;
	
	System.out.println("Digite o nome do usuario");
	nome = leia.next();
	System.out.println("Digite o ano de nascimento");
	
	anoNascimento = leia.nextInt();
	System.out.println("Nome: "+nome+(2020-anoNascimento));
}
}
