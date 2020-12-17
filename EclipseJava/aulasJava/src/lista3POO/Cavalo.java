package lista3POO;

public class Cavalo extends Animal {


	public String correr() {
		return "Cavalo correndo";
	}

	@Override
	public String fazerSom() {
		return "HI HI HI HI";
	}
	public Cavalo(String nome, int idade) {
		super(nome, idade);
	}
}