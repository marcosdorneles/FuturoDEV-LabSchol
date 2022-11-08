package Modelos;
public class Pedagogo extends Pessoa implements pessoasRegistraveis{

	private int atendimentos = 0;
	

	public Pedagogo(String nome, String telefone, String dataNascimento, String cpf) {
		super(nome, telefone, dataNascimento, cpf);
		// TODO Auto-generated constructor stub
	}


	public int getAtendimentos() {
		return atendimentos;
	}


	// pode implementar incremento no setter?
	public void setAtendimentos(int atendimentos) {
		this.atendimentos += atendimentos;
	}
	
}
