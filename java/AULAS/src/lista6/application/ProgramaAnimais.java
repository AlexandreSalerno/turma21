package lista6.application;

import lista6.entities.Cachorro;
import lista6.entities.Cavalo;
import lista6.entities.Preguica;

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
		System.out.println("Pregui�a: ");
		preguica.som();
		preguica.acao();
	}
}
