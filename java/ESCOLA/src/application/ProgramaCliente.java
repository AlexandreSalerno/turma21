package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Cliente;

public class ProgramaCliente {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char op = ' ';
		int codigoCadastro = 0;
		List<Cliente> lista = new ArrayList<>();
		
		while (op != '3') {
			System.out.println("================= MENU =================");
			System.out.println("1 - CADASTRAR CLIENTE");
			System.out.println("2 - BUSCAR FICHA CADASTRAL");
			System.out.println("3 - SAIR");
			System.out.print("ESCOLHA A OPÇÃO DESEJADA: ");
			op = sc.next().charAt(0);
			System.out.println();
			
			switch (op) {
				case '1':
					System.out.print("NOME: ");
					String nome = sc.next();
					System.out.print("E-MAIL: ");
					String email = sc.next();
					System.out.print("TELEFONE/CELULAR: ");
					String telefoneCelular = sc.next();
					System.out.print("ENDERECO: ");
					String endereco = sc.next();
					System.out.print("DATA DE NASCIMENTO (DD/MM/YYYY): ");
					String dataNascimento = sc.next();
					System.out.print("CPF: ");
					String cpf = sc.next();
					System.out.print("GÊNERO (F/M/O): ");
					char genero = sc.next().toUpperCase().charAt(0);
					System.out.print("ATIVO (S/N): ");
					char ativoAux = sc.next().toUpperCase().charAt(0);
					boolean ativo;
					if(ativoAux == 'S') {
						ativo = true;
					}
					else {
						ativo = false;
					}
					Cliente cliente = new Cliente(codigoCadastro, nome, email, telefoneCelular, endereco, dataNascimento, cpf, genero, ativo);
					lista.add(cliente);
					codigoCadastro++;
					System.out.println();
					break;
				case '2':
					if (!lista.isEmpty()) {
						int opLista = 0;
						System.out.println("=========== LISTA DE CADASTRO ===========");
						System.out.println("CÓDIGO\tNOME");
						for (Cliente cadastro : lista) {
							System.out.println(cadastro.getCodigo() + "\t" + cadastro.getNome());
						}
						System.out.print("INSIRA O CÓDIGO DESEJADO: ");
						opLista = sc.nextInt();
						if(lista.size() > opLista) {
							System.out.println();
							lista.get(opLista).buscarClientePorCodigo();
						}
						else {
							System.out.println("CÓDIGO INSERIDO NÃO CADASTRADO.");
						}
					}
					else {
						System.out.println("A LISTA ESTÁ VAZIA.");
					}
					System.out.println();
					break;
				case '3':
					System.out.println("FIM DE PROGRAMA.");
					break;
				default:
					System.out.println("INSIRA UMA OPÇÃO VÁLIDA.");
					System.out.println();
					break;
			}
		}
		
		sc.close();
	}
}
