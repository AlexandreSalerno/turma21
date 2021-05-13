package classes;

public class Matematica extends Materia {
	
	public Matematica(double nota, int faltas) {
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
			System.out.println("\nEngenharia        (X)");	
			System.out.println("\nDocência          (X)");	
			System.out.println("\nComércio Exterior (X)");
			System.out.println("\nGestão Financeira (X)");
			System.out.println("\nEconomia          (X)");
		}
		else if (engajamento() == 'M') {
			System.out.println("Seu engajamento está médio. Lista de sugestões a seguir nesta área: ");
			System.out.println("Engenharia        ( )");
			System.out.println("Docência          (X)"); 
			System.out.println("Comércio Exterior (X)");
			System.out.println("Gestão Financeira (X)");
			System.out.println("Economia          ( )");
		}
		else {
			System.out.println("Seu engajamento está ruim.");
			System.out.println("Engenharia        ( )");
			System.out.println("Docência          ( )");
			System.out.println("Comércio Exterior ( )");
			System.out.println("Gestão Financeira ( )");
			System.out.println("Economia          ( )");
		}
	}
	
	/*	
	 	//Engenharia
	 	System.out.println("A Engenharia é a ciência, a arte e a profissão de adquirir e de aplicar os conhecimentos matemáticos, \n"
		+ "técnicos e científicos na criação, aperfeiçoamento e implementação de utilidades, tais como materiais, \n"
		+ "estruturas, máquinas, aparelhos, sistemas ou processos, que realizem uma determinada função ou objetivo.");
		
		//Docencia
		System.out.println("O professor de Matemática pode atuar em escolas de ensino fundamental e médio. \n"
		+ "Se optar por continuar os estudos fazendo mestrado e doutorado, este professor pode ministrar aulas em "
		+ "universidades.");
		
		//Comércio Exterior
		System.out.println("O profissional de comércio exterior pode trabalhar com tudo o que está relacionado aos processos de \n"
		+ "compra e venda de bens e serviços entres os países.");
		
		//Gestao Financeira
		System.out.println("A maioria dos gestores financeiros trabalha acompanhando os resultados financeiros das empresas: gastos,\n"
		+ " lucro, investimentos, contas a pagar e a receber, folha de pagamentos, etc.\r\n"
		+ "\r\n"
		+ "Outros seguem por um caminho mais analítico e buscam dados para elaborar relatórios que, mais adiante, \n"
		+ "serão utilizados para a tomada de decisão e podem determinar o futuro da empresa.");
		
		//Economia
		System.out.println("O economista lida com questões relacionadas ao patrimônio de pessoas, empresas e instituições \n"
		+ "governamentais, realizando planejamentos de ampliação e preservação deste patrimônio.\r\n"
		+ "\r\n"
		+ "Ele realiza estudos e análises de mercado e pode lidar tanto com questões econômicas em grande escala, \n"
		+ "nacionais e internacionais, como com projetos de investimentos de pequenas empresas.");
	 */
}