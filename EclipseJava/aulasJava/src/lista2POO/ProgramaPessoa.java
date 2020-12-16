package lista2POO;

import java.util.Scanner;

public class ProgramaPessoa {

	public static void main(String[] args) {
		Scanner leia =new Scanner(System.in);
		
		
		Fornecedor Jonas = new Fornecedor("Jonas","Rua Plinio","934552215");
		Vendedor Amber =new Vendedor("Amber","Rua JDK","94548485",100.0);
		Administrador Nicky = new Administrador("Nicky","Rua das Guitarras","12345678",100);
		System.out.println("O nome do Administrador e"+Nicky.getNome()+" ele mora na "+Nicky.getEndereco());
		
		
		Jonas.setValorCredito(100);
		Jonas.setValorDivida(50);
		
		Amber.setValorVendas(500);
		Amber.setComissao(150);
		
	System.out.println("A vendedora"+Amber.getNome()+" ganhou uma comissao de R$"+Amber.salarioVendedor());
		
	
	System.out.println("O saldo de "+Jonas.getNome()+Jonas.DiferencaSaldoCredito());
	
		
		
		
		
		

	}

}
