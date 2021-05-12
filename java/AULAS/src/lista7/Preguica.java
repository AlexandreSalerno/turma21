package lista7;

public class Preguica extends Animal {

	public Preguica(String nome, int idade) {
		super(nome, idade);
	}

	public void som() {
		System.out.println("Preguiça: Aaaaaaaah (gritando)");
	}

	public void acao() {
		System.out.println("Preguiça: Crk crk crk (subindo em árvores)");
	}
}
