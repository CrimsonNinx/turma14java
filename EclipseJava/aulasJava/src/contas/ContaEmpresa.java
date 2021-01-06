
package contas;

public class ContaEmpresa extends Conta{

private double emprestimoEmpresa;
private String saldo;
	
//INICIO CONTRU��ES


	public ContaEmpresa(int numeroConta,double emprestimoEmpresa)
	{
		super(numeroConta);
		this.emprestimoEmpresa=emprestimoEmpresa;
	}
	
	public double getEmprestimoEmpresa() {
		return emprestimoEmpresa;
	}

	public void setEmprestimoEmpresa(double emprestimoEmpresa) {
		this.emprestimoEmpresa = emprestimoEmpresa;
	}
	
	//FIM CONTRU��ES
	
	//INICIO METODO
	
	public void emprestimoSolicitado(double valorEmprestimo)
	{
		if(valorEmprestimo <= this.emprestimoEmpresa)
		{
			this.emprestimoEmpresa=this.emprestimoEmpresa-valorEmprestimo;
			this.setSaldo(this.getSaldo() + valorEmprestimo);
			
			System.out.println("Valor dispon�vel para NOVO emprestimo: " + this.emprestimoEmpresa);
			System.out.println("Saldo ATUAL: "+this.getSaldo());
		}
		else 
		{
			System.out.println("Valor ind�spon�vel. Verifique com seu gerente");
		}
		
	}

	void setSaldo(double d) {
		// TODO Auto-generated method stub
		
	}

	public ContaEmpresa(double emprestimoEmpresa, String saldo) {
		super();
		this.emprestimoEmpresa = emprestimoEmpresa;
		this.saldo = saldo;
	}
	
	
	
	

	
	//FIM METODO
	
	
}//FIM CONTA EMPRESA