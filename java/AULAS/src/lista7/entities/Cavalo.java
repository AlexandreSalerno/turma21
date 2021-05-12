package lista7.entities;

public class Cavalo extends Animal {

	public Cavalo(String nome, int idade) {
		super(nome, idade);
	}

	public void som() {
		System.out.println("Cavalo: HHIRRRRR (relinchando)");
	}

	public void acao() {
		System.out.println("Cavalo: Pocotó pocotó pocotó (correndo)");
	}
}
