package aula_0110_classeabstrata;

public class Principal {

	public static void main(String[] args) {

		Lobo lobo = new Lobo("Lobo Mau", "Macho", "Lobo-cinzento");
		lobo.dormir();
		lobo.caminhar();
		lobo.correr();
		lobo.emitirSom();

		System.out.println("--------------------------");

		Tigre tigre = new Tigre("Tigrão", "Macho", "Tigre-de-bengala");
		tigre.dormir();
		tigre.caminhar();
		tigre.correr();
		tigre.emitirSom();

		System.out.println("--------------------------");

		Cachorro cachorro = new Cachorro("Bolt", "Macho", "Pastor Branco Americano");
		cachorro.dormir();
		cachorro.caminhar();
		cachorro.correr();
		cachorro.emitirSom();

		System.out.println("--------------------------");

		Gato gato = new Gato("Garfield", "Macho", "Persa");
		gato.dormir();
		gato.caminhar();
		gato.correr();
		gato.emitirSom();
	}

}