package LISTA4POO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Tarefa3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		List<Estoque> listaEstoque = new ArrayList<>();
		Estoque a = new Estoque("CLE-001","XAMPU", 65, 10);
		Estoque b = new Estoque("CLE-002","CONDICIONADOR", 65, 10);
		Estoque c = new Estoque("CLE-003","TINTA PARA CABELO", 50, 10);
		Estoque d = new Estoque("CLE-004","GEL", 20, 10);
		Estoque e = new Estoque("CLE-005","CERA", 30, 10);
		Estoque f = new Estoque("CLE-006","LAQUE DE FIXAÇÂO", 80, 10);
		Estoque g = new Estoque("CLE-007","KIT PARA CRESCIMENTO DE CABELO", 120, 10);
		Estoque h = new Estoque("CLE-008","KIT ESCOVAS DE CABELO", 35, 10);
		Estoque i = new Estoque("CLE-009","KIT HIDRATAÇÂO", 80, 10);
		Estoque j = new Estoque("CLE-010","KIT BANHO DE VERNIZ", 40, 10);
		
		listaEstoque.add(a);
		listaEstoque.add(b);
		listaEstoque.add(c);
		listaEstoque.add(d);
		listaEstoque.add(e);
		listaEstoque.add(f);
		listaEstoque.add(g);
		listaEstoque.add(h);
		listaEstoque.add(i);
		listaEstoque.add(j);
	
		
		String nomeProduto;
		double valorProduto;
		int qtdProduto;
		String  escolhaCodigo;
		
		char opcaoMenuEstoque = ' ', opcaoContinuacao = ' ';
		
		
		do{
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("[1] - NOVO ITEM");
			System.out.println("[2] - REMOVER ITEM");
			System.out.println("[3] - ATUALIZAR ITEM");
			System.out.println("[4] - LISTAR ITENS");
			System.out.println("[5] - SAIR");
			System.out.println();
			System.out.print("DIGITE A OPÇÂO: ");
			opcaoMenuEstoque = leia.next().charAt(0);;
			
			if(opcaoMenuEstoque == '1') {
				
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.print("Insira o nome do Produto: ");
				leia.nextLine();
				nomeProduto = leia.nextLine();
				System.out.print("Insira o valor do Produto: ");
				valorProduto = leia.nextDouble();
				System.out.print("Insira a quantidade do Produto: ");
				qtdProduto = leia.nextInt();
				
				
				listaEstoque.add(new Estoque((listaEstoque.size() >= 100)? "CLE-"+ (listaEstoque.size() + 1) : (listaEstoque.size() < 10)? "CLE-00"+ (listaEstoque.size() + 1): "CLE-0"+ (listaEstoque.size() + 1) , nomeProduto, valorProduto, qtdProduto));
				
			}
			else if(opcaoMenuEstoque == '2') {
				System.out.print("Insira o codigo do item que deseja remover: ");
				escolhaCodigo = leia.next().toUpperCase();
				for(Estoque prod: listaEstoque) {
					
				     if(prod.getCodigo().equals(escolhaCodigo)){
				            

				            // Remove.
				            listaEstoque.remove(prod);

				            // Sai do loop.
				            break;
				     }
				    
				}
			}
			else if(opcaoMenuEstoque == '3') {
				System.out.println("Insira o codigo do item que deseja atualizar: ");
				escolhaCodigo = leia.next().toUpperCase();
				
				for(Estoque prod: listaEstoque) {
					
				     if(prod.getCodigo().equals(escolhaCodigo)){
				            
				    	
				    	 
				    	 do{
								System.out.println();
								System.out.println();
								System.out.println();
								System.out.println("[1] - NOME PRODUTO");
								System.out.println("[2] - VALOR PRODUTO");
								System.out.println("[3] - QUANTIDADE PRODUTO");
								System.out.println("[4] - SAIR");
								System.out.println();
								System.out.print("DIGITE A OPÇÂO: ");
								opcaoMenuEstoque = leia.next().charAt(0);;
								
								if(opcaoMenuEstoque == '1') {
									
									System.out.println();
									System.out.println();
									System.out.println();
									System.out.print("Insira o nome do Produto: ");
									leia.nextLine();
									nomeProduto = leia.nextLine();
									
									prod.setProduto(nomeProduto);
									
								}
								else if(opcaoMenuEstoque == '2') {
									System.out.println();
									System.out.println();
									System.out.println();
									System.out.print("Insira o valor do Produto: ");
									valorProduto = leia.nextDouble();
									
									prod.setPrecoUnitario(valorProduto);
									 
								
								}
								else if(opcaoMenuEstoque == '3') {
									System.out.print("Insira a quantidade do Produto: ");
									qtdProduto = leia.nextInt();
									
									prod.adicionaEstoque(qtdProduto);
								}
				
								else if(opcaoMenuEstoque == '4') {
									break;
								}
								
								
							}while(opcaoMenuEstoque == '4');
				    	 
				     }
				    
				}
				
			}
			else if(opcaoMenuEstoque == '4') {
				System.out.println();
				inseriLinha(80,'▬');
				
				System.out.println("CODIGO\t\tR$(UN)\t\tESTOQUE\t\tPRODUTO");
			
				inseriLinha(80, '▬');
				
				
				
				for (Estoque prod: listaEstoque) {
					
					System.out.printf("%s\t\t%.2f\t\t%d\t\t%s\n",prod.getCodigo(),prod.getPrecoUnitario(),prod.getQtdeProdutoEstoque(),prod.getProduto());
				}
			}
			else if(opcaoMenuEstoque == '5') {
				break;
			}
			
			do {System.out.println();
				System.out.println("Deseja continuar? [S/N]");
				opcaoContinuacao = leia.next().toUpperCase().charAt(0);
					
					while(opcaoContinuacao != 'S' && opcaoContinuacao != 'N') {
						System.out.println();
						inseriLinha(80,'▼');
						System.out.println("Atenção a Opção escolhida é invalida. Tente novamente!!!");
						inseriLinha(80,'▼');
						System.out.println();
						break;
					}
			}while(opcaoContinuacao != 'S' && opcaoContinuacao != 'N');
				
				if(opcaoContinuacao == 'N') {
					break;
				}
			
		}while(opcaoContinuacao != 'N');
		
		leia.close();
	}
	
	//FUNÇÂO PARA GERAR LINHA
		public static void inseriLinha(int tamanho, char simbolo) {

			for (int i = 0; i < tamanho; i++) {
				System.out.print(simbolo);
			}
			System.out.println();
		}

}