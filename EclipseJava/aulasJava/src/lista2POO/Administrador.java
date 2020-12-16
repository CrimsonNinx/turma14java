package lista2POO;

public class Administrador extends PessoaEx1{

	private double ajudaDeCusto;

	
	
	public Administrador(String nome, String endereco, String telefone, double ajudaDeCusto) {
	super(nome, endereco, telefone);
	this.ajudaDeCusto = ajudaDeCusto;
	}



	public double getAjudaDeCusto() {
		return ajudaDeCusto;
	}



	public void setAjudaDeCusto(double ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}
	
	
	
	
	
	
	
	
}
