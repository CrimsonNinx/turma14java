package lista3POO;

public class Preguica extends Animal {
	public Preguica(String nome, int idade) {
		super(nome, idade);
	}

	public String subirArvore() {
		return "Pregui�a subindo �rvore";
	}

	@Override
	public String fazerSom() {
		return "bixixbxibxiibxbibcxi";
	}
}