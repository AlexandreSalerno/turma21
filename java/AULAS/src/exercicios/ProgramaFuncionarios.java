package exercicios;

import java.util.Locale;

import entidades.Funcionario;
import entidades.Terceiro;

public class ProgramaFuncionarios {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Funcionario funcionario = new Funcionario("M001", "Maria", 8, 20.0);
		Funcionario terceiro = new Terceiro("M001", "Maria", 8, 20.0, 100.0);
		
		System.out.println(funcionario.salario());
		System.out.println(terceiro.salario());
	}
}
