/*
 * 1) Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
 */

package lista2;

import java.util.Locale;
import java.util.Scanner;

public class Tarefa1 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int number1, number2, number3;
		
		System.out.print("Insira um valor para o n�mero 1: ");
		number1 = sc.nextInt();
		System.out.print("Insira um valor para o n�mero 2: ");
		number2 = sc.nextInt();
		System.out.print("Insira um valor para o n�mero 3: ");
		number3 = sc.nextInt();
		
		if (number1 > number2 && number1 > number3) {
			System.out.println("O valor do n�mero 1 � o maior.");
		}		
		else if (number2 > number1 && number2 > number3) {
			System.out.println("O valor do n�mero 2 � o maior.");
		}
		else if (number3 > number1 && number3 > number2) {
			System.out.println("O valor do n�mero 3 � o maior.");
		}
		else if (number1 == number2 && number1 == number3) {
			System.out.println("Os valores dos 3 n�meros s�o iguais.");
		}
		else if(number1 == number2) {
			System.out.println("Os valores dos n�meros 1 e 2 s�o os maiores.");
		}
		else if(number1 == number3) {
			System.out.println("Os valores dos n�meros n�meros 1 e 3 s�o os maiores.");
		}
		else if(number2 == number3) {
			System.out.println("Os valores dos n�meros n�meros 2 e 3 s�o os maiores.");
		}
		
		sc.close();
	}
}
