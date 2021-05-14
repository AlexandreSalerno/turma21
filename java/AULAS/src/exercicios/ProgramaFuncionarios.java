package exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Funcionario;
import entidades.Terceiro;

public class ProgramaFuncionarios {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Funcionario> lista = new ArrayList<>();
		
		System.out.println("CADASTRO DE FUNCIONARIOS");
		System.out.print("Digite a quantidade de funcionários a serem cadastrados: ");
		int qtd = sc.nextInt();
		
		for (int x = 1; x <= qtd; x++) {
			System.out.print("Digite 1 (Funcionário) ou 2 (Funcionário terceirizado): ");
			char op = sc.next().charAt(0);
			System.out.print("Digite seu nome: ");
			String nome = sc.next();
			System.out.print("Digite sua matricula: ");
			String matricula = sc.next();
			System.out.print("Digite as horas trabalhadas: ");
			int horasTrabalhadas = sc.nextInt();
			System.out.print("Digite o valor hora: ");
			double valorHora = sc.nextDouble();
			if (op == '2') {
				System.out.println("Digite o valor do adicional");
				double adicional = sc.nextDouble();
				lista.add(new Terceiro(matricula, nome, horasTrabalhadas, valorHora, adicional));
			}
			else {
				lista.add(new Funcionario(matricula, nome, horasTrabalhadas, valorHora));
			}
			System.out.println();
		}
		
		System.out.println("FOLHA DE PAGAMENTO");
		for (Funcionario funcionario : lista) {
			System.out.println(funcionario.getNome() + ", seu salário é R$" + funcionario.salario());
		}
		
		sc.close();
	}
}
