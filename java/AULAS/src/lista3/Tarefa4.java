/*
 * 4) Uma empresa desenvolveu uma pesquisa para saber as características
psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: (WHILE)
- o número de pessoas calmas; - ok
- o número de mulheres nervosas; - ok
- o número de homens agressivos;
- o número de outros calmos; - ok
- o número de pessoas nervosas com mais de 40 anos;
- o número de pessoas calmas com menos de 18 anos. - ok
 */

package lista3;

import java.util.Locale;
import java.util.Scanner;

public class Tarefa4 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		final int PEOPLE_AMOUNT = 3;
		int age = 0, totalPeople = 0, calmPeople = 0, angryWomen = 0, agressiveMen = 0, otherCalm = 0, angryPeopleOver40 = 0, calmPeopleUnder18 = 0;
		char gender, temperament;

		while (totalPeople < PEOPLE_AMOUNT) {
			System.out.println((totalPeople + 1) + "º pessoa");
			System.out.print("Informe sua idade: ");
			age = sc.nextInt();
			System.out.print("Como você se identifica? (1 - Feminino / 2 - Masculino / 3 - Outro): ");
			gender = sc.next().charAt(0);
			System.out.print("Você se considera uma pessoa... (1 - Calma / 2 - Nervosa / 3 - Agressiva): ");
			temperament = sc.next().charAt(0);
			System.out.println();

			totalPeople++;
			//Calma
			if (temperament == '1') { 
				calmPeople++;
				if (gender == '3') { 
					otherCalm++;
				}			
				if (age < 18) {
					calmPeopleUnder18++;
				}
			}
			//Nervosa
			else if (temperament == '2') {
				if (gender == '1') {
					angryWomen++;
				}
				if (age > 40) {
					angryPeopleOver40++;
				}
			}
			//Agressiva
			else {
				if (gender == '2') {
					agressiveMen++;
				}
			}
		}

		System.out.println();
		System.out.println("Pessoas calmas                  : " + calmPeople);
		System.out.println("Mulheres nervosas               : " + angryWomen);
		System.out.println("Homens agressivos               : " + agressiveMen);
		System.out.println("Outros calmos                   : " + otherCalm);
		System.out.println("Pessoas nervoas acima de 40 anos: " + angryPeopleOver40);
		System.out.println("Pessoas calmas abaixo de 18 anos: " + calmPeopleUnder18);

		sc.close();
	}
}