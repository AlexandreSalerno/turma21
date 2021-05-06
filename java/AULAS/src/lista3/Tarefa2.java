/*
 * 2) Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
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
			System.out.print("Insira um n�mero [" + (i + 1) + "]: ");
			number[i] = sc.nextInt();
			
			if (number[i] % 2 == 0) {
				pairs++;
			}
			else {
				odd++;
			}
		}
	
		System.out.println("Dos 10 n�meros inseridos, " + pairs + " s�o pares e " + odd + " s�o �mpares.");
	
		sc.close();
	}
}
