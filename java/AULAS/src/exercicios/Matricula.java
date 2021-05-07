/*
 * MATRICULA - G1-1, G1-2,...G1-35 vetor matriculas, vetor notas, vetor alunos
	GRUPO G1
	PARTICIPANTES:
	-
	-
	-
	
	MATRICULA - NOME
	DIGITE A MATRICULA DO ALUNO PARA CADASTRO DE NOTA: _
	DIGITE A NOTA DO ALUNO: _
	CONTINUA S/N
	CASO NÃO - MOSTRA LISTA DE ALUNOS MATRICULA E NOME APENAS DOS QUE TEM NOTA.


 */

package exercicios;

import java.util.Scanner;

public class Matricula {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String alunos[] = {"Alexandre Salerno","Alexsander da Silva Sousa","Aline Moreira Brilhante",
				"Ana Flávia Porto Silva Neves","Andára Finot da Silva","arthur reis allen","Barbara dos Santos",
				"Bruno Wesley Callachi Rocha","Dafhne Noemi da Silva Novais","David da Costa Mariano","Elielthon Soares de Souza",
				"Erika Rosany de Almeida Lima","Fabricio Siqueira Macedo","Fernando Salomão Constancio","Giovanna Cirillo Torres",
				"Guilherme Mendes Carvalho","Guilhermae Monteiro Lopes","Isabelli Santos Silva","Israel Dantas da Silva","Jessica Yuki Toyota",
				"Jonatas Michel de Cardoso Vieira","José Luis Correia dos Santos","Juliana Brito Favero Ribeiro","Lorrans Matildes Facca",
				"Lucas Teodoro de Sousa","Maria Luísa Maricto","Mateus Rosendo Firmino de Oliveira","Matheus de Souza Barbosa",
				"Nathalia Beatriz Silva Pereira","Pedro Henrique de Azevedo Magalhães","Renato Novais da Silva","Renato Yukio Ossiama Nakamura",
				"Robson de Jesus Vasconcelos","Tainah Vinha","Vinicius Martins Santos"};
		
		int matricula[]= new int [alunos.length]; 
		double notas[]= new double [alunos.length];
		char continuar='S';
		int indice=0;
		
		System.out.println("G3:");
		
		System.out.println("Participantes: ");
		System.out.println("Ale, Pedro, Vinicius, Guilherme");
		
		
		for(int x=0; x< alunos.length; x++)
		{
			System.out.printf("Matricula: %d -- Nome: %s \n",x+1,alunos[x]);
			matricula[x]=x+1;	
		}
		
		
		while(continuar=='S' )
		{
			System.out.print("Digite a matricula do aluno: ");
			indice=leia.nextInt();
			System.out.print("Informe a nota: ");
			notas[indice-1]= leia.nextDouble();
			System.out.print("Deseja continua S/N? ");
			continuar = leia.next().toUpperCase().charAt(0);
			
			}
		
		for(int y=0; y<alunos.length; y++)
		{
			if(notas[y]>0) 
			{
				System.out.printf("Matricula: %d -- Nome: %s -- Nota: %.2f \n",y+1,alunos[y],notas[y]);
			}
		}
		
		leia.close();		
	}
}
