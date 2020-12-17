
package lista3POO;

public class Cachorro extends Animal {

	public String correr() {
		return "Cachorro correndo";
	}

	@Override
	public String fazerSom() {
		return "Rolf Rolf";
	}

	public Cachorro(String nome, int idade) {
		super(nome, idade);
	}

}