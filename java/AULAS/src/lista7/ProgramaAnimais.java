package lista7;

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
