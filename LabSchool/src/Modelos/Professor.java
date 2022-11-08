package Modelos;

public class Professor extends Pessoa{
	
	private String experienciaDesenvolvimento;
	private String nivelAcademico;
	private String status;

	public Professor(String nome, String telefone, String dataNascimento, String cpf, String experienciaDesenvolvimento, String nivelAcademico, String status) {
		super(nome, telefone, dataNascimento, cpf);
		// TODO Auto-generated constructor stub
		this.experienciaDesenvolvimento = experienciaDesenvolvimento;
		this.nivelAcademico = nivelAcademico;
		this.status = status;
		
	}

	public String getExperienciaDesenvolvimento() {
		return experienciaDesenvolvimento;
	}

	public void setExperienciaDesenvolvimento(String experienciaDesenvolvimento) {
		this.experienciaDesenvolvimento = experienciaDesenvolvimento;
	}

	public String getNivelAcademico() {
		return nivelAcademico;
	}

	public void setNivelAcademico(String nivelAcademico) {
		this.nivelAcademico = nivelAcademico;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
}
