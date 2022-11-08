package Modelos;
public abstract class Pessoa {
	
	private String nome;
	private String telefone;
	private String dataNascimento;
	private String cpf;
	
	
	private static int codigo = 0;
	//imprimir valor numeroCodigo para identificar
	private int numeroCodigo;
	
	
	//Construtor
	public Pessoa(String nome, String telefone, String dataNascimento, String cpf) {
		this.setNome(nome);
		this.setCpf(cpf);
		this.setDataNascimento(dataNascimento);
		this.setTelefone(telefone);
		this.numeroCodigo = codigo++;
	}

		
	// getter e setters
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
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


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public static int getCodigo() {
		return codigo;
	}


	public static void setCodigo(int codigo) {
		Pessoa.codigo = codigo;
	}


	public int getNumeroCodigo() {
		return numeroCodigo;
	}


	public void setNumeroCodigo(int numeroCodigo) {
		this.numeroCodigo = numeroCodigo;
	}
	
	
	
	
	
}