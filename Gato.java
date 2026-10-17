package aula_0110_classeabstrata;

public class Gato extends Animal {

	public Gato(String nome, String sexo, String raca) {
		super(nome, sexo, raca);
	}

	public void dormir() {
		System.out.println("O GATO está dormindo.");
	}

	public void caminhar() {
		System.out.println("O GATO está caminhando.");
	}

	public void correr() {
		System.out.println("O GATO está correndo.");
	}

	public void emitirSom() {
		System.out.println("O GATO está miando.");
	}

}