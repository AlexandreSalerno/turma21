package lista6.entities;

public class Cachorro extends Animal {

	public Cachorro(String nome, int idade) {
		super(nome, idade);
	}
	
	@Override
	public void som() {
		System.out.println("Au au au (latindo)");
	}

	@Override
	public void acao() {
		System.out.println("Tec tec tec (correndo)");
	}
}
