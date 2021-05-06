/*
 * 1) Informar todos os números de 1000 a 1999 que quando divididos por 11
obtemos resto = 5. (FOR)
 */

package lista3;

import java.util.Locale;

public class Tarefa1 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		for (int number = 1000; number <= 1999; number++) {
			if (number % 11 == 5) {
				System.out.println(number);
			}
		}		
	}
}