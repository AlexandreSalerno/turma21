package exemplos;

import java.util.Locale;
import java.util.Scanner;

public class OiMundo {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Locale.setDefault(Locale.US);
			
		int numero1 = 10, numero2 = 30;
		String nome;
		double salario;
		
		System.out.println("Digite o nome: ");
		nome = leia.next();
		
		System.out.println("Digite um n�mero 1: ");
		numero1 = leia.nextInt();
		System.out.println("Digite um n�mero 2: ");
		numero2 = leia.nextInt();
		System.out.println("Digite o sal�rio: ");
		salario = leia.nextDouble();
		
		System.out.println("Nome: " + nome);
		System.out.println("Sal�rio: " + salario);
		System.out.println(numero1 + numero2);
		
		leia.close();
	}
}
