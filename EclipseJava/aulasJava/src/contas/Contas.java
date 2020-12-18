package contas;

	public abstract class Contas{
	private int numeroConta;
	private double saldo;
	private String cpf;
	
	//construtores - regras de construção da classe
	public Contas() {//padrao
		
	}
	public Contas(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	//sobrecarga
	public Contas(int numeroConta, String cpf) {
		this.numeroConta = numeroConta;
		this.cpf = cpf;
	}
	
	
	//métodos
	public int getNumeroConta() {
		return numeroConta;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	public void debito(double valorDebito) {
		this.saldo -= valorDebito;
	}
	public void credito(double valorCredito) {
		this.saldo += valorCredito;
	}
	
	
	
}

