/*
 * 3) Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)
 */

package lista3;

import java.util.Locale;
import java.util.Scanner;

public class Tarefa3 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int age = 0, totalPeople = 0, totalPeopleUnder21 = 0, totalPeopleOver50 = 0;
		
		while (age != -99) {
			System.out.print("Insira sua idade: ");
			age = sc.nextInt();
			
			if (age == -99) {
				break;
			}
			
			totalPeople++;
			if (age < 21) {
				totalPeopleUnder21++;
			} else if (age > 50) {
				totalPeopleOver50++;
			}
		}
		
		System.out.println();
		System.out.println("Total de pessoas: " + totalPeople);
		System.out.println("Total de pessoas abaixo de 21 anos: " + totalPeopleUnder21);
		System.out.println("Total de pessoas acima de 50 anos: " + totalPeopleOver50);
		
		sc.close();
	}
}
