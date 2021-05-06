/*
 * 2) Faça um programa que entre com três números e coloque em ordem crescente.
 */

package lista2;

import java.util.Locale;
import java.util.Scanner;

public class Tarefa2 {
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
		
		if (number1 > number2) {
			if (number2 > number3) {				
				System.out.println(number3 + " " + number2 + " " + number1);
			}
			else {	
			    if (number1 > number3) {
			    	System.out.println(number2 + " " + number3 + " " + number1);
			    }
			    else {
			    	System.out.println(number2 + " " + number1 + " " + number3);
			    }
			}
			
		}
		else {	 
			if (number2 > number3) {
				if (number1 > number3) {
					System.out.println(number3 + " " + number1 + " " + number2);
				}
				else {
					System.out.println(number1 + " " + number3 + " " + number2);
				}
			}
			else {
				System.out.println(number1 + " " + number2 + " " + number3);
			}
	    }	
		sc.close();
	}
}
