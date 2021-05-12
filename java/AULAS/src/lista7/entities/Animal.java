package lista7.entities;

import lista7.utils.Acao;
import lista7.utils.Som;

public abstract class Animal implements Som, Acao {
	private String nome;
	private int idade;
	
	public Animal(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
}
