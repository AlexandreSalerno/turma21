/*
 * nome do contribuinte
masculino, feminino, outro - M/F/O
emergencial SIM/N�O - true/false
salario bruto -

se a soma do salario bruto anual foi acima de 60 mil paga IR por faixa
sen�o � isento/isenta/isente
se � isento e usou o emergencial - n�o �  fraude - vc tem direito a mais um emergencial

acima de 5000 at� 6000 - 15%
6000 e 10000 - 17%
acima de 10.000 25%

se pegou o emergencial - fraude  - devolva o valor - 600 * 5


 */

package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class IR {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome;
		char genero, emergencialAux;
		double salarioBruto, taxa, salarioAnual;
		boolean emergencial = false;
		
		System.out.print("Informe seu nome: ");
		nome = sc.nextLine();
		System.out.print("Como voc� se identifica? (M/F/O): ");
		genero = sc.next().toUpperCase().charAt(0);
		System.out.print("J� usou o emergencial? (S/N): ");
		emergencialAux = sc.next().toUpperCase().charAt(0);
		
		if (emergencialAux == 'S') {
			emergencial = true;
		}
		
		//Condi��o tern�ria
		//emergencial = ((emergencialAux == 'S') ? true : false);
		
		System.out.print("Informe seu sal�rio mensal bruto: ");
		salarioBruto = sc.nextDouble();		
		salarioAnual = salarioBruto*12;
		
		if ((salarioAnual) > 60000.0) {
			if (salarioBruto > 5000.0 && salarioBruto <= 6000.0) {
				taxa = salarioAnual * 0.15;
				if (emergencial) {
					System.out.println(nome + ", voc� deve pagar R$" + taxa + " de taxa + R$" + 3000.0 + " de devolu��o do aux�lio emergencial.");
					System.out.println("Imposto total R$ "+(taxa+3000.0));
				}
				else {
					System.out.println(nome + ", voc� deve pagar R$" + taxa + " de imposto.");
				}
			}
			else if (salarioBruto > 6000.0 && salarioBruto <= 10000.0) {
				taxa = salarioAnual * 0.17;
				if (emergencial) {
					System.out.println(nome + ", voc� deve pagar R$" + taxa + " de taxa + R$" + 3000.0 + " de devolu��o do aux�lio emergencial");
					System.out.println("Imposto total R$ "+(taxa+3000.0));
				}
				else {
					System.out.println(nome + ", voc� deve pagar R$" + taxa + " de imposto.");
				}
			}
			else {
				taxa = salarioAnual * 0.25;
				if (emergencial) {
					System.out.println(nome + ", voc� deve pagar R$" + taxa + " de taxa + R$" + 3000.0 + " de devolu��o do aux�lio emergencial");
					System.out.println("Imposto total R$ "+(taxa+3000.0));
				}
				else {
					System.out.println(nome + ", voc� deve pagar R$" + taxa + " de imposto.");
				}
			}
			
		}
		else {
			if (genero == 'M') {
				System.out.println(nome + ", voc� est� isento do IR e tem direito a mais um aux�lio emergencial.");
			}
			else if (genero == 'F') {
				System.out.println(nome + ", voc� est� isenta do IR e tem direito a mais um aux�lio emergencial.");
			}
			else {
				System.out.println(nome + ", voc� est� isente do IR e tem direito a mais um aux�lio emergencial.");
			}
		}
		
		sc.close();
	}
}
