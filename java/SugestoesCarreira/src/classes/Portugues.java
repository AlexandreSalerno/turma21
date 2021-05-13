package classes;

public class Portugues extends Materia {
	
	public Portugues(double nota, int faltas) {
		super(nota, faltas);
	}

	@Override
	protected char engajamento() {
		if(super.getNota() >= 8.0 && super.getFaltas() <= 5) {
			return 'B'; 
		}
		else if (super.getNota() >= 6.0 && super.getFaltas() <= 10) {
			return 'M';
		}
		else {
			return 'R';
		}
	}
	
	@Override
	public void imprimirListaSugestoes() {
		if(engajamento() == 'B') {
			System.out.println("Seu engajamento está bom. Lista de sugestões a seguir nesta área: ");
			System.out.println("Jornalismo               (X)"); 
			System.out.println("Letras                   (X)");
            System.out.println("Direito                  (X)");
            System.out.println("Publicidade e Propaganda (X)");
            System.out.println("Ciências Sociais         (X)");
                        
		}
		else if (engajamento() == 'M') {
			System.out.println("Seu engajamento está médio. Lista de sugestões a seguir nesta área: ");
			System.out.println("Jornalismo               ( )"); 
			System.out.println("Letras                   (X)");
            System.out.println("Direito                  ( )");
            System.out.println("Publicidade e Propaganda (X)");
            System.out.println("Ciências Sociais         (X)");
		}
		else {
			System.out.println("Seu engajamento está ruim.");
			System.out.println("Jornalismo               ( )"); 
			System.out.println("Letras                   ( )");
            System.out.println("Direito                  ( )");
            System.out.println("Publicidade e Propaganda ( )");
            System.out.println("Ciências Sociais         ( )");
		}
	}
}
