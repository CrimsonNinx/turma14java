package loja;

public class Porduto extends CadLoja {
	private String nomeProduto;
	private String codProduto;
	private double precoUnitario;
	private int qtdeProdutoEstoque;

	//+estoque
	public void diminuiEstoque(int tiraEstoque) {
		qtdeProdutoEstoque -=tiraEstoque;
	}
	//-estoque
	public void aumentaEstoque(int colocaEstoque) {
		qtdeProdutoEstoque +=colocaEstoque;
	}
	//calcaula o preco final
	public void calculaPrecoFinal(int qteProduto) {
		precoUnitario *=qteProduto;
	
	}
	
	//construtor 
	public Porduto(String nomeProduto, String codProduto, double precoUnitario) {
		super();
		this.nomeProduto = nomeProduto;
		this.codProduto = codProduto;
		this.precoUnitario = precoUnitario;
	}
	
	
	
	public Porduto(String nomeProduto, String codProduto, double precoUnitario, int qtdeProdutoEstoque) {
		super();
		this.nomeProduto = nomeProduto;
		this.codProduto = codProduto;
		this.precoUnitario = precoUnitario;
		this.qtdeProdutoEstoque = qtdeProdutoEstoque;
	}
	
	
	//get and set
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public String getCodProduto() {
		return codProduto;
	}
	public void setCodProduto(String codProduto) {
		this.codProduto = codProduto;
	}
	public double getPrecoUnitario() {
		return precoUnitario;
	}
	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}
	public int getQtdeProdutoEstoque() {
		return qtdeProdutoEstoque;
	}
	public void setQtdeProdutoEstoque(int qtdeProdutoEstoque) {
		this.qtdeProdutoEstoque = qtdeProdutoEstoque;
	}
	//--------------------------------------------------------------
	
	
	
	
}
