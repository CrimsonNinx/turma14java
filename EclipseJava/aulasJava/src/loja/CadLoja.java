package loja;

import java.util.Scanner;

public class CadLoja {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		char generoCliente;
		
		int opcao;
		String nomeCliente;
		
		MenuInicial();
		opcao =leia.nextInt();
		
		switch (opcao) {
		case 1 :
		System.out.println("Compras");
		System.out.println("Infome o seu nome: ");
		nomeCliente =leia.next().toUpperCase();
		System.out.println("Voce se define como M-masculino,F-feminino ou O-outros ");
		
		generoCliente = leia.next().toUpperCase().charAt(0); 
		if(voltaGenero(generoCliente )=="Masculino") {
			System.out.println("Seja Bem vindo Senhor "+nomeCliente);
		}else if(voltaGenero(generoCliente )=="Feminino") {
			System.out.println("Seja Bem vindo Senhora "+nomeCliente);
		}else if(voltaGenero(generoCliente )=="Outros") {
			System.out.println("Seja Bem vinde  "+nomeCliente);
		}
		
		
		
		
		
		System.out.println("Seja bem vindo");
		
		break;	
		case 2 :
			System.out.println("Gerenciar Estoque");
		break;
		
		case 3 :
			System.out.println("Sair");
		break;
		
		}
		
		
	}
	private static String ToUpperCase() {
		// TODO Auto-generated method stub
		return null;
	}
	public static void linha() {
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■\n");
	}
	
	public  static void MenuInicial(){
		System.out.println(" \n■■■■■■■■■■■■■ BEM VINDO A J-ACTION! ■■■■■■■■■■■■■■■ ");
		System.out.println("\n♣♣♣♣♣♣♣♣♣♣♣♣ O que Voce deseja? ♣♣♣♣♣♣♣♣♣♣♣♣♣♣");
		System.out.println("\n■■■■■■■■ [1] - ► COMPRAR PRODUTOS ■■■■■■■■");
		System.out.println("\n■■■■■■■■ [2] - ► GERENCIAR ESTOQUE■■■■■■■■");
		System.out.println("\n■■■■■■■■ [3] - ► Sair             ■■■■■■■■");
			
		
	}
	public static String voltaGenero(char generoCliente ) {
		 String genero="X";
		
			 
		 
		 if (generoCliente == 'M')
			{
			 genero = "Maculino";
			}
			else if (generoCliente == 'F')
			{
				genero = "Feminino";
			}
			else if (generoCliente == 'O')
			{
				genero = "Outros";
			}
		 
		return genero;
	}
}
