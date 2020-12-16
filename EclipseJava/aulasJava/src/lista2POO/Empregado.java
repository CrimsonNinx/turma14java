package lista2POO;

public class Empregado extends PessoaEx1 {

	private int codigoSetor;
	private int salarioBase;//(vencimento base)
	private int imposto;//porcentagem retida dos impostos).
	
	//metodos
		//public double calcularSalario(){
	//	double saldo =this.valorCredito-this.valorDivida;
	//	return saldo;
	
	//}

	
	
	//Getters e Setters
	public int getCodigoSetor() {
		return codigoSetor;
	}
	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}
	public int getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(int salarioBase) {
		this.salarioBase = salarioBase;
	}
	public int getImposto() {
		return imposto;
	}
	public void setImposto(int imposto) {
		this.imposto = imposto;
	}
	
	
}
