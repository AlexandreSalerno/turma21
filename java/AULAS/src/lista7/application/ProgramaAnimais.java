package lista7.application;

import lista7.entities.Animal;
import lista7.entities.Cachorro;
import lista7.entities.Cavalo;
import lista7.entities.Preguica;

public class ProgramaAnimais {
	public static void main(String[] args) {
		Cachorro cachorro = new Cachorro("Djalma", 5);
		Cavalo cavalo = new Cavalo("Panga", 6);
		Preguica preguica = new Preguica("Soneca", 3);
		
		Animal animais[] = new Animal[3];
		animais[0] = cachorro;
		animais[1] = cavalo;
		animais[2] = preguica;
		
		for (Animal animal : animais) {
			animal.som();
			animal.acao();
			System.out.println();
		}
	}
}
