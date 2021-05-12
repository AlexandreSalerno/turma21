package lista6.entities;

public class Cavalo extends Animal {

	public Cavalo(String nome, int idade) {
		super(nome, idade);
	}

	@Override
	public void som() {
		System.out.println("HHIRRRRR (relinchando)");
	}
	
	@Override
	public void acao() {
		System.out.println("Pocotó pocotó pocotó (correndo)");
	}
}
