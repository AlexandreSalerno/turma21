package lista1;

import java.util.Locale;
import java.util.Scanner;

public class Tarefa2 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int years, months, days, ageAsDays;

		System.out.print("Insira sua idade expressa em dias: ");
		ageAsDays = sc.nextInt();

		years = ageAsDays / 365;
		months = (ageAsDays % 365) / 30;
		days = (ageAsDays % 365) % 30;

		System.out.println("Sua idade é aproximadamente " + years + " anos, " + months + " meses e " + days + " dias.");
		
		sc.close();
	}
}
