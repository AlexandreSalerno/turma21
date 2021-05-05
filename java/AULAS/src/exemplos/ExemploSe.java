package exemplos;

import java.util.Locale;
import java.util.Scanner;

public class ExemploSe {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		int numero;
		
		System.out.print("Digite um número inteiro positivo: ");
		numero = leia.nextInt();
		
		if (numero == 0) {
			System.out.println("Zero é neutro.");
		}
		else if (numero < 0) {
			System.out.println("Número negativo.");
		}
		else if (numero % 2 == 0) {
			System.out.println("Número par.");
		} 
		else {
			System.out.println("Número ímpar.");
		}
		
		leia.close();
	}
}
