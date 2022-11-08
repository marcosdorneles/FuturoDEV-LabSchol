package app;

import Modelos.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Modelos.*;
import Repositorios.*;

public class app {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	List<Aluno> listaAlunos = new ArrayList<>();
	List<Professor> listaProfessores = new ArrayList<>();
	List<Pedagogo> listaPedagogos = new ArrayList<>();
	RepositorioAluno RepositorioAluno = new RepositorioAluno();
	RepositorioProfessor RepositorioAProfessor = new RepositorioProfessor();
	RepositorioPedagogo RepositorioPedagogo = new RepositorioPedagogo();
	int selecao;
	
	do {
		System.out.println("Sistema de cadastro");
		System.out.println("Selecione uma opção");
		System.out.println("1 - Novo cadastro");
		System.out.println("2 - Alterar sistuação de matrícula");
		System.out.println("3 - Relatórios");
		System.out.println("0 - Sair");
		selecao = Integer.parseInt(scanner.nextLine());
		switch (selecao) {
		case 0: 
			System.out.println("Encerrando o sistema");
			break;
		case 1:
			do {
				System.out.println("selecione uma opção");
				System.out.println("1 - Aluno");
				System.out.println("2 - Professor");
				System.out.println("3 - Pedagogo");
				System.out.println("0 - Retornar");
				selecao = Integer.parseInt(scanner.nextLine());
				switch (selecao) {
				case 0: 
					break;
				case 1:
					RepositorioAluno.criaAluno(listaAlunos);
					System.out.println();
					selecao = 0;
					break;
				case 2:
					RepositorioAProfessor.criaProfessor(listaProfessores);
					System.out.println();
					selecao = 0;
					break;
				case 3:
					RepositorioPedagogo.criaPedagogo(listaPedagogos);
					System.out.println();
					break;
				default:
					break;
				}
			} while (selecao != 0);
			break;
		case 2:
			System.out.println("Qual aluno que deseja alterar a matrícula?");
			String nome = scanner.nextLine();
			RepositorioAluno.alteraSituacaoAluno(nome, listaAlunos);
		case 3:
			do {
				System.out.println("Relatórios - selecione uma opção");
				System.out.println("1 - Todos os alunos");
				System.out.println("2 - Todos os professores");
				System.out.println("3 - Todos os pedagogos");
				System.out.println("0 - Retornar");
				selecao = Integer.parseInt(scanner.nextLine());
				switch (selecao) {
				case 0:
					break;
				case 1:
					RepositorioAluno.geraRelatorioAluno(listaAlunos);
					selecao = 0;
					break;
				case 2:
					RepositorioAProfessor.relatorioProfessores(listaProfessores);
					selecao = 0;
					break;
				case 3:
					RepositorioPedagogo.geraRelatorioPedagogo(listaPedagogos);
					selecao = 0;
					break;
				default:
					break;
				}
			} while (selecao != 0);
			
		
		default:
			throw new IllegalArgumentException("Unexpected value: " + selecao);
		}
		
	} while (selecao != 0);
}
}
