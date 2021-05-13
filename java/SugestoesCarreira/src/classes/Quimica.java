package classes;

public class Quimica extends Materia

{

	public Quimica(double nota, int faltas) {
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
			
			//System.out.println("Tratamento de água e resíduos industriais (x)");
			//System.out.println("Prevenção de riscos no trabalho           (x)");
			System.out.println("Usinas de reciclagem                      (x)");
			//System.out.println("Vinícolas e cachaçarias                   (x)");
			System.out.println("Química forense                           (x)");
			System.out.println("Energias alternativas                     (x)");
			System.out.println("Análise toxicológica                      (x)");
			System.out.println("Controle de qualidade                     (x)");
			//System.out.println("Farmacêutico                              (x)");
			//System.out.println("Análise de narcóticos                     (x)");
		}
		else if (engajamento() == 'M') {
			System.out.println("Seu engajamento está médio. Lista de sugestões a seguir nesta área: ");
			
			//System.out.println("Tratamento de água e resíduos industriais (x)");
			//System.out.println("Prevenção de riscos no trabalho           (x)");
			System.out.println("Usinas de reciclagem                      ( )");
			//System.out.println("Vinícolas e cachaçarias                   (x)");
			System.out.println("Química forense                           ( )");
			System.out.println("Energias alternativas                     ( )");
			System.out.println("Análise toxicológica                      (x)");
			System.out.println("Controle de qualidade                     (x)");
			//System.out.println("Farmacêutico                              ( )");
			//System.out.println("Análise de narcóticos                     ( )");
		}
		else {
			System.out.println("Seu engajamento está ruim.");
			
			//System.out.println("Tratamento de água e resíduos industriais ( )");
			//System.out.println("Prevenção de riscos no trabalho           ( )");
			System.out.println("Usinas de reciclagem                      ( )");
			//System.out.println("Vinícolas e cachaçarias                   ( )");
			System.out.println("Química forense                           ( )");
			System.out.println("Energias alternativas                     ( )");
			System.out.println("Análise toxicológica                      ( )");
			System.out.println("Controle de qualidade                     ( )");
			//System.out.println("Farmacêutico                              ( )");
			//System.out.println("Análise de narcóticos                     ( )");
			
		}
	}
	

	//Usinas de reciclagem:
	//De acordo com o especialista, a reciclagem química 
	//consiste na transformação dos resíduos plásticos em insumos químicos, 
	//combustíveis ou matéria-prima para a fabricação de novos produtos plásticos.
	
	/*
	 * 
	 * Energias alternativas:
	 * 
	 * O que faz e onde trabalha o profissional de energia renovável
Quem segue carreira nesse ramo realiza as seguintes atividades: 
Projeto, instalação, operação e manutenção de sistemas de energia industriais, comerciais e residenciais baseados em energias renováveis (solar, eólica, biomassa, geotérmica, entre outras). 
Pesquisa e desenvolvimento de novas formas, equipamentos e técnicas de produzir energia renovável.
Otimização de sistemas de energias renováveis para diminuir os impactos ambientais e garantir sustentabilidade.
Elaboração de projetos de viabilidade técnica e econômica para aplicação de sistemas de energias renováveis. 
Vistoria, perícia, avaliação, emissão de laudo e parecer técnico em sua área de formação.
	 */
	

	/*Química forense:
	 * no intuito de auxiliar a investigar e compreender como determinados crimes ocorreram
	 */
	
	
	
	/*Análise toxicológica:
	 * São realizadas análises em sangue, plasma, urina e cabelo para monitoramento de exposição a metais e compostos orgânicos
	 */
	
		/*Controle de qualidade :
		 * O controle de qualidade é o termo que se refere ao sistema utilizado para medir o a qualidade de produtos e serviços de acordo com análises e parâmetros técnicos.
		 */
}