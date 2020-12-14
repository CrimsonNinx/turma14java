package atividadesSala;

import java.util.Scanner;

public class Banco11
{    
     
    public static void main(String[] args) 
    {		String nommeCLientes[] = {"Allen de Lima Vieira", "André de Brito Silva da Costa","Bárbara Liboni Guerra",	
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
    	
    char sexoClientes[] = {'M','M','F','F','M','M','M','M','M','M','M','M','M','F','F','M','M','M','M','M','M','F','M','F',
		'F','M','F','M','F','M','M','M','M','M','F','F','M','F','M','M'};
    		
    	   Scanner leia = new Scanner(System.in);
    	   double saldo [] = new double [40];
    	   int pesquisa=-1;
    	   int numeroConta;
    	   int numConta [] = new int [40];
    	   char escolha;
    	   for (int x=0; x<40; x++) {
    		   numConta[x] = x+1;
		}
    	   
    	   
    	  System.out.print("\nDigite o numero da Conta do cliente: ");
    	  numeroConta = leia.nextInt();
    	  for (int indice=0; indice<40; indice++) //varrer o vetor
			{
				if (numConta[indice]==numeroConta) {
					pesquisa = indice;
				}
			}
    	  System.out.println("Conta:");
		System.out.printf("%d \t%s \n", numConta[pesquisa],nommeCLientes[pesquisa]);
		
    	   
    	   
    	   
    	
      //  menuEntrada();
    }
    public static void menuEntrada()
    {
        linha();
        System.out.println("\nG5 BANK\n");
        linha();
        System.out.println("");
        
    }
    
    public static void menuPrincipal()
    {
            int tipo =0;
            linha();
            System.out.println("\nG5 BANK");
            linha();
            
            switch(tipo)
            {
            case 1:
            case 2:
            case 3:
            case 4: 
            case 5:
            }
    }
    public static void linha()
    {
        for( byte x =0;x<35;x++)
        {
            System.out.print("-");
        }
    }
    public static void sair()
    {
        System.out.println(" AGRADECEMOS POR USAR O G5 BANK, ATÉ A PROXIMA ");
        menuEntrada();
    }
    
}