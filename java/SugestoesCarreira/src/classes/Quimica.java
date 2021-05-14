package classes;

public class Quimica extends Materia {
	public Quimica(double nota, int faltas, char op) {
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
			System.out.println("Lista de sugestões a seguir nesta área: ");
			// System.out.println("Tratamento de água e resíduos industriais (x)");
			// System.out.println("Prevenção de riscos no trabalho (x)");
			System.out.println("1 - Usinas de reciclagem   (X)");
			// System.out.println("Vinícolas e cachaçarias (x)");
			System.out.println("2 - Química forense        (X)");
			System.out.println("3 - Energias alternativas  (X)");
			System.out.println("4 - Análise toxicológica   (X)");
			System.out.println("5 - Controle de qualidade  (X)");
			// System.out.println("Farmacêutico (x)");
			// System.out.println("Análise de narcóticos (x)");
		} else if (engajamento() == 'M' || engajamento() == 'm') {
			if (engajamento() == 'M') {
				System.out.print("Seu engajamento está médio. ");
			} else {
				System.out.print("Seu engajamento está médio. Porém procure melhorar suas faltas. ");
			}
			System.out.println("Lista de sugestões a seguir nesta área: ");
			// System.out.println("Tratamento de água e resíduos industriais (x)");
			// System.out.println("Prevenção de riscos no trabalho (x)");
			System.out.println("1 - Usinas de reciclagem   ( )");
			// System.out.println("Vinícolas e cachaçarias (x)");
			System.out.println("2 - Química forense        ( )");
			System.out.println("3 - Energias alternativas  (X)");
			System.out.println("4 - Análise toxicológica   (X)");
			System.out.println("5 -Controle de qualidade   (X)");
			// System.out.println("Farmacêutico ( )");
			// System.out.println("Análise de narcóticos ( )");
		} else {
			if (engajamento() == 'R') {
				System.out.print("Seu engajamento está ruim. Procure melhorar nas notas da matéria.");
			} else {
				System.out.print("Seu engajamento está ruim. Procure melhorar nas notas e faltas da matéria. ");
			}
			System.out.println("Lista de sugestões a seguir nesta área: ");
			// System.out.println("Tratamento de água e resíduos industriais ( )");
			// System.out.println("Prevenção de riscos no trabalho ( )");
			System.out.println("1 - Usinas de reciclagem   ( )");
			// System.out.println("Vinícolas e cachaçarias ( )");
			System.out.println("2 - Química forense        ( )");
			System.out.println("3 - Energias alternativas  ( )");
			System.out.println("4 - Análise toxicológica   ( )");
			System.out.println("5 - Controle de qualidade  ( )");
			// System.out.println("Farmacêutico ( )");
			// System.out.println("Análise de narcóticos ( )");
		}

	}

	@Override
	public void opcao() {
		if (op == '1') {
			System.out.println("Usinas de reciclagem:\n" + "	//De acordo com o especialista, a reciclagem química \n"
					+ "	//consiste na transformação dos resíduos plásticos em insumos químicos, \n"
					+ "	//combustíveis ou matéria-prima para a fabricação de novos produtos plásticos." + 1);
		} else if (op == '3') {
			System.out.println("Energias alternativas:\n" + "	 * \r\n"
					+ "	 * O que faz e onde trabalha o profissional de energia renovável\n"
					+ "Quem segue carreira nesse ramo realiza as seguintes atividades: \n" + "\n"
					+ "Projeto, instalação, operação e manutenção de sistemas de energia industriais, comerciais e residenciais baseados em energias renováveis (solar, eólica, biomassa, geotérmica, entre outras). \r\n"
					+ "Pesquisa e desenvolvimento de novas formas, equipamentos e técnicas de produzir energia renovável.\r\n"
					+ "Otimização de sistemas de energias renováveis para diminuir os impactos ambientais e garantir sustentabilidade.\r\n"
					+ "Elaboração de projetos de viabilidade técnica e econômica para aplicação de sistemas de energias renováveis. \r\n"
					+ "Vistoria, perícia, avaliação, emissão de laudo e parecer técnico em sua área de formação." + 2);
		} else if (op == '2') {
			System.out.println("Química forense:\n"
					+ "	 * no intuito de auxiliar a investigar e compreender como determinados crimes ocorreram" + 3);
		} else if (op == '4') {
			System.out.println("Análise toxicológica:\n"
					+ "	 * São realizadas análises em sangue, plasma, urina e cabelo para monitoramento de exposição a metais e compostos orgânicos"
					+ 4);
		} else {
			System.out.println("Controle de qualidade :\n"
					+ "		 * O controle de qualidade é o termo que se refere ao sistema utilizado para medir o a qualidade de produtos e serviços de acordo com análises e parâmetros técnicos."
					+ 5);
		}

	}
}