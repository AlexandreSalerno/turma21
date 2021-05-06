/*
 * 4) Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
�mpar exiba o n�mero elevado ao quadrado.
 */

package lista2;

import java.util.Locale;
import java.util.Scanner;

public class Tarefa4 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.print("Insira um n�mero: ");
		numero = sc.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("Par.");
			System.out.println(Math.sqrt(numero));
		}
		else {
			System.out.println("�mpar.");
			System.out.println(Math.pow(numero, 2.0));
		}
		
		sc.close();
	}
}
