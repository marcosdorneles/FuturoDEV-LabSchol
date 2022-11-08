package Repositorios;
import java.util.List;
import java.util.Scanner;

import Modelos.Professor;

public class RepositorioProfessor {

	// o eclipse disse para mudar o scanner para static, pq?
	static Scanner scanner = new Scanner(System.in);
	
	// Cria as variáveis que vão ter valores atribuídos pelo scanner
	private static String professorNome, professorTelefone, professorDataNascimento,
	professorNivelAcademico, professorExperienciaDesenvolvimento, professorStatus, professorCPF
	;
	private static int selecao = 0, quantidadeDeProfessor;
	
	
	public static int criaProfessor(List<Professor>listaProfessores) {
		
		System.out.println("Para realizar o cadastro de um novo professor, digite as informações solicitadas:");
		System.out.println("Nome do professor:");
		professorNome = scanner.nextLine();
		
		System.out.println("Qual o telefone do professor?");
		professorTelefone = scanner.nextLine();
		
		System.out.println("Qual a data de nascimento do professor?");
		professorDataNascimento = scanner.nextLine();
		
		System.out.println("Qual o nível acadêmico do professor? (exemplo: bacharel, pós graduado, mestrando, etc...)");
		professorNivelAcademico = scanner.nextLine();
		
		System.out.println("Qual a área de desenvolvimento exercida pelo professor?");
		professorExperienciaDesenvolvimento = scanner.nextLine();
		
		System.out.println("O professor ainda dá aula?");		
		professorStatus = scanner.nextLine();
		
		System.out.println("Qual o CPF do professor?");
		professorCPF = scanner.nextLine();
		
		Professor professor1 = new Professor(professorCPF, professorDataNascimento, professorExperienciaDesenvolvimento, professorNivelAcademico, professorNome, professorStatus, professorTelefone);
		listaProfessores.add(professor1);
						
		return 0;
	}
	
	//Implementar uma forma de obter relatório dos professores
	public static void relatorioProfessores(List<Professor>listaProfessores) {
		if(listaProfessores.isEmpty()) {
			System.out.println("Não existem professores cadastrados");
			return;
		}
		
		do {
			System.out.println("Escolha o critério de relatório:");
			System.out.println("1- Por experiência de desenvolvimento:");
			System.out.println("2 - Todos os professores");
			System.out.println("0 - Retornar ao menu inicial");
			selecao = Integer.parseInt(scanner.nextLine());
			switch(selecao) {
			case 0:
				break;
			case 1:
				procuraExperenciaDesenvolvimento(listaProfessores);
				System.out.println();
				break;
			default:
				break;
			}
		} while (selecao != 0);
	}
	//percorrer uma lista = for; 

	private static void procuraExperenciaDesenvolvimento(List<Professor> listaProfessores) {
		// TODO Auto-generated method stub
		do {
			quantidadeDeProfessor = 0;
			System.out.println("Digite uma opção");
			System.out.println("1 - Fronted:");
			System.out.println("2 - Backend");
			System.out.println("3 - Fullstack");
			System.out.println("4 - Todas as opções");
			System.out.println("0 - Retornar ao menu inicial");
			int selecao = Integer.parseInt(scanner.nextLine());
			
			switch(selecao) {
			case 0:
				return;
			case 1:
				for(int i=0; i<listaProfessores.size(); i++) {
					Professor professor = listaProfessores.get(i);
					if(professor.getExperienciaDesenvolvimento().equalsIgnoreCase("Frontend")) {
						System.out.println(professor);
						quantidadeDeProfessor++;
					}
					if(quantidadeDeProfessor ==0) {
						System.out.println("Ainda não foram registrados nenhum professor");
					}
				}
				break;
			case 2:
				for(int i=0; i < listaProfessores.size(); i++) {
					Professor professor = listaProfessores.get(i);
					if(professor.getExperienciaDesenvolvimento().equalsIgnoreCase("backend")) {
						System.out.println(professor);
						quantidadeDeProfessor++;
					}
					if (quantidadeDeProfessor == 0) {
						System.out.println("Não existem professores backend");
					}
				}
				break;
			case 3:
				for(int i=0; i < listaProfessores.size(); i++) {
					Professor professor = listaProfessores.get(i);
					if(professor.getExperienciaDesenvolvimento().equalsIgnoreCase("fullstack")) {
						System.out.println(professor);
						quantidadeDeProfessor++;
					}
					if (quantidadeDeProfessor == 0) {
						System.out.println("Não existem professores fullstack");
					}
				}
				break;
			case 4:
				for(int i=0; i< listaProfessores.size(); i++) {
					Professor professor = listaProfessores.get(i);
					System.out.println(professor);
					quantidadeDeProfessor++;
				}
				if(quantidadeDeProfessor == 0) {
					System.out.println("Não existem professores cadastrados");
				}
				break;
				default:
					break;
			}
		} while (selecao !=0);
		
	}
	
	public static void geraListaProfessores(List<Professor>listaProfessores) {
		if(listaProfessores.isEmpty()) {
			System.out.println("Não existem professores cadastrados");
		}
		for (int i=0; i<listaProfessores.size(); i++) {
			System.out.println(listaProfessores.get(i));
		}
	}
}
