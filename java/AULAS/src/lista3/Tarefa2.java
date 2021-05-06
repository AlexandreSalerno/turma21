/*
 * 2) Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
 */

package lista3;

import java.util.Locale;
import java.util.Scanner;

public class Tarefa2 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int number[] = new int[10], pairs = 0, odd = 0;
		
		for (int i = 0; i < 10; i++) {
			System.out.print("Insira um número [" + (i + 1) + "]: ");
			number[i] = sc.nextInt();
			
			if (number[i] % 2 == 0) {
				pairs++;
			}
			else {
				odd++;
			}
		}
	
		System.out.println("Dos 10 números inseridos, " + pairs + " são pares e " + odd + " são ímpares.");
	
		sc.close();
	}
}
