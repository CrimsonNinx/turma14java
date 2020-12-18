package atividadesSala;

import java.util.Scanner;

public class contaUniversitaria {
	
	
	
	int numeroContas[] = new int [40];
	String nommeContas[] = {"Allen de Lima Vieira", "André de Brito Silva da Costa","Bárbara Liboni Guerra",	
		"Beatriz Martins","Beymar Jhoel Acapa Lima","Breno Nogueira Botelho Noccioli",
			"Daniel Augusto Gomes Ferreira Filho","Danilo Mendes Ferreira","Danilo Pereira da Silva",
			"Davi Silva Vieira","Diego Vinicio da Silva Nascimento","Erick Costa Ferreira",
			"Ewerton Inacio Lima","FERNANDA AGAPITO","Fernanda Barbosa Ferraz","Francisco José Pires",
			"Gabriel Sérgio Nascimento Santos Gonçalves", "Gideão da Silva Idelfonso",
			"GILSON AMORIM DE MATOS","Guilherme Gonçalves da Silva","Gustavo Rabelo Teles",
			"HELOISA BEATRIZ DE OLIVEIRA COSTA","Igor Mateus Queiroz Gato","Isabel Emiko Yamakawa Oyama",
			"Jackeline Akemi de Moura","José Jorge Hauck Júnior","Juliana Santos André",
			"Kélven Cleiton de Araújo Brandão","Laís Lima Santos","Lucas anseloni barros",
			"Lucas Gonçalves da SIlva","luis felipe da silva","Luiz Felipe da Silva Magalhães",
			"Marcos Eduardo Gomes Gonçalves","Micaely da Silva Lima","Rafaela Oliveira Silva",
	"Tiago dos Santos Martins","Verônica Navarro Almenara","Vinicius Alves Miranda", "Gabriel Enrique Cabral Silva"};
		
		
		
			
			
		static double saldo = 0.0;
	    static double credito = 1000.0;
	    double debito = 0.0;
	
	    static char voltar = 'V';
	    int numeroConta = 1;
	    String nomeUsuario;
	    int numeroUsuario = 0;		        
	    static double saldoatual =0.0;
	    static double dinheiro = 0.0;
	    int x=0;
	    int dia = 5;
	    static double retirada;
	    double armazenadorDoSaldo;
	    int numDias = 10;
	    static int movimento = 0;
	    static int deposito=0;
		
	
	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		

	   
		menu();
		
		
	}
	public void menuEntrada() {
		int opcao;
	
		System.out.println("\nBEM VINDO AO G5 BANK "+"\n");
		System.out.println("\nConta Universitaria -"+"\n");
		
		System.out.println("================================================================");
		
	System.out.println("\nDIGITE O NUMERO DA CONTA :");
	
	
	
	}
	public static void deposito() {
		System.out.println("Quanto Voce quer depositar?");
		deposito =leia.nextInt();
		saldo = deposito+saldo;
		System.out.println("Voce depositou R$"+deposito+" e agora tem R$ "+saldo);
		System.out.println("\n"+"Aperte V para retornar");
		voltar = leia.next().toUpperCase().charAt(0);
		if(voltar == 'V' || voltar == 'v'){
	    	menu();
		
		
		
		
		
	}
		
		
		}
	public  static void menu() {
	int opcao;
	
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
		 olhaSaldo();
	break;
	case 2 :
		 saque();
	break;
	
	case 3 :
		Emprestimo();
	break;
	
	case 4 :
		deposito();
	break;
	case 5 :
		//sair()
	break;
	 			
	 			
		        
	
		}
	
	}
public static void contador() {
	if(credito!=credito && saldo!=saldo)
  	{
  		for(int diminuidor = 1; movimento>diminuidor;diminuidor--)
  		{	
  			System.out.println("VOCE TEM"+diminuidor);
  			
  		}
  		
  	}
}
public static void olhaSaldo() {
	System.out.println("/n"+"Seu Saldo atual é de R$ "+saldo);
	System.out.println("========================================================");
	System.out.println("\n"+"Você pode pedir emprestado apenas : R$ "+credito);
	System.out.println("========================================================");
	System.out.println("\n"+"Aperte V para retornar");
	voltar = leia.next().toUpperCase().charAt(0);
	if(voltar == 'V' || voltar == 'v'){
    	menu();
    }
}

	public static void numeroDeMovimentos(){
		System.out.println("/n"+"Aperte V para retornar");
		voltar = leia.next().toUpperCase().charAt(0);
		
     

        if(voltar == 'V'){
        	menu();
        }
	
}
public static void saque() {
	System.out.println("Quanto dinheiro voce vai sacar?");
	retirada=leia.nextDouble();
	
	if(saldo>0.0) {
		saldo = saldo - retirada;
		saldoatual = saldo;
	}else {
		System.out.println("Operação não permitida");
	}
	
	System.out.println("\n"+"Aperte V para retornar");
	voltar =leia.next().toUpperCase().charAt(0);
	if(voltar == 'V' || voltar == 'v'){
    	menu();
    }
}



	public static void Emprestimo(){
		System.out.println("Quanto dinheiro você quer emprestado ?");
		dinheiro = leia.nextInt();
		if(movimento<10 && (dinheiro >=0 && dinheiro<=credito)){
		movimento++;
		saldo = saldo + dinheiro;
		saldoatual = saldo;
		credito = credito-saldo;
		System.out.println("Voce ja fez"+movimento+"Movimentos");
		}else {
			System.out.println("\n OPERACAO INVALIDA");
		}
		System.out.println("\n"+"Aperte V para retornar");
		System.out.println("\n");
		voltar = leia.next().toUpperCase().charAt(0); 	
		if(voltar == 'V' || voltar == 'v') {
			menu();
		}
	}

	
}
