package aula_0110_classeabstrata;

public class Leao extends Animal {

	public Leao(String nome, String sexo, String raca) {
		super(nome, sexo, raca);
	}

	public void dormir() {
		System.out.println("O LEÃO está dormindo.");
	}

	public void caminhar() {
		System.out.println("O LEÃO está caminhando.");
	}

	public void correr() {
		System.out.println("O LEÃO está correndo.");
	}

	public void emitirSom() {
		System.out.println("O LEÃO está rugindo.");
	}

}