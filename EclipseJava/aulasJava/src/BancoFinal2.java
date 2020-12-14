import java.util.Random;
import java.util.Scanner;

public class BancoFinal2 {
	static Scanner leia = new Scanner(System.in);
	static Random random = new Random();

	// VETORES

	static int tipoConta[] = new int[40]; // IDENTIFICAR O TIPO DE CONTA DE CADA CLIENTE;
	static String nomeCLientes[] = { "Allen de Lima Vieira", "André de Brito Silva da Costa", "Bárbara Liboni Guerra",
			"Beatriz Martins", "Beymar Jhoel Acapa Lima", "Breno Nogueira Botelho Noccioli",
			"Daniel Augusto Gomes Ferreira Filho", "Danilo Mendes Ferreira", "Danilo Pereira da Silva",
			"Davi Silva Vieira", "Diego Vinicio da Silva Nascimento", "Erick Costa Ferreira", "Ewerton Inacio Lima",
			"FERNANDA AGAPITO", "Fernanda Barbosa Ferraz", "Francisco José Pires",
			"Gabriel Sérgio Nascimento Santos Gonçalves", "Gideão da Silva Idelfonso", "GILSON AMORIM DE MATOS",
			"Guilherme Gonçalves da Silva", "Gustavo Rabelo Teles", "HELOISA BEATRIZ DE OLIVEIRA COSTA",
			"Igor Mateus Queiroz Gato", "Isabel Emiko Yamakawa Oyama", "Jackeline Akemi de Moura",
			"José Jorge Hauck Júnior", "Juliana Santos André", "Kélven Cleiton de Araújo Brandão", "Laís Lima Santos",
			"Lucas anseloni barros", "Lucas Gonçalves da Silva", "Luis felipe da silva",
			"Luiz Felipe da Silva Magalhães", "Marcos Eduardo Gomes Gonçalves", "Micaely da Silva Lima",
			"Rafaela Oliveira Silva", "Tiago dos Santos Martins", "Verônica Navarro Almena", "Vinicius Alves Miranda",
			"Gabriel Enrique Cabral Silva" }; // NOME DOS CLIENTES
	static int controle[] = new int[40]; // SERVE PARA SABER QUAL CONTA PERTENCE AO CLIENTE EX. ERICK - CONTA POUPANÇA.
	static char sexoClientes[] = { 'M', 'M', 'F', 'F', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'F', 'F', 'M', 'M',
			'M', 'M', 'M', 'M', 'F', 'M', 'F', 'F', 'M', 'F', 'M', 'F', 'M', 'M', 'M', 'M', 'M', 'F', 'F', 'M', 'F',
			'M', 'M' };
	static int numConta[] = new int[40]; // ARMAZENA A CONTA DE CADA CLIENTE
	static char escolha;
	static double saldo[] = new double[40]; // ARMAZENA O SALDO DE CADA CLIENTE
	static double emprestimo[] = new double[40]; // ARMAZENA VALORES DE EMPRESTIMO PARA CONTA
	static int talao[] = new int[40]; //TALAO 
	static int totalTalao[] = new int[40];// PARA ACUMULAR OS TALOES ANTES DE ENTRAR NA FUNÇÃO 

	// FIM VETORES

	// VARIAVEIS

	static int sorteio; // SERVE PARA SORTEAR AS CONTAS DE CADA CLIENTE
	static int volta = 0; // PARA VOLTAR A TELA
	static int pesquisa = -1; // VARRER O VETOR DOS NOMES;
	static int numeroConta; // NUMERO DA CONTA DO CLIENTE
	static double saldoInicial = 0; // SALDO INICIAL
	static double credito = 0.0; // CRÉDITO = DEPOSITO INICIAL
	static double debito = 0.0; // CRÉDITO = SAQUE INICIAL
	static double emprestimoEmpresa = 10.000; // EMPRESTIMO EMPRESA
	static int escolhido = 0; // USADA PARA ENCONTRAR A CONTA DESEJADA;
	static int opcao = 0; // PARA OPCAO DO MENU INTERNO DE CADA FUNÇAO
	static int escolhaUsuario = 0;
	static int opcaoSimouNao; // CRIADA PARA MOVIMENTO SIM OU NAO
	static int x;
	
	//universidade Variaveis
	static char voltar = 'V';
	static double saldoUniversidade = 0.0;
	static double retirada;
	static double saldoatual =0.0;
	static double dinheiroUniversidade = 0.0;
	static int movimento = 0;
	static int deposito=0;
	static double creditoUniversidade = 1000.0;
	static double debitoUniversidade = 0.0;

	// FIM VARIAVEIS

	// COMEÇO DO PROGRAMA

	public static void main(String[] args) {// COMEÇO MAIN

		// VERIFICAÇÃO DE CONTA COM NOME E TIPO DE CONTA.

		telaInicial();
		pularLinha();

		for (int x = 0; x < 40; x++) {
			sorteio = random.nextInt(5) + 1;
			controle[x] = (x + 1);
			tipoConta[x] = sorteio;
			numConta[x] = x + 1;
			talao[x] = 3; // inicia a funçao do taloes 
			totalTalao[x] = 0; // total acumulado

		}

		// VERIFICAÇÃO DE GENERO

		for (int indice = 0; indice < 40; indice++) {
			if (numConta[indice] == numeroConta) {
				pesquisa = indice;
			}
		}

		if ((sexoClientes[pesquisa] == 'M')) {
			System.out.println("Seja bem vindo,");
		} else if ((sexoClientes[pesquisa] == 'F')) {
			System.out.println("Seja bem vinda");

		} else {
			System.out.println("/n Erro. Tente novamente, ");
		}

		for (x = 0; x < 40; x++) {
			if (numeroConta == controle[x]) {
				if (sorteio == 1) {
					System.out.printf("\n%s ", nomeCLientes[x]);
					System.out.println("\nConta Poupança");

					escolhido = x;
				} else if (sorteio == 2) {
					System.out.printf("%s ", nomeCLientes[x]);
					System.out.println("\nConta Conta Corrente");
					escolhido = x;
				} else if (sorteio == 3) {
					System.out.printf("%s", nomeCLientes[x]);
					System.out.println("\nConta Especial");

					escolhido = x;
				} else if (sorteio == 4) {
					System.out.printf("%s ", nomeCLientes[x]);
					System.out.println("\nConta Empresa");
					escolhido = x;
				} else {
					System.out.printf("%s ", nomeCLientes[x]);
					System.out.println("\nConta Universitária");
					escolhido = x;
				}

			}

		}

		// DEVE SER FEITA A ALTERAÇÃO!!!!
		switch (sorteio) {
		case 1:
			contaEmpresa();
			// System.out.println("Conta 1 - TESTE USO PARA FUNÇÃO POUPANÇA");
			// contaPoupança();
			break;
		case 2:
			contaCorrente();
			// System.out.println(" Conta 2 - TESTE USO PARA FUNÇÃO CORRENTE");
			// contaCorrente();
			break;
		case 3:
			contaEmpresa();
			// System.out.println(" Conta 3 - TESTE USO PARA FUNÇÃO ESPECIAL");
			// contaEspecial();
			break;
		case 4:
			contaEmpresa();
			break;
		case 5:
			ContaUniversitaria();
			// System.out.println(" Conta 5 - TESTE USO PARA FUNÇÃO UNIVERSITARIO");
			// contaUniversitaria();
			break;
		}

	}// FIM MAIN

	// FUNCOES

	// LINHA PARA UX;

	public static void linha() {
		for (byte x = 0; x < 35; x++) {
			System.out.print("■");
		}
	}

	// LINHA PARA PULAR LINHA;

	public static void pularLinha() {
		System.out.print("\n");
	}

	// LINHA PARA SAIR;

	public static void sair() {
		linha();
		System.out.println("AGRADECEMOS POR USAR O G5 BANK, ATÉ A PRÓXIMA");
		linha();
		telaInicial();
	}

	// LINHA PARA VOLTAR;

	public static void voltar() {
		System.out.println("\n [1] VOLTAR [2]SAIR ");
		volta = leia.nextInt();
		if (volta == 1) {
			telaInicial();
		} else if (volta == 2) {
			sair();
		} else {
			System.out.println("Voce digitou um numero invalido !!!");
		}
	}

	// LINHA PARA TELA INICIAL - COMEÇO DO CÓDIGO COM NÚMERO DA CONTA;

	public static void telaInicial() {
		linha();
		System.out.print("\n              BANCO G5 \n");
		linha();
		System.out.print("\nDigite o NÚMERO DA CONTA: ");
		numeroConta = leia.nextInt();
		linha();
	}
	public static void olhaSaldoUiversidade() {
		System.out.println("/n"+"Seu Saldo atual é de R$ "+saldoUniversidade);
		System.out.println("========================================================");
		System.out.println("\n"+"Você pode pedir emprestado apenas : R$ "+creditoUniversidade);
		System.out.println("========================================================");
		System.out.println("\n"+"Aperte V para retornar");
		voltar = leia.next().toUpperCase().charAt(0);
		if(voltar == 'V' || voltar == 'v'){
		 ContaUniversitaria();
	    }
	}
	public static void ContaUniversitaria(){
		int opcao;
		Scanner leia = new Scanner(System.in);
		System.out.println("\n BEM VINDO AO G5 BANK"+"\n");
		System.out.println("======================================================================");
		System.out.println("\n ESCOLHA UMA OPERAÇÃO");
		System.out.println("\n 1- SALDO >>");
		System.out.println("\n 2- SAQUE>>");
		System.out.println("\n 3- EMPRESTIMO >>");
		System.out.println("\n 4- DEPOSITO >>");
		System.out.println("\n 5- SAIR >>");
		
		opcao = leia.nextInt();
		switch(opcao) {
		case 1 :
			olhaSaldoUiversidade();
		break;
		case 2 :
			saqueUniversidade();
		break;
		
		case 3 :
			EmprestimoUniversidade();
		break;
		
		case 4 :
			deposito();
		break;
		case 5 :
			//sair()
		break;
		 			
		 			
			        
		
		}
	}
	
	public static void deposito() {
		System.out.println("Quanto Voce quer depositar?");
		deposito =leia.nextInt();
		saldoUniversidade = deposito+saldoUniversidade;
		System.out.println("Voce depositou R$"+deposito+" e agora tem R$ "+saldoUniversidade);
		System.out.println("\n"+"Aperte V para retornar");
		voltar = leia.next().toUpperCase().charAt(0);
		if(voltar == 'V' || voltar == 'v'){
		 ContaUniversitaria();
		
		
	}
		}

	public static void contaEmpresa() {
		linha();
		System.out.println("\nESCOLHA UMA OPERAÇÃO : ");
		System.out.println("[1] MOVIMENTAÇÃO");
		System.out.println("[2] SALDO");
		System.out.println("[3] SAIR");
		linha();
		opcao = leia.nextInt();

		switch (opcao) {
		case 1:

			for (x = 0; x < 10; x++) {

				System.out.println("\nDeseja iniciar os movimentos: [1]Sim ou [2] Não");
				opcaoSimouNao = leia.nextInt();

				if (opcaoSimouNao == 1) {
					// CADA UM VAI TER QUE ALTERAR DEVIDO MUDANÇAS DE CONTA

					System.out.println("Seu saldo é:" + saldo[numeroConta]);
					linha();
					System.out.println("\nVOCE DESEJA FAZER [1] CRÉDITO [2]DEBITO [3]EMPRESTIMO");
					escolhaUsuario = leia.nextInt();

					// IF OARA CREDITO = DEPOSITO;

					if (escolhaUsuario == 1) {
						System.out.println("Quanto você deseja DEPOSITAR?");
						credito = leia.nextDouble();

						if (credito > 0.0) {
							for (int x = 0; x < 40; x++) {
								saldo[x] = saldo[x] + credito;
							}
							System.out.printf("Seu saldo atual é %f", saldo[numeroConta]);
							emprestimo();
							voltar();
						} else {
							System.out.println("Não é possível realizar o débito.");
						}

					}

					// IF OARA DEBITO = SAQUE

					else if (escolhaUsuario == 2) {

						System.out.println("Quanto você deseja RETIRAR?");
						debito = leia.nextDouble();

						if (debito > 0.0 && saldo[numeroConta] > 0) {
							for (int x = 0; x < 40; x++) {
								saldo[x] = saldo[x] - debito;
							}
							System.out.printf("Seu saldo atual é %f", saldo[numeroConta]);
							emprestimo();
							voltar();
						}

						else if (debito <= 0 && saldo[numeroConta] > 0) {
							System.out.println("Não é possível realizar a retirada.");
							emprestimo();
						}

					} else if (escolhaUsuario == 3) {
						emprestimo();
						voltar();
					} else {
						System.out.println("Voce digitou um número invalido !!!"); //RAFA ALTEREI O ELSE PRA FORA DO ELSE IF 2 POIS O MESMO ESTAVA DENTRO E RETORNAVA COMO REFERI
					}
					emprestimo();
					voltar();

				} else if (opcaoSimouNao == 2)

				// AQUI NÃO MUDA

				{
					sair();

				} else {
					System.out.println("Voce digitou um numero invalido !!!");
				}

			}

			break;

		case 2:

			System.out.printf("Seu saldo atual é %f", saldo[numeroConta]);
			emprestimo();
			voltar();
			linha();

			break;

		case 3:
			sair();
			break;
		}
	}

	public static void emprestimo() {
		int opcaoEmprestimo = 0;
		double limiteEmprestimo = 10.000;
		double valorEmprestimo = 0.0;

		System.out.println("\nVocê gostaria de um EMPRESTIMO HOJE?");
		pularLinha();
		System.out.println("TEMOS ÓTIMAS CONDIÇÕES PARA VOCÊ!!");
		pularLinha();
		linha();
		pularLinha();
		System.out.println("Para [1]Sim ou [2]Não");

		opcaoEmprestimo = leia.nextInt();

		if (opcaoEmprestimo == 1) {
			System.out.printf("Olá %s, que bom que aproveitou a melhor condição do mercado!", nomeCLientes[x]);
			pularLinha();
			System.out.printf("Você tem %f, quanto você gostaria de pegar?", limiteEmprestimo);
			valorEmprestimo = leia.nextDouble();

			if (valorEmprestimo > 0 && valorEmprestimo <= limiteEmprestimo) {

				saldo[numeroConta] = saldo[numeroConta] + valorEmprestimo;

				System.out.printf("PARABÉNS! Você acabou de adquirir R$ %f.", valorEmprestimo);
				System.out.printf("Seu saldo atual é %f.", saldo[numeroConta]);
			}
			voltar();

		} else {
			voltar();

		}
	}
	public static void EmprestimoUniversidade(){
		System.out.println("Quanto dinheiro você quer emprestado ?");
		dinheiroUniversidade = leia.nextInt();
		
		if(movimento<10 && (dinheiroUniversidade >=0 && dinheiroUniversidade<=creditoUniversidade)){
		movimento++;
		saldoUniversidade = saldoUniversidade + dinheiroUniversidade;
		saldoatual = saldoUniversidade;
		creditoUniversidade = creditoUniversidade-saldoUniversidade;
		System.out.println(creditoUniversidade);
		System.out.println("Voce ja fez"+movimento+"Movimentos");
		}else {
			System.out.println("\n OPERACAO INVALIDA");
		}
		System.out.println("\n"+"Aperte V para retornar");
		System.out.println("\n");
		voltar = leia.next().toUpperCase().charAt(0); 	
		if(voltar == 'V' || voltar == 'v') {
			ContaUniversitaria();
		}
	}
	public static void saqueUniversidade() {
		System.out.println("Quanto dinheiro voce vai sacar?");
		retirada=leia.nextDouble();
		
		if(saldoUniversidade>0.0) {
			saldoUniversidade = saldoUniversidade - retirada;
			saldoatual = saldoUniversidade;
		}else {
			System.out.println("Operação não permitida");
		}
		
		System.out.println("\n"+"Aperte V para retornar");
		voltar =leia.next().toUpperCase().charAt(0);
		if(voltar == 'V' || voltar == 'v'){
		ContaUniversitaria();
	    }
	}

	public static void contaCorrente() {
		linha();
		System.out.println("\nESCOLHA UMA OPERAÇÃO : ");
		System.out.println("[1] MOVIMENTAÇÃO");
		System.out.println("[2] SALDO");
		System.out.println("[3] SAIR");
		linha();
		opcao = leia.nextInt();

		switch (opcao) {
		case 1:

			for (x = 0; x < 10; x++) {

				System.out.println("\nDeseja iniciar os movimentos: [1]Sim ou [2] Não");
				opcaoSimouNao = leia.nextInt();

				if (opcaoSimouNao == 1) {
					// CADA UM VAI TER QUE ALTERAR DEVIDO MUDANÇAS DE CONTA

					System.out.println("Seu saldo é:" + saldo[numeroConta]);
					linha();
					System.out.println("\nVOCE DESEJA FAZER: \n[1]DEPOSITO \n[2]DEBITO \n[3]TALÃO");
					escolhaUsuario = leia.nextInt();

					// IF PARA CREDITO = DEPOSITO;

					if (escolhaUsuario == 1) {
						System.out.println("Quanto você deseja DEPOSITAR?");
						credito = leia.nextDouble();

						if (credito > 0.0) {
							for (int x = 0; x < 40; x++) {
								saldo[x] = saldo[x] + credito;
							}
							System.out.printf("Seu saldo atual é %f", saldo[numeroConta]);
							voltar();
						} else {
							System.out.println("Não é possível realizar o débito.");
						}

					}

					// IF PARA DEBITO = SAQUE

					else if (escolhaUsuario == 2) {

						System.out.println("Quanto você deseja RETIRAR?");
						debito = leia.nextDouble();

						if (debito > 0.0) {
							for (int x = 0; x < 40; x++) {
								saldo[x] = saldo[x] - debito;
							}
							System.out.printf("Seu saldo atual é %f", saldo[numeroConta]);
						}

						else if (debito <= 0) {
							System.out.println("Não é possível realizar a retirada.");
						}

					}

					else if (escolhaUsuario == 3) {

						talao();

					}

					else {
						System.out.println("Voce digitou um número invalido !!!");
					}

					voltar();

				} else if (opcaoSimouNao == 2)
				// AQUI NÃO MUDA
				{
					sair();

				} else {
					System.out.println("Voce digitou um numero invalido !!!");
				}

			}

			break;

		case 2:

			System.out.printf("Seu saldo atual é %f", saldo[numeroConta]);
			voltar();
			linha();

			break;

		case 3:
			sair();
			break;
		}

	}

	public static void talao() {

		int tipo;
		char opcaoTalao;
		int qntdTalao = 0;

		System.out.println("IMPRESSÃO DE TALÃO: S para Sim ou N para Não: ");
		opcaoTalao = leia.next().toUpperCase().charAt(0);
		while (opcaoTalao != 'S' && opcaoTalao != 'N') {
			System.out.println("\nTransação inválida! Tente novamente. ");
			opcaoTalao = leia.next().toUpperCase().charAt(0);
		}
		System.out.println("insira a quantidade de talões desejada: ");
		qntdTalao = leia.nextInt();
		while (qntdTalao > 3 || qntdTalao < 0) {
			System.out.printf(
					"Quantidade de talões inválida. Você possui  %d talões disponíveis no momento. Insira a quantidade desejada: ",
					talao[numeroConta]);
			qntdTalao = leia.nextInt();
		}
		while (qntdTalao > talao[numeroConta]) {
			System.out.printf("ATENÇÃO: Você possui %d talões disponíveis no momento. Insira a quantidade desejada:",
					talao[numeroConta]);
			qntdTalao = leia.nextInt();
		}

		talao[numeroConta] = talao[numeroConta] - qntdTalao;
		totalTalao[numeroConta] = totalTalao[numeroConta] + qntdTalao;

		if (talao[numeroConta] == 0) {
			talao[numeroConta] = 3;
		}

		System.out.printf("A quantidade impressa de talão hoje é de: %d\n", qntdTalao);
		System.out.printf("A quantidade impressa total: %d\n", totalTalao[numeroConta]);
		System.out.printf("Obrigado por usar nosso banco");

	}

	// FIM FUNCOES

}// FIM CÓDIGO