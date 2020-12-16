package lista2POO;

public class Vendedor extends PessoaEx1{
		
	 private double valorVendas;
	 private double comissao;
	

		public double salarioVendedor(){
		double salario =this.valorVendas+this.comissao;
		return salario;
		
		}
	 
	 
	 //Connstrutor
	 public Vendedor(String nome, String endereco, String telefone, double valorVendas) {
	super(nome, endereco, telefone);
	this.valorVendas = valorVendas;
		}



	 //GET SET
	public double getValorVendas() {
		return valorVendas;
	}




	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}




	public double getComissao() {
		return comissao;
	}




	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	 
	
	 
	 
	
}
