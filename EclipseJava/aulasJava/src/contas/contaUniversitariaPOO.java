package contas;

public class contaUniversitariaPOO extends BancoPrincipal{
	private double valorLimiteMax;
	private double valorLimite;

	private double limiteUniversitarioCadastrado;

	
	//métodos
	public double getLimite() {
		return valorLimiteMax;
	}

	public void setLimite(double valorLimite) {
		this.valorLimiteMax = valorLimite;
	}
	
	
	public boolean testarSaldo(double valor) {
		boolean teste;
		if(valor <= super.getSaldo()) {
			teste = true;
		} else if(valor <= (this.getLimite() + super.getSaldo())) {
			double valorCredito = valor - super.getSaldo();
			super.credito(valorCredito);
			
			this.valorLimiteMax-=valorCredito;
			
			teste=true;
		} else {
			teste = false;
		}
		return teste;
	}
	
	
	
	public void restituiLimiteCadastrado() {
        if(valorLimite < limiteUniversitarioCadastrado) {
            if(super.getSaldo()>0 && super.getSaldo() >= (limiteUniversitarioCadastrado - valorLimite)) {
                double valorDebito = limiteUniversitarioCadastrado - valorLimite;
                super.debito(valorDebito);
                valorLimite += valorDebito; 
            } else if(super.getSaldo()>0 && super.getSaldo()<(limiteUniversitarioCadastrado - valorLimite)) {
                double valorDebito = getSaldo();
                super.debito(valorDebito);
                valorLimite+=valorDebito;
            }
        }
		}
		
	}
