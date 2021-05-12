package lista6.entities;

public class Preguica extends Animal {

	public Preguica(String nome, int idade) {
		super(nome, idade);
	}
	
	@Override
	public void som() {
		System.out.println("Aaaaaaaah (gritando)");
	}
	
	@Override
	public void acao() {
		System.out.println("Crk crk crk (subindo em árvores)");
	}
}
