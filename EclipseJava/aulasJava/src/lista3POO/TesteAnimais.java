package lista3POO;

public class TesteAnimais {

	public static void main(String[] args) {
		Animal a = new Cachorro("Rex",4);
		Animal b = new Cavalo("Bojack",3);
		Animal c = new Preguica("lucky",2);
		
		System.out.println("Animal a: "+a.fazerSom());
		System.out.println("Animal b: "+b.fazerSom());
		System.out.println("Animal c: "+c.fazerSom());
	}

}