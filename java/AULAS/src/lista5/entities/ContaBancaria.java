package lista5.entities;

public class ContaBancaria {
	private int numero;
	private String agencia;
	private String titulo;
	private char tipo;
	private double saldo;
	
	public ContaBancaria(int numero, String agencia, String titulo, char tipo, double saldo) {
		super();
		this.numero = numero;
		this.agencia = agencia;
		this.titulo = titulo;
		this.tipo = tipo;
		depositar(saldo);
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public char getTipo() {
		return tipo;
	}

	public void setTipo(char tipo) {
		this.tipo = tipo;
	}

	public int getNumero() {
		return numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void depositar(double valor) {
		saldo += valor;
		System.out.println("DEPÓSITO EFETUADO.");
	}
	
	public void sacar(double valor) {
		if (saldo > valor) {
			saldo -= valor;
			System.out.println("SAQUE EFETUADO.");
		}
		else {
			System.out.println("SALDO INSUFICIENTE.");
		}
	}
	
	public void imprimirDados() {
		System.out.println("NÚMERO       : " + numero);
		System.out.println("AGÊNCIA      : " + agencia);
		System.out.println("TÍTULO       : " + titulo);
		if(tipo == '1') {
			System.out.println("TIPO DE CONTA: CONJUNTA");
		}
		else if(tipo == '2') {
			System.out.println("TIPO DE CONTA: CORRENTE");
		}
		else if(tipo == '3') {
			System.out.println("TIPO DE CONTA: POUPANÇA");
		}
		else {
			System.out.println("TIPO DE CONTA: SALÁRIO");
		}		
		System.out.printf("SALDO        : %.2f", saldo);
	}
}
