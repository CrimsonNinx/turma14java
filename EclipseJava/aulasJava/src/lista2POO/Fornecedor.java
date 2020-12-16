package lista2POO;

public class Fornecedor extends PessoaEx1{

	private double valorCredito ,valorDivida;

	
	
	public double DiferencaSaldoCredito(){
		double saldo =this.valorCredito-this.valorDivida;
		return saldo;
	
	}



	public double getValorCredito() {
		return valorCredito;
	}



	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}



	public double getValorDivida() {
		return valorDivida;
	}



	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}



	
	//CONSTRUTOR
	

	public Fornecedor(String nome, String endereco, String telefone, double valorCredito, double valorDivida) {
		super(nome, endereco, telefone);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}



	public Fornecedor(String nome, String endereco, String telefone) {
		super(nome, endereco, telefone);
	}



	
	
	
	
	
	
	
	
	
}
