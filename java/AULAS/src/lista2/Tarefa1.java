/*
 * 1) Faça um programa que receba três inteiros e diga qual deles é o maior.
 */

package lista2;

import java.util.Locale;
import java.util.Scanner;

public class Tarefa1 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int number1, number2, number3;
		
		System.out.print("Insira um valor para o número 1: ");
		number1 = sc.nextInt();
		System.out.print("Insira um valor para o número 2: ");
		number2 = sc.nextInt();
		System.out.print("Insira um valor para o número 3: ");
		number3 = sc.nextInt();
		
		if (number1 > number2 && number1 > number3) {
			System.out.println("O valor do número 1 é o maior.");
		}		
		else if (number2 > number1 && number2 > number3) {
			System.out.println("O valor do número 2 é o maior.");
		}
		else if (number3 > number1 && number3 > number2) {
			System.out.println("O valor do número 3 é o maior.");
		}
		else if (number1 == number2 && number1 == number3) {
			System.out.println("Os valores dos 3 números são iguais.");
		}
		else if(number1 == number2) {
			System.out.println("Os valores dos números 1 e 2 são os maiores.");
		}
		else if(number1 == number3) {
			System.out.println("Os valores dos números números 1 e 3 são os maiores.");
		}
		else if(number2 == number3) {
			System.out.println("Os valores dos números números 2 e 3 são os maiores.");
		}
		
		sc.close();
	}
}
