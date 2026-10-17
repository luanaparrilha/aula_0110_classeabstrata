package aula_0110_classeabstrata;

public class Cachorro extends Animal {

	public Cachorro(String nome, String sexo, String raca) {
		super(nome, sexo, raca);
	}

	public void dormir() {
		System.out.println("O CACHORRO está dormindo.");
	}

	public void caminhar() {
		System.out.println("O CACHORRO está caminhando.");
	}

	public void correr() {
		System.out.println("O CACHORRO está correndo.");
	}

	public void emitirSom() {
		System.out.println("O CACHORRO está latindo.");
	}

}