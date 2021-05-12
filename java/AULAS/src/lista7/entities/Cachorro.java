package lista7.entities;

public class Cachorro extends Animal {

	public Cachorro(String nome, int idade) {
		super(nome, idade);
	}
	
	public void som() {
		System.out.println("Cachorro: Au au au (latindo)");
	}

	public void acao() {
		System.out.println("Cachorro: Tec tec tec (correndo)");
	}
}
