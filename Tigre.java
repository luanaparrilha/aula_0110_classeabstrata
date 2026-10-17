package aula_0110_classeabstrata;

public class Tigre extends Animal {

	public Tigre(String nome, String sexo, String raca) {
		super(nome, sexo, raca);
	}

	public void dormir() {
		System.out.println("O TIGRE está dormindo.");
	}

	public void caminhar() {
		System.out.println("O TIGRE está caminhando.");
	}

	public void correr() {
		System.out.println("O TIGRE está correndo.");
	}

	public void emitirSom() {
		System.out.println("O TIGRE está rugindo.");
	}

}