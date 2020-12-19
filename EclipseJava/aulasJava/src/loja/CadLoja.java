package loja;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import LojaExemplo.Produtos;

public class CadLoja {

	public static void main(String[] args) {

		// espada();

		Scanner leia = new Scanner(System.in);

		char generoCliente;
		int continua;
		double total = 0;
		int opcaoS;
		int tamanhoLinha;
		String nomeCliente;
		double preco = 0;
		// String produtos[] =
		// {"Mario","Link","Ellie","Joel","Luffy","Yoda","Sora","Killua","Gon","Roxas"};
		String CodigoProdutos[] = new String[10];
		//int Unidade[] = { 5, 4, 6, 2, 4, 9, 4, 8, 2, 1 };
		//int preco[] = { 100, 500, 264, 305, 145, 842, 458, 145, 250, 110 };
		int opcaoProduto = 0;
		int opcaoQuantidade;
		String codProduto;
		int quantidade = 0;
		char opcao ='S';
		char opS2;
		char continua2 = 'S';
		
		

		// System.out.println("Qual o tamanho da Linha ? ");

		// tamanhoLinha = leia.nextInt();
		// linha(tamanhoLinha);

		for (int x = 0; x < 10; x++) {
			CodigoProdutos[x] = "J-" + (x + 1);

		}

		List<Produtos> produtos = new ArrayList<>();
		produtos.add(new Produtos("J-01", "Mario", 250.00, 10));
		produtos.add(new Produtos("J-02", "Link", 300.00, 10));
		produtos.add(new Produtos("J-03", "Ellie", 150.00, 10));
		produtos.add(new Produtos("J-04", "Joel", 100.00, 10));
		produtos.add(new Produtos("J-05", "Luffy", 300.00, 10));
		produtos.add(new Produtos("J-06", "Yoda", 350.00, 10));
		produtos.add(new Produtos("J-07", "Sora", 500.00, 10));
		produtos.add(new Produtos("J-08", "Killua", 250.00, 10));
		produtos.add(new Produtos("J-09", "Gon", 100, 10));
		produtos.add(new Produtos("J-10", "Roxas", 700.00, 10));

		MenuInicial();
		System.out.println();
		opcaoS = leia.nextInt();

		switch (opcaoS) {
		case 1: {
			System.out.println("Infome o seu nome: ");
			nomeCliente = leia.next().toUpperCase();
			System.out.println("DIGITE O SEU ANO DE NASCIMENTO");
			int anoNascimento = leia.nextInt();
			System.out.println("Voce se define como M-masculino,F-feminino ou O-outros ");

			generoCliente = leia.next().toUpperCase().charAt(0);
			while (generoCliente != 'M' && generoCliente != 'F' && generoCliente != 'O') {

				System.out.println("Genero Incorreto.Voce se define como M-masculino,F-feminino ou O-outros ");
				generoCliente = leia.next().toUpperCase().charAt(0);
			}

			if (voltaGenero(generoCliente) == "Masculino") {
				System.out.println("Seja Bem vindo Senhor " + nomeCliente);
			} else if (voltaGenero(generoCliente) == "Feminino") {
				System.out.println("Seja Bem vinda Senhora " + nomeCliente);
			} else if (voltaGenero(generoCliente) == "Outros") {
				System.out.println("Seja Bem vinde  " + nomeCliente);
			}

			System.out.println("Deseja continuar Sim[1] ou Não[2] ");
			continua = leia.nextInt();

			while (continua != 1) {
				System.out.println("Deseja continuar Sim(S) ou Não(N) ");
				opcaoS = leia.nextInt();
				MenuInicial();
			}

			System.out.println("Cod. " + "\t" + " QTE" + "\t \t" + " Preco" + "\t \t" + "Figure" + "\t");

			for (Produtos produto : produtos) {
				System.out.println(produto.getCodigo() + "\t  " + produto.getQuantidadeEstoque() + "\t\t "
						+ produto.getPreco() + "\t\t" + produto.getNome());

			}
			int i = 1;
			while (i > 10 || opcao == 'S') {
				leia.nextLine();
				System.out.println("Digite o codigo do produto para comprar: ");
				codProduto = leia.nextLine().toUpperCase();
				System.out.println("Digite a quantidade desejada desse produto: ");
				quantidade = leia.nextInt();

				for (Produtos produto : produtos) {
					if (codProduto.equals(produto.getCodigo())) {
						total = total + produto.comprarProduto(quantidade);

					}
				}
				System.out.println("DESEJA CONTINUAR COMPRANDO S/N");
				opcao = leia.next().toUpperCase().charAt(0);
				while (opcao != 'S' && opcao != 'N') {
					System.out.println("OPÇÃO INVÁLIDA");
					System.out.println("DESEJA CONTINUAR COMPRANDO S/N");
					opcao = leia.next().toUpperCase().charAt(0);
				}

			}
			
			
			linha(60);
			System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
			System.out.println("            NOTA FISCAL            ");
			System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
			linha(60);
			
			
			for (Produtos produto : produtos) {
				if(produto.getQuantidadeEstoque() != 10) {
				System.out.println(produto.getCodigo() + "\t  " + quantidade + "\t\t "
						+ produto.getPreco() + "\t\t" + produto.getNome());
				}
			}
			
			
			System.out.println("\nO TOTAL A SER PAGO É: R$" + total);
			

			break;

		}
		case 2:

			do {
				System.out.println("[1] - ADICIONAR PRODUTO");
				System.out.println("[2] - REMOVER PRODUTO");
				System.out.println("[3] - ATUALIZAR PRODUTO");
				System.out.println("[4] - LISTA DE PRODUTOS");
				System.out.print("DIGITE A OPÇÃO:");
				opS2 = leia.next().charAt(0);

				while (opS2 != '1' && opS2 != '2' && opS2 != '3' && opS2 != '4') {
					System.out.println("ESCOLHA UMA OPÇÃO CORRETA");
					System.out.print("DIGITE A OPÇÃO:");
					opS2 = leia.next().charAt(0);
				}

				if (opS2 == '1') {
					linha(80);
					System.out.println("   LISTA DE PRODUTOS ESTOQUE    ");
					linha(80);
					System.out.println(" NOME\t\t  PREÇO\n");
					for(Produtos prod: produtos) {
						System.out.println(prod.getNome() + "\t  " + prod.getPreco());
					}
					
					System.out.println("DIGITE O NOME DO PRODUTO QUE DESEJA ADICIONAR");
					String nome = leia.next();
					System.out.println("DIGITE O PREÇO DO PRODUTO");
					preco = leia.nextDouble();
					Produtos produto = new Produtos(nome, preco);

					produtos.add(produto);

				} else if (opS2 == '2') {
					linha(80);
					System.out.println("    LISTA DE PRODUTOS EXISTENTES    ");
					linha(80);
					System.out.println(" NOME\t\t  PREÇO\n");
					for(Produtos prod: produtos) {
						System.out.println(prod.getNome() + "\t  " + prod.getPreco());
					}
					System.out.println("DIGITE O NOME DO PRODUTO QUE DESEJA REMOVER");
					String nome = leia.next();

					for (Produtos prod : produtos) {
						if (prod.getNome().equals(nome)) {
							produtos.remove(prod);
						}
					}

				} else if (opS2 == '3') {
					linha(80);
					System.out.println("   LISTA DE PRODUTOS EXISTENTES    ");
					linha(80);
					System.out.println(" NOME\t\t  PREÇO\n");
					for(Produtos prod: produtos) {
						System.out.println(prod.getNome() + "\t  " + prod.getPreco());
					}
					
					System.out.println("DIGITE O NOME DO PRODUTO QUE DESEJA ATUALIZAR");
					String nome = leia.next();
					System.out.println("DIGITE O NOVO NOME DO PRODUTO");
					String nomeNovo = leia.next();
					
					Produtos produto = new Produtos(nome);

					for (Produtos prod : produtos) {
						if (prod.getNome().equals(nome)) {
							prod.setNome(nomeNovo);
						}
					}

				} else if (opS2 =='4'){
					linha(80);
					System.out.println("   LISTA DE PRODUTOS EXISTENTES    ");
					linha(80);
					System.out.println(" NOME\t\t  PREÇO\n");
					for(Produtos prod: produtos) {
						System.out.println(prod.getNome() + "\t  " + prod.getPreco());
					}

				}
				
				System.out.println("\n\nDESEJA FAZER OUTRA AÇÃO? S/N");
				continua2 = leia.next().toUpperCase().charAt(0);
				while(continua2 != 'S' && continua2 != 'N') {
					System.out.println("Digite uma opção válida");
					System.out.println("[S]-SIM [N]-NÃO");
					continua2 = leia.next().toUpperCase().charAt(0);
				}

			
			
			
			}
			while(continua2 == 'S');
				
					break;
		case 3:
			
			System.out.println("OBRIGADO POR VISITAR A J-ACTION");
			
			
			System.out.print("Deseja continuar comprando?\n\n[S]-Sim [N]-Não\n");
			opcao = leia.next().toUpperCase().charAt(0);
			while (opcao != 'S' && opcao != 'N') {
				System.out.println("Digite uma opção válida");
				System.out.println("[S]-SIM [N]-NÃO");
				opcao = leia.next().toUpperCase().charAt(0);
			}
			break;
		}
			}

	private static String ToUpperCase() {
		// TODO Auto-generated method stub
		return null;
	}

	

	public static void MenuInicial() {

		System.out.println(" \n■■■■■■■■■■■■■ BEM VINDO A J-ACTION! ■■■■■■■■■■■■■■■ ");
		System.out.println("\n♣♣♣♣♣♣♣♣♣♣♣♣ O que Voce deseja? ♣♣♣♣♣♣♣♣♣♣♣♣♣♣");
		System.out.println("\n■■■■■■■■ [1] - ► COMPRAR PRODUTOS ■■■■■■■■");
		System.out.println("\n■■■■■■■■ [2] - ► GERENCIAR ESTOQUE■■■■■■■■");
		System.out.println("\n■■■■■■■■ [3] - ► Sair             ■■■■■■■■");

	}

	public static String voltaGenero(char generoCliente) {
		String genero = "";

		if (generoCliente == 'M') {

			genero = "Masculino";
		} else if (generoCliente == 'F') {
			genero = "Feminino";
		} else if (generoCliente == 'O') {
			genero = "Outros";
		}

		return genero;
	}

	public static void VoltarMenu() {
		char opcao;

		Scanner leia = new Scanner(System.in);

		System.out.println("Deseja continuar Sim(S) ou Não(N) ");
		opcao = leia.next().toUpperCase().charAt(0);
		leia.close();
		while (opcao != 'S' && opcao != 'N') {
			System.out.println("Deseja continuar Sim(S) ou Não(N) ");
			opcao = leia.next().toUpperCase().charAt(0);
		}

	}
	public static void linha(int tamanho) {
		for (int i = 0; i < tamanho; i++) {
			System.out.print("═");
		}
		System.out.print("\n");
	}

	public static void espada() {
		System.out.println("________________________($$$$$$$$$)__________________________");
		System.out.println("_________________________($$$$$$$)___________________________");
		System.out.println("_______________________($$$$$$$$$$$)_________________________");
		System.out.println("__________________________($$$$$)____________________________");
		System.out.println("_____($)___________________($$$$$)___________________($)______");
		System.out.println("____($$)___________________($$$$$)___________________($$)_____");
		System.out.println("___($$)____________________($$$$$)____________________($$)___");
		System.out.println("_($$)_____________________($$$$$)_____________________($$)__");
		System.out.println("__($$$)____________________($$$$$)____________________($$$)__");
		System.out.println("___($$$$)__________________($$$$$)__________________($$$$)____");
		System.out.println("___($$$$$)________________($$$$$)________________($$$$$)___");
		System.out.println("_____($$$$$)_______________($$$$$)_______________($$$$$)_____");
		System.out.println("______($$$$$)____________($$$$$$$$$)____________($$$$$)_______");
		System.out.println("________($$$$$$$)______($$$$$$$$$$$$$)______($$$$$$$)________");
		System.out.println("_____($$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$)_____");
		System.out.println("___________($$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$)____________");
		System.out.println("_______($$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$)______");
		System.out.println("_____________________($$$$$$$$$$$$$$$$$)_____________________");
		System.out.println("__________________________($$$$$$$)__________________________");
		System.out.println("________________________($$$$$$$$$$$)________________________");
		System.out.println("_______________________($$$_______$$$)_______________________");
		System.out.println("________________________($$$_____$$$)________________________");
		System.out.println("_____________________($____$$$_$$$____$)_____________________");
		System.out.println("______________________($$$$$$$^$$$$$$$)_____________________");
		System.out.println("_________________________($$$$^$$$$)________________________");
		System.out.println("__________________________($$$^$$$)_________________________");
		System.out.println("_______________________($__$$$^$$$__$)_______________________");
		System.out.println("________________________($$$$$^$$$$$)________________________");
		System.out.println("_________________________($$$$^$$$$)_________________________");
		System.out.println("____________________($____($$$^$$$)____$)____________________");
		System.out.println("____________________($$____$$$^$$$____$$)____________________");
		System.out.println("_____________________($$$$$$$$^$$$$$$$$)____________________");
		System.out.println("________________________($$$$$^$$$$$)________________________");
		System.out.println("__________________________($$$^$$$)__________________________");
		System.out.println("_________________________($$$$^$$$$)_________________________");
		System.out.println("________________________($$$$$^$$$$$)________________________");
		System.out.println("_______________________($$$$$$^$$$$$$)_______________________");
		System.out.println("_______________________($$$$$$^$$$$$$)_______________________");
		System.out.println("_______________________($$$$$$^$$$$$$)_______________________");
		System.out.println("_______________________($$$$$$^$$$$$$)_______________________");
		System.out.println("_______________________($$$$$$^$$$$$$)_______________________");
		System.out.println("_______________________($$$$$$^$$$$$$)_______________________");
		System.out.println("_______________________($$$$$$^$$$$$$)_______________________");
		System.out.println("________________________($$$$$^$$$$$)________________________");
		System.out.println("________________________($$$$$^$$$$$)________________________");
		System.out.println("________________________($$$$$^$$$$$)________________________");
		System.out.println("________________________($$$$$^$$$$$)________________________");
		System.out.println("________________________($$$$$^$$$$$)________________________");
		System.out.println("________________________($$$$$^$$$$$)________________________");
		System.out.println("________________________($$$$$^$$$$$)________________________");
		System.out.println("________________________($$$$$^$$$$$)________________________");
		System.out.println("________________________($$$$$^$$$$$)________________________");
		System.out.println("________________________($$$$$^$$$$$)________________________");
		System.out.println("_________________________($$$$^$$$$)_________________________");
		System.out.println("_________________________($$$$^$$$$)_________________________");
		System.out.println("_________________________($$$$^$$$$)_________________________");
		System.out.println("_________________________($$$$^$$$$)_________________________");
		System.out.println("_________________________($$$$^$$$$)_________________________");
		System.out.println("__________________________($$$^$$$)__________________________");
		System.out.println("__________________________($$$^$$$)__________________________");
		System.out.println("__________________________($$$^$$$)__________________________");
		System.out.println("___________________________($$^$$)___________________________");
		System.out.println("___________________________($$^$$)___________________________");
		System.out.println("___________________________($$^$$)___________________________");
		System.out.println("____________________________($^$)____________________________");
		System.out.println("____________________________($^$)____________________________");
		System.out.println("____________________________($$$)____________________________");
		System.out.println("_____________________________($)_____________________________");
		System.out.println();
	}

	/*
	
	 * /*public static void Logo(){
	 * 
	 * 
	 * ┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬███┬ ┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬███┬┴
	 * ┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬████┴┬┴┬ ┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴█┴┬█┬┴┬┴┬┴┬┴┬██┴┬┴┬┴┬┴
	 * ┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬█┬┴██┬┴┬┴┬┴┬██┴┬┴┬┴┬┴┬ █┬┴┬┴┬┴┬█┬┴┬┴┬┴█┴███┴██┬┴┬███┬┴┬┴█┴┬┴
	 * ██┬┴┬┴┬┴██┬┴┬┴┬█┬█████┬┴┬███┬┴┬┴██┬┴┬ ┴███┴┬┴┬██┴┬┴███┴████┬┴██████┬┴██┬┴┬┴
	 * ┬┴███┴┬┴█┴┬┴███┴████████████████┬┴┬┴┬ ┴┬┴┬██┴┬██┴┬██████┴┬┴███┴┬┴┬████┴┬┴┬█
	 * ┬█┬┴┬█┬┴┬████████┴┬┴┬┴██┬┴┬┴┬███┬┴┬██ ┴██┬┴███████████┴┬┴┬┴┬┴┬┴┬┴┬┴███████┴
	 * ┬██┴┬┴█████┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴█████┴┬ ┴┬█████████┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬████┴┬┴
	 * ┬┴┬████┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴██┬┴┬┴┬┴███┴┬┴┬ ┴█████┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬██┴┬┴┬┴┬██┴┬┴┬┴
	 * ██████┬┴┬┴┬┴┬┴┬┴██┬┴┬┴██┬┴┬┴┬┴███████ ┴█████┴┬┴┬██┴┬┴┬██┴┬┴┬██┴┬┴┬┴┬┴█████┴
	 * ┬████┴┬┴┬┴██┬┴┬┴██┬┴┬┴┬██┴┬┴┬┴┬██┴┬┴┬ ┴████┬┴┬┴┬██┴┬┴┬██┴┬┴┬┴██┬┴┬┴┬┴██┬┴┬┴
	 * ┬█████┬┴┬┴██┬┴┬┴██┬┴┬┴┬██┴┬┴┬┴┬███┬┴┬ ┴┬████┴┬┴┬██┴┬┴┬██┴┬┴┬┴██┬┴┬┴┬┴█████┴
	 * ┬█████┬┴┬┴██┬┴┬┴██┬┴┬┴┬██┴┬┴┬███┬┴███ ███┬███┬┴┬██┴┬┴┬██┴┬┴┬┴████┴████┴┬┴┬┴
	 * ██┬┴████┬┴███┴┬┴████┴████████████┴┬┴┬ █┬┴┬┴┬██┴█████┴████████┬┴┬┴┬┴██┬██┴┬┴
	 * ┬┴┬┴┬┴┬█████████████┬┴███┴┬┴┬██┴┬┴┬┴┬ ┴┬┴┬┴┬███┬██┴█████████┬┴┬┴████┴┬┴┬┴┬┴
	 * ┬┴┬┴┬┴██┬██┴┬███┬┴┬█████████┬┴┬┴┬┴┬┴┬ ┴┬┴┬┴┬┴┬┴██┬┴┬█┬┴┬┴██┬┴┬┴┬██┴┬┴┬┴┬┴┬┴
	 * ┬┴┬┴┬┴┬┴┬█┬┴████┬┴┬██┴┬┴┬┴┬██┴┬┴┬┴┬┴┬ ┴┬┴┬┴┬┴┬┴┬┴┬████┴┬┴██┬┴┬┴┬┴┬█┬┴┬┴┬┴┬┴
	 * ┬┴┬┴┬┴┬┴┬┴┬┴┬┴██┬┴██┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬ ┴┬┴┬┴┬┴┬┴┬┴┬┴┬██┴┬█┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴
	 * ┬┴┬┴┬┴┬┴┬┴┬┴┬███┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬ ┴┬┴┬┴┬┴┬┴┬┴┬┴█┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴ }
	 *
	 
	 * 
	
	 * 
	 * 
	
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	public static void inseriLinha(int tamanho, String simbolo) {
		for (int i = 0; i < tamanho; i++) {
			System.out.print(simbolo);
		}
		System.out.println();

	}

}
