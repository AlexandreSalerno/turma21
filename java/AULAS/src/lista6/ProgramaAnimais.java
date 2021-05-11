package lista6;

public class ProgramaAnimais {
	public static void main(String[] args) {
		Cachorro cachorro = new Cachorro("Djalma", 5);
		Cavalo cavalo = new Cavalo("Panga", 6);
		Preguica preguica = new Preguica("Soneca", 3);
		
		System.out.println("Cachorro:");
		cachorro.som();
		cachorro.acao();
		System.out.println();
		System.out.println("Cavalo: ");
		cavalo.som();
		cavalo.acao();
		System.out.println();
		System.out.println("Preguiça: ");
		preguica.som();
		preguica.acao();
	}
}
