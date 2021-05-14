package classes;

public class Biologia extends Materia {

	public Biologia(double nota, int faltas, char op) {
		super(nota, faltas, op);
	}

	@Override
	protected char engajamento() {
		if (super.getNota() >= 8.0 && super.getFaltas() <= 5) {
			return 'B';
		} else if (super.getNota() >= 8.0 && super.getFaltas() > 5) {
			return 'b';
		} else if (super.getNota() >= 6.0 && super.getFaltas() <= 10) {
			return 'M';
		} else if (super.getNota() >= 6.0 && super.getFaltas() > 10) {
			return 'm';
		} else if (super.getNota() < 6.0 && super.getFaltas() > 10) {
			return 'R';
		} else {
			return 'r';
		}
	}

	@Override
	public void imprimirListaSugestoes() {
		if (engajamento() == 'B' || engajamento() == 'b') {
			if (engajamento() == 'B') {
				System.out.print("Seu engajamento está bom. ");
			} else {
				System.out.print("Seu engajamento está bom. Porém procure melhorar suas faltas. ");
			}
			System.out.println("Lista de sugestões a seguir nesta área:");
			System.out.println("1 - Nutrição               (X)");
			System.out.println("2 - Educação Fisica        (X)");
			System.out.println("3 - Medicina               (X)");
			System.out.println("4 - Professor de Biologia  (X)");
			System.out.println("5 - Biologia Marinha       (X)");
		} else if (engajamento() == 'M' || engajamento() == 'm') {
			if (engajamento() == 'M') {
				System.out.print("Seu engajamento está médio. ");
			} else {
				System.out.print("Seu engajamento está médio. Porém procure melhorar suas faltas. ");
			}
			System.out.println("Lista de sugestões a seguir nesta área:");
			System.out.println("1 - Nutrição               ( )");
			System.out.println("2 - Educação Fisica        (X)");
			System.out.println("3 - Medicina               ( )");
			System.out.println("4 - Professor de Biologia  (X)");
			System.out.println("5 - Biologia Marinha       (X)");
		} else {
			if (engajamento() == 'R') {
				System.out.print("Seu engajamento está ruim. Procure melhorar nas notas da matéria.");
			} else {
				System.out.print("Seu engajamento está ruim. Procure melhorar nas notas e faltas da matéria. ");
			}
			System.out.println("Lista de sugestões a seguir nesta área:");
			System.out.println("1 - Nutrição               ( )");
			System.out.println("2 - Educação Fisica        ( )");
			System.out.println("3 - Medicina               ( )");
			System.out.println("4 - Professor de Biologia  ( )");
			System.out.println("5 - Biologia Marinha       ( )");
		}
	}

	@Override
	public void opcao() {

		if (op == '1') {
			System.out.println("Nutrição: \n" + "- Medicina voltada pra área de uma alimentação mais saudável.");
		} else if (op == '2') {
			System.out.println("Educação física: \n"
					+ "- Profissional que trabalha as habiladades com o corpo e exercícios físicos.");
		} else if (op == '3') {
			System.out.println("Medicina:  \n" + "- Profissionais que diagosticam e cuidam da saúde da população.");
		} else if (op == '4') {
			System.out.println("Professor de biologia\r\n" + "- Professional que leciona em escolas ou universidades.");
		} else {
			System.out.println("Biologia marinha: \n"
					+ "- Profissionais que estudam os organismos que vivem no ecossistema salgado.");
		}
	}
}