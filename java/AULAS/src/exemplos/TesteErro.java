package exemplos;

import java.util.Scanner;

public class TesteErro {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int valor;
		String nomes[] = new String[3];
		
		System.out.print("Digite o número da posição[1 a 3] para cadastrar o nome: ");
		valor = leia.nextInt();
		System.out.print("Digite o nome da pessoa a ser cadastrada: ");
		nomes[valor] = leia.next().toUpperCase();
		
		System.out.println(nomes[valor]);
		System.out.println("Fim de programa!!!");
		
		leia.close();
	}
}
