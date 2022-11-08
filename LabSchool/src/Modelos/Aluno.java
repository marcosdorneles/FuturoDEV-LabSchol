package Modelos;
public class Aluno extends Pessoa implements pessoasRegistraveis{
	
	private int notaProcessoSeletivo;
	private int atendimentosPedagogicos = 0;
	private String situacaoMatricula;
	
	public Aluno(String nome, String telefone, String dataNascimento, String cpf, String situacaoMatricula
			) {
		super(nome, telefone, dataNascimento,cpf);
		setSituacaoMatricula(situacaoMatricula);
		// como registrar um atendimento?
		if (situacaoMatricula.equalsIgnoreCase("Atendimento pedagogico")) {
			atendimentosPedagogicos++;
			
		}
	}

	public int getNotaProcessoSeletivo() {
		return notaProcessoSeletivo;
	}

	public void setNotaProcessoSeletivo(int notaProcessoSeletivo) {
		this.notaProcessoSeletivo = notaProcessoSeletivo;
	}

	public int getAtendimentosPedagogicos() {
		return atendimentosPedagogicos;
	}

	public void setAtendimentosPedagogicos(int atendimentosPedagogicos) {
		this.atendimentosPedagogicos = atendimentosPedagogicos;
	}

	public String getSituacaoMatricula() {
		return situacaoMatricula;
	}

	public void setSituacaoMatricula(String situacaoMatricula) {
		this.situacaoMatricula = situacaoMatricula;
	}
	
	
}
