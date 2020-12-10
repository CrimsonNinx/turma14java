package LISTA1;


import java.util.Scanner;

public class LojaBia{

	public static void main(String[] args)

	{

		Scanner leia = new Scanner(System.in);


		inserirLinha(80,"■");
		System.out.println("                             ꧁Cherin de Capim꧂");
		inserirLinha(80,"■");
		System.out.println();

		System.out.println("         █■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■█");
		System.out.println("         █■■■■■■■■■■■■■   [1] ▶ COMPRAR PRODUTOS    ■■■■■■■■■■■■■■█");
		System.out.println("         █■■■■■■■■■■■■■   [2] ▶ GERENCIAR ESTOQUE   ■■■■■■■■■■■■■■█");
		System.out.println("         █■■■■■■■■■■■■■   [3] ▶ SAIR                ■■■■■■■■■■■■■■█");
		System.out.println("         █■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■█");
		System.out.print("                              DIGITE A OPÇÃO: ");
		System.out.print(" \n");
		inserirLinha(80,"■");
		char opcaoMenu = leia.next().charAt(0); // 
		inserirLinha(80,"■");
		switch (opcaoMenu)
		{

		case '1':
		{
			leia.nextLine();
			System.out.print("Por favor informe o seu nome: ");
			String nomeCliente = leia.nextLine();
			System.out.print("Você se define como M-masculino, F-feminino ou O-outro :");
			char generoCliente = leia.next().toUpperCase().charAt(0);
			
			if(boasVindas(generoCliente )=="Masculino") {
				System.out.println("Seja Bem vindo Senhor ");
			}else if(boasVindas(generoCliente )=="Feminino") {
				System.out.println("Seja Bem vinda Senhora ");
			}else if(boasVindas(generoCliente )=="Outros") {
				System.out.println("Seja Bem vinde  ");
			}
			
			boasVindas(generoCliente);


			break;

		}
		case '2':
		{
			System.out.println("WIP");
			break;
		}
		case '3':
		{
			System.out.println("Volte sempre!!!");
			break;
		}

		}


	}

	public static String boasVindas(char generoCliente) {

		//se sexo == F 
		String saudacao;

		if (generoCliente== 'M' ){
			saudacao = "Masculino";
		}
		else if(generoCliente == 'F' ) {
			saudacao = "Feminino";
		}
		else if(generoCliente == 'O' ){
			saudacao = "Outros";
		}
		else {
			saudacao = "Erro";
		}
		return saudacao;
	}



	public static void inserirLinha(int tamanho, String simbolo) {

		for (int i = 0; i < tamanho; i++) {
			System.out.print(simbolo);
		}
		System.out.println();
	}



}