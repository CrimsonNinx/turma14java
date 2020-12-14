package PpOAtividade;

import java.util.Scanner;

public class LojaPOO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		produto produto1 = new produto();
		produto produto2 = new produto();
		produto produto3 = new produto();
		Scanner leia=new Scanner(System.in);
		int escolha=0;
		
		produto1.nomeProduto ="Vestidos";
		produto1.qteProduto=2;
		produto1.precoProduto=100;
		
		
		produto2.nomeProduto ="Camisa";
		produto2.qteProduto=5;
		produto2.precoProduto=150;
		
		produto2.nomeProduto ="Blusas";
		produto2.qteProduto=20;
		produto2.precoProduto=50;
		
		
		System.out.println("Qual Produto voce quer?");
		escolha =leia.nextInt();
		if (escolha==1) {
			System.out.println("Quantos ");
		}
		
		
		

	}

}
