package contas;

import java.util.Scanner;

public class BancoBase {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		char debitoCredito;
		double credito = 0;
		double debito = 0;
		double saldo = 0;
		int numeroConta = 0;
		int menu;
		int opcaoMenu = 0;
		char op;
		final int mov = 10;
		char continuaMov = 'N';
		char continuaMenu = '0';

		String nomeCliente = "Ednilson Nascimento";

		linha();
		System.out.print("\n              BANCO G5 \n");
		linha();
		System.out.print("\nDIGITE O SEU NÚMERO DE CONTA: ");
		numeroConta = leia.nextInt();

		System.out.println("■■■■■■■ DETALHES DA CONTA ■■■■■■");
		System.out.println("[1] - Abertura de conta");
		System.out.println("[2] - Acesso a uma conta existente ");
		System.out.println("[3] - Sair");
		System.out.println("    ■■■■■■■ BEM VINDO ■■■■■■");

		menu = leia.nextInt();

		if (menu == 1) {

			System.out.println("\n");
			System.out.printf("\nOlá " + nomeCliente + "\n");
			System.out.println("■■■■■■■ CONTAS DISPONÍVEIS ■■■■■■");
			System.out.println("■[1] - Conta Corrente");
			System.out.println("■[2] - Conta Poupança");
			System.out.println("■[3] - Conta Especial");
			System.out.println("■[4] - Conta Empresa");
			System.out.println("■[5] - Conta Universitária");
			System.out.println("■[6] - SAIR");

			menu = leia.nextInt();

			do {
				switch (menu) {

				case 1:

					System.out.println("EM CONTRUÇÃO!!");
					sair();
					break;

				case 2:

					System.out.println("EM CONTRUÇÃO!!");
					sair();
					break;

				case 3:

					System.out.println("EM CONTRUÇÃO!!");
					sair();
					break;

				case 4:
					// COMEÇA CODIGO EMPRESTIMO
					ContaEmpresa empresa = new ContaEmpresa(numeroConta, 10000); // VALOR DE LIMITE EMPRESTIMO É 10 MIL
																					// REAIS

					String cpf;
					char opcao;
					char opcaoSimouNao;
					double valorEmprestimo = 0.0;
					double valor;

					for (int x = 0; x < 10; x++) {

						System.out.println("■■■■■■■ CONTA EMPRESA ■■■■■■");
						System.out.println("DIGITE SEU CPF");
						cpf = leia.next();
						linha();

						System.out.printf("\nOlá " + nomeCliente + "\n");
						linha();
						System.out.println("\nSeu SALDO atual é: " + empresa.getSaldo());
						linha();
						System.out.println("\nQual a operação que deseja fazer? ");
						System.out.println("[C] CRÉDITO ou [D] DÉBITO");
						opcao = leia.next().toUpperCase().charAt(0);

						if (opcao == 'C') {
							linha();
							System.out.println("\nSeu SALDO atual é: " + empresa.getSaldo());
							linha();

							System.out.println("\n" + nomeCliente + ", Digite o valor para CREDITAR: ");
							valor = leia.nextDouble();
							empresa.credito(valor);

							System.out.println("Saldo Atual: " + empresa.getSaldo());

							System.out.println("Deseja Continuar?");
							System.out.println("Para [S]Sim ou [N]Não");
							opcaoSimouNao = leia.next().toUpperCase().charAt(0);

							if (opcaoSimouNao == 'N') {
								break;
							}

						} else if (opcao == 'D') {
							linha();
							System.out.println("\nSeu SALDO atual é: " + empresa.getSaldo());
							linha();

							System.out.println("\n" + nomeCliente + ", Digite o valor para DEBITAR:");
							valor = leia.nextDouble();
							empresa.debito(valor);

							System.out.println("Seu SALDO atual é: " + empresa.getSaldo());

							System.out.println("Deseja Continuar?");
							System.out.println("Para [S]Sim ou [N]Não");
							opcaoSimouNao = leia.next().toUpperCase().charAt(0);

							if (opcaoSimouNao == 'N') {
								break;
							}

						} else {
							System.out.println("OPERAÇÃO INVÁLIDA!! ");
							System.out.println("Procure seu gerente");
						}

						// COMEÇA CODIGO EMPRESTIMO

						empresa.emprestimoSolicitado(valorEmprestimo);

						double limiteEmprestimo = 10000;
						linha();
						System.out.println("\nVocê gostaria de um EMPRESTIMO HOJE?");
						System.out.println("TEMOS ÓTIMAS CONDIÇÕES PARA VOCÊ!!");
						linha();
						System.out.println("Para [S]Sim ou [N]Não");
						opcaoSimouNao = leia.next().toUpperCase().charAt(0);

						if (opcaoSimouNao == 'S') {
							System.out.printf(
									"Olá " + nomeCliente + " ,que bom que aproveitou a melhor condição do mercado!");

							System.out.printf("\nQuanto você gostaria de pegar?");
							valorEmprestimo = leia.nextDouble();

							if (valorEmprestimo > 0 && valorEmprestimo <= limiteEmprestimo) {

								empresa.setSaldo(empresa.getSaldo() + valorEmprestimo);

								System.out.printf("\n PARABÉNS! Você acabou de adquirir R$ %f\n", valorEmprestimo);
								System.out.printf("\nSeu saldo atual é %f", empresa.getSaldo(), "\n");
							}

						}
					}

					// TERMINA CODIGO EMPRESTIMO

					break;

				case 5:

					System.out.println("Qual o valor de limite?");
					contaUniversitariaPOO contaU = new contaUniversitariaPOO(numeroConta, leia.nextDouble());
					do {
						menuInicial();
						opcaoMenu = leia.next().charAt(0);

						switch (opcaoMenu) {
						case '1':
							for (int i = 0; i < mov; i++) {
								System.out.println("Movimento " + (i + 1));
								System.out.println("[C]-CRÉDITO / [D]-DÉBITO:_");
								op = leia.next().toUpperCase().charAt(0);

								if (op == 'C') {
									if (i == (mov - 1)) {
										System.out.println("Digite o valor creditado:_");
										double valorCredito = leia.nextDouble();
										contaU.credito(valorCredito);
										contaU.restituiLimiteCadastrado();
										System.out.println("SALDO ATUAL: " + contaU.getSaldo());
										System.out.println("LIMITE DISPONÍVEL: " + contaU.getLimite());
									} else {
										System.out.println("Digite o valor creditado:_");
										double valorCredito = leia.nextDouble();
										contaU.credito(valorCredito);
										contaU.restituiLimiteCadastrado();
										System.out.println("SALDO ATUAL: " + contaU.getSaldo());
										System.out.println("LIMITE DISPONÍVEL: " + contaU.getLimite());
										System.out.println("\nDESEJA CONTINUAR AS MOVIMENTAÇÕES? S/N");
										continuaMov = leia.next().toUpperCase().charAt(0);
										if (continuaMov == 'N') {
											break;
										}
									}

								} else if (op == 'D') {
									if (i == (mov - 1)) {
										System.out.println("Digite o valor a ser debitado:_");
										double valorDebito = leia.nextDouble();
										contaU.testarSaldo(valorDebito);
										contaU.debito(valorDebito);
										System.out.println("SALDO ATUAL: " + contaU.getSaldo());
										System.out.println("LIMITE DISPONÍVEL: " + contaU.getLimite());
									} else {
										System.out.println("Digite o valor a ser debitado:_");
										double valorDebito = leia.nextDouble();
										contaU.testarSaldo(valorDebito);
										contaU.debito(valorDebito);
										System.out.println("SALDO ATUAL: " + contaU.getSaldo());
										System.out.println("LIMITE DISPONÍVEL: " + contaU.getLimite());
										System.out.println("\nDESEJA CONTINUAR AS MOVIMENTAÇÕES? S/N");
										continuaMov = leia.next().toUpperCase().charAt(0);
										if (continuaMov == 'N') {
											break;
										}
									}

								}
							}

							break;

						case '2':
							System.out.println("NÚMERO DA CONTA: " + contaU.getNumeroConta());
							System.out.println("SALTO ATUAL: " + contaU.getSaldo());
							System.out.println("LIMITE DISPONÍVEL: R$" + contaU.getLimite());
							System.out.println("DESEJA VOLTAR AO MENU INICIAL? S/N");
							continuaMenu = leia.next().toUpperCase().charAt(0);
							break;

						case '3':
							System.out.println("OBRIGADO POR UTILIZAR O G1-BANK!");
							break;
						}
					} while (continuaMov == 'N');
					break;

				}
			} while (true);
		} else if (menu == 2) {
			System.out.println("wip");
		} else {

		}

		leia.close();
	}

	// FUNCOES
	public static void menuInicial() {
		linha(15);
		pula();
		System.out.println("[1] - MOVIMENTAÇÃO");
		System.out.println("[2] - SALDO");
		System.out.println("[3] - SAIR");
		linha(15);

	}

	public static void sair() {
		linha();
		System.out.println("\nAGRADECEMOS POR USAR O G5 BANK, ATÉ A PRÓXIMA");
		linha();
	}

	public static void linha(int tamanho) {
		for (int x = 0; x < tamanho; x++) {
			System.out.print("💸");
		}
	}

	static void pula() {
		System.out.println();
	}

	public static void linha() {
		for (byte x = 0; x < 35; x++) {
			System.out.print("■");
		}
	}
}