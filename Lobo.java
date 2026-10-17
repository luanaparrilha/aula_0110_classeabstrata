package aula_0110_classeabstrata;

public class Lobo extends Animal {

	public Lobo(String nome, String sexo, String raca) {
		super(nome, sexo, raca);
	}

	public void dormir() {
		System.out.println("O LOBO está dormindo.");
	}

	public void caminhar() {
		System.out.println("O LOBO etá caminhando.");
	}

	public void correr() {
		System.out.println("O LOBO está correndo.");
	}

	public void emitirSom() {
		System.out.println("O LOBO está uivando.");
	}

}