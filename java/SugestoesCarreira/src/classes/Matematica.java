package classes;

public class Matematica extends Materia {
	
	public Matematica(double nota, int faltas) {
		super(nota, faltas);
	}

	@Override
	protected char engajamento() {
		if(super.getNota() >= 8.0 && super.getFaltas() <= 5) {
			return 'B'; //Ideia = retornar uma letra baseado na quantidade de faltas (por exemplo - B de Bom)
			//Aparece tudo
		}
		else if (super.getNota() >= 6.0 && super.getFaltas() <= 10) {
			return 'M';
			//Aparece +/-
		}
		else {
			return 'R';
			//Aparece nada
		}
	}
	
	@Override
	public void imprimirListaSugestoes() {
		if(engajamento() == 'B') {
			System.out.println("Seu engajamento está bom. Lista de sugestões a seguir nesta área: ");
			System.out.println("Engenharia");
			System.out.println("Professor");
		}
		else if (engajamento() == 'M') {
			System.out.println("Seu engajamento está médio. Lista de sugestões a seguir nesta área: ");
			System.out.println("Professor");
		}
		else {
			System.out.println("Seu engajamento está ruim.");
		}
	}
}