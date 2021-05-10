package entidades;

public class Pessoa {
	public String nome;
	public int anoNascimento;
	public char genero;
	public boolean vivo;
	
	public void idadeAproximada() {
		System.out.println("A idade aproximada é " + (2021 - anoNascimento));
	}
	
}
