package classes;

public class Matematica extends Materia {

	public Matematica(double nota, int faltas, char op) {
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
			System.out.println("Engenharia         (X)");
			System.out.println("Docência           (X)");
			System.out.println("Comércio Exterior  (X)");
			System.out.println("Gestão Financeira  (X)");
			System.out.println("Economia           (X)");
		} else if (engajamento() == 'M' || engajamento() == 'm') {
			if (engajamento() == 'M') {
				System.out.print("Seu engajamento está médio. ");
			} else {
				System.out.print("Seu engajamento está médio. Porém procure melhorar suas faltas. ");
			}
			System.out.println("Lista de sugestões a seguir nesta área: ");
			System.out.println("Engenharia         ( )");
			System.out.println("Docência           (X)");
			System.out.println("Comércio Exterior  (X)");
			System.out.println("Gestão Financeira  (X)");
			System.out.println("Economia           ( )");
		} else {
			if (engajamento() == 'R') {
				System.out.print("Seu engajamento está ruim. Procure melhorar nas notas da matéria.");
			} else {
				System.out.print("Seu engajamento está ruim. Procure melhorar nas notas e faltas da matéria. ");
			}
			System.out.println("Lista de sugestões a seguir nesta área: ");
			System.out.println("Engenharia         ( )");
			System.out.println("Docência           ( )");
			System.out.println("Comércio Exterior  ( )");
			System.out.println("Gestão Financeira  ( )");
			System.out.println("Economia           ( )");
		}
	}

	@Override
	public void opcao() {

		if (op == '1') {
			System.out.println(
					"A Engenharia é a ciência, a arte e a profissão de adquirir e de aplicar os conhecimentos matemáticos, \n"
							+ "técnicos e científicos na criação, aperfeiçoamento e implementação de utilidades, tais como materiais, \n"
							+ "estruturas, máquinas, aparelhos, sistemas ou processos, que realizem uma determinada função ou objetivo.");
		} else if (op == '2') {
			System.out.println("O professor de Matemática pode atuar em escolas de ensino fundamental e médio. \n"
					+ "Se optar por continuar os estudos fazendo mestrado e doutorado, este professor pode ministrar aulas em "
					+ "universidades.");
		} else if (op == '3') {
			System.out.println(
					"O profissional de comércio exterior pode trabalhar com tudo o que está relacionado aos processos de \n"
							+ "compra e venda de bens e serviços entres os países.");
		} else if (op == '4') {
			System.out.println(
					"A maioria dos gestores financeiros trabalha acompanhando os resultados financeiros das empresas: gastos,\n"
							+ " lucro, investimentos, contas a pagar e a receber, folha de pagamentos, etc.\r\n"
							+ "\r\n"
							+ "Outros seguem por um caminho mais analítico e buscam dados para elaborar relatórios que, mais adiante, \n"
							+ "serão utilizados para a tomada de decisão e podem determinar o futuro da empresa.");
		} else {
			System.out.println(
					"O economista lida com questões relacionadas ao patrimônio de pessoas, empresas e instituições \n"
							+ "governamentais, realizando planejamentos de ampliação e preservação deste patrimônio.\r\n"
							+ "\r\n"
							+ "Ele realiza estudos e análises de mercado e pode lidar tanto com questões econômicas em grande escala, \n"
							+ "nacionais e internacionais, como com projetos de investimentos de pequenas empresas.");
		}
	}
}