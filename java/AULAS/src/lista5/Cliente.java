package lista5;

public class Cliente {
	private int codigo;
	private String nome;
	private String email;
	private String telefoneCelular;
	private String endereco;
	private String dataNascimento;
	private String cpf;
	private char genero;
	private boolean ativo;
	
	public Cliente(int codigo, String nome, String email, String telefoneCelular, String endereco,
			String dataNascimento, String cpf, char genero, boolean ativo) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.email = email;
		this.telefoneCelular = telefoneCelular;
		this.endereco = endereco;
		this.dataNascimento = dataNascimento;
		this.cpf = cpf;
		this.genero = genero;
		this.ativo = ativo;
	}
	
	public Cliente() {
	}

	public int getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefoneCelular() {
		return telefoneCelular;
	}

	public void setTelefoneCelular(String telefoneCelular) {
		this.telefoneCelular = telefoneCelular;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
	public void buscarClientePorCodigo() {
		System.out.println("============ FICHA CADASTRAL ============");
		System.out.println("NOME              : " + nome.toUpperCase());
		System.out.println("E-MAIL            : " + email.toLowerCase());
		System.out.println("TELEFONE/CELULAR  : " + telefoneCelular);
		System.out.println("ENDEREÇO          : " + endereco.toUpperCase());
		System.out.println("DATA DE NASCIMENTO: " + dataNascimento);
		System.out.println("CPF               : " + cpf);
		if (genero == 'F') {
			System.out.println("GÊNERO            : FEMININO");
		}
		else if (genero == 'M') {
			System.out.println("GÊNERO            : MASCULINO");
		}
		else {
			System.out.println("GÊNERO            : OUTRO");
		}
		if (ativo) {
			System.out.println("ATIVO             : SIM");
		}
		else {
			System.out.println("ATIVO             : NÃO");
		}
	}
}
