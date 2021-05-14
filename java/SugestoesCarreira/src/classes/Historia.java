package classes;

public class Historia extends Materia {

	public Historia(double nota, int faltas, char op) {
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
			System.out.println("1 - Jornalismo       (X)");
			System.out.println("2 - Paleontologia    (X)");
			System.out.println("3 - Arqueologia      (X)");
			System.out.println("4 - Turismo          (X)");
			System.out.println("5 - Ciência Sociais  (X)");
		} else if (engajamento() == 'M' || engajamento() == 'm') {
			if (engajamento() == 'M') {
				System.out.print("Seu engajamento está médio. ");
			} else {
				System.out.print("Seu engajamento está médio. Porém procure melhorar suas faltas. ");
			}
			System.out.println("Lista de sugestões a seguir nesta área:");
			System.out.println("1 - Jornalismo       ( )");
			System.out.println("2 - Paleontologia    (X)");
			System.out.println("3 - Arqueologia      (X)");
			System.out.println("4 - Turismo          ( )");
			System.out.println("5 - Ciência Sociais  (X)");
		} else {
			if (engajamento() == 'R') {
				System.out.print("Seu engajamento está ruim. Procure melhorar nas notas da matéria.");
			} else {
				System.out.print("Seu engajamento está ruim. Procure melhorar nas notas e faltas da matéria. ");
			}
			System.out.println("Lista de sugestões a seguir nesta área: ");
			System.out.println("1 - Jornalismo       ( )");
			System.out.println("2 - Turismo          ( )");
			System.out.println("3 - Arqueologia      ( )");
			System.out.println("4 - Paleontologia    ( )");
			System.out.println("5 - Ciência Sociais  ( )");
		}
	}

	@Override
	public void opcao() {

		if (op == '1') {
			System.out.println(" ARQUEOLOGIA:\n"
					+ " A arqueologia é a ciência social que estuda o passado das civilizações humanas por meio dos vestígios materiais deixados por elas, \r\n"
					+ " sendo muito importante para a sociedade, pois resgata a história e a cultura dos antepassados. Ela começou ainda no século XV com o hábito \r\n"
					+ " de colecionar relíquias e antiguidades e, com o tempo, foi se tornando mais profissional e indispensável."
					+ 1);
		} else if (op == '2') {
			System.out.println("  PALEONTOLOGIA:\n"
					+ "O instrumento principal de estudos de um paleontólogo são os fósseis, que são restos e vestígios de animais, plantas e outros seres vivos, \r\n"
					+ "preservados em rochas, assim como ossos, rastros e pegadas que podem ser identificados em campos de escavação e locais a céu aberto. \r\n"
					+ "Há demanda para aqueles que querem reconstituir o passado e passar os seus conhecimentos adiante para as novas gerações."
					+ 2);
		} else if (op == '3') {
			System.out.println("  JORNALISMO:\n"
					+ "O jornalista é o profissional responsável pela apuração, investigação e apresentação de informações de interesse público em forma de \r\n"
					+ "notícias, reportagens, artigos ou entrevistas." + 3);
		} else if (op == '4') {
			System.out.println("  CIÊNCIAS SOCIAIS: \n"
					+ "Seu foco é na análise de movimentos e de conflitos sociais e na formação de opiniões e construção de identidades por meio da pesquisa \r\n"
					+ "sobre hábitos, costumes e as relações entre as pessoas tanto em grupos de interesses quanto na sociedade como um todo. Para isso, o  \r\n"
					+ "profissional elabora um conjunto de metodologias para analisar a coletividade e interpretar seus problemas culturais e políticos."
					+ 4);

		} else {
			System.out.println("  TURISMO: \n"
					+ "// O turismólogo é responsável por analisar e estudar o turismo em sua região para planejar, organizar e gerenciar produtos e atividades \r\n"
					+ "// turísticas de todos os tipos. Áreas em que se pode atuar, “Agência de Viagens, Ecoturismo, Hotelaria, Turismo de Negócios e etc”."
					+ 5);
		}

	}

}
