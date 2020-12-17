package contas;

public class contaUniversitariaPOO extends Contas{
	private double valorLimite;
	private double LimiteUniversitarioCadastrado;

	
	//métodos
	public double getLimite() {
		return valorLimite;
	}

	public void setLimite(double valorLimite) {
		this.valorLimite = valorLimite;
	}
	/*
	
	public boolean testarSaldo(double valor) {
		boolean teste;
		if(valor <= super.getSaldo()) {
			teste = true;
		} else if(valor <= (this.valorLimite + super.getSaldo())) {
			double valorCredito = valor - super.getSaldo();
			super.credito(valorCredito);
			
			this.valorLimite-=valorCredito;
			
			teste=true;
		} else {
			teste = false;
		}
		return teste;
	}
	*/
	
	
	
	
	
}
