/*  5 alunos
	sala par - celcius para farehheit
	nome do usu�rio: _
	temperatura :
	mostra: oi xxxx, a temperatura em xxxx � F/C
 */

package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Temperatura {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome;
		double C, F;
		
		System.out.print("Nome do usu�rio: ");
		nome = sc.next();
		System.out.print("Temperatura em C�: ");
		C = sc.nextDouble();
		
		F = (C * 9/5) + 32;
		
		System.out.printf("Oi %s, a temperatura em %.2f C� � %.2f F�", nome, C, F);
		sc.close();
	}
	
	
	
}
