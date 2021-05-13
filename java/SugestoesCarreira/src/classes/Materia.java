package classes;

public abstract class Materia {
	private double nota;
	private int faltas;
	
	public Materia(double nota, int faltas) {
		super();
		this.nota = nota;
		this.faltas = faltas;
	}
	
	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public int getFaltas() {
		return faltas;
	}

	public void setFaltas(int faltas) {
		this.faltas = faltas;
	}

	//Engajamento (quantas faltas voce teve em um periodo) - recomendar carreira baseado em engajamento (filtro)
	protected char engajamento() {
		if(faltas <= 10) {
			return 'B';
		}
		else if (faltas <= 20) {
			return 'M';
		}
		else {
			return 'R';
		}
	}
	
	public void imprimirListaSugestoes() {
		if (engajamento() == 'B') {
			System.out.println("Imprime lista baseada na matéria...");
		}	
	}
}
