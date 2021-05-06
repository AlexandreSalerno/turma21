package exemplos;

import java.util.Locale;
import java.util.Scanner;

public class ExemploFor {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		final int HABITANTES = 3;
		int filhos = 0;
		double salario, mediaSalarial = 0.0, totalSalario = 0.0, mediaFilhos = 0.0, totalFilhos = 0.0, maiorSalario = 0.0, percentualSalariosAte100 = 0.0, 
		contadorSalariosAte100 = 0.0;
		
		for (int indice = 1; indice <= HABITANTES; indice++) {
			System.out.printf("Digite o sal�rio do habitante %d: R$", indice);
			salario = sc.nextDouble();
			System.out.println("Digite o n�mero de filhos: ");
			filhos = sc.nextInt();
			totalSalario += salario;
			totalFilhos += filhos;
			
			if (salario > maiorSalario) {
				maiorSalario = salario;
			}
			
			if (salario <= 100) {
				contadorSalariosAte100++;
			}
		}
		
		mediaSalarial = totalSalario / HABITANTES;
		mediaFilhos = totalFilhos / HABITANTES;
		percentualSalariosAte100 = (contadorSalariosAte100 / HABITANTES) * 100;
		
		System.out.println();
		System.out.println("+-------------RESULTADOS PESQUISA-------------+");
		System.out.printf("\nTotal de sal�rios: R$ %.2f", totalSalario);
		System.out.printf("\nM�dia salarial: R$ %.2f", mediaSalarial);
		System.out.printf("\nMaior sal�rio: R$ %.2f", maiorSalario);
		System.out.printf("\nTotal de filhos: %.0f", totalFilhos);
		System.out.printf("\nM�dia de filhos: %.2f", mediaFilhos);
		System.out.printf("\nPercentual de sal�rios at� 100: %.2f%%", percentualSalariosAte100);
		
		sc.close();
	}
}
