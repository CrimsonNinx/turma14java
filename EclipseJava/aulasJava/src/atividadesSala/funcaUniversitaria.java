package atividadesSala;

import java.util.Scanner;

public class funcaUniversitaria {
	static double saldoUniversidade = 0.0;
    static double creditoUniversidade = 1000.0;
    double debitoUniversidade = 0.0;

    static char voltar = 'V';
    int numeroConta = 1;
    String nomeUsuario;
    int numeroUsuario = 0;		        
    static double saldoatual =0.0;
    static double dinheiroUniversidade = 0.0;
    int x=0;
    int dia = 5;
    static double retirada;
    double armazenadorDoSaldo;
    int numDias = 10;
    static int movimento = 0;
    static int deposito=0;
    static Scanner leia = new Scanner(System.in);
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContaUniversitaria();
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
	public static void olhaSaldo() {
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
	public static void saque() {
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
	
	public static void Emprestimo(){
		System.out.println("Quanto dinheiro você quer emprestado ?");
		dinheiroUniversidade = leia.nextInt();
		if(movimento<10 && (dinheiroUniversidade >=0 && dinheiroUniversidade<=creditoUniversidade)){
		movimento++;
		saldoUniversidade = saldoUniversidade + dinheiroUniversidade;
		saldoatual = saldoUniversidade;
		creditoUniversidade = creditoUniversidade-saldoUniversidade;
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


	
}
