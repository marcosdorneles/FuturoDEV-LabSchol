
package Repositorios;

import Modelos.Aluno;

import java.util.List;
import java.util.Scanner;



public class RepositorioAluno {
    private static Scanner scanner = new Scanner(System.in);
    private static String nomeAluno, dataNascimentoAluno, cpfAluno, telefoneAluno, statusAluno, digitoAluno;
    private static int notaAluno;;

    public static int criaAluno(List<Aluno> listaAlunos) {
		System.out.println("Para adicionar um Aluno, insira as seguintes informações");
		System.out.println("Nome do aluno:");
		nomeAluno = scanner.nextLine();
		
		System.out.println("CPF do aluno:");
		cpfAluno = scanner.nextLine();
		
		System.out.println("Data de nascimento do aluno:");
		dataNascimentoAluno = scanner.nextLine();
		
		System.out.println("Número de telefone do aluno:");
		telefoneAluno = scanner.nextLine();
		
		System.out.println("Qual o estado de matrícula do aluno:");
		statusAluno = scanner.nextLine();
		
		System.out.println("A nota do aluno no processo seletivo");
		notaAluno = Integer.parseInt(scanner.nextLine());
		
		Aluno aluno = new Aluno(nomeAluno, dataNascimentoAluno, cpfAluno, telefoneAluno, 
				statusAluno);
		
		listaAlunos.add(aluno);
		
		return 0;
    }

    public static void relatorioAlunos(List<Aluno> listaAlunos) {
        int selecao;
        if (listaAlunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado");
            return;
        }
        do {
            int quantidadeAlunos = 0;
            System.out.println("Selecione uma opção: ");
			System.out.println("1- Relatório de alunos ativos");
			System.out.println("2 - Relatório de aluno irregulares:");
			System.out.println("3 - Aluno com maior número de atendimento pedagógico:");
			System.out.println("4 - Todos os alunos:");
			System.out.println("0 - Voltar ao menu inicial:");
			selecao = Integer.parseInt(scanner.nextLine());
           
            switch (selecao) {
                case 0:
                    System.out.println("Retornando");
                    return;
                case 1:
                    for (int i = 0; i < listaAlunos.size(); i++) {
                        Aluno student = listaAlunos.get(i);
                        if (student.getSituacaoMatricula().equalsIgnoreCase("ativo")) {
                            System.out.println("Alunos Ativos");
                            System.out.println(listaAlunos.get(i));
                            quantidadeAlunos++;
                        }
                    
                    }
                    break;
                case 2:
                    for (int i = 0; i < listaAlunos.size(); i++) {
                        Aluno student = listaAlunos.get(i);
                        if (student.getSituacaoMatricula().equalsIgnoreCase("irregular")) {
                            System.out.println("Alunos Irregulares");
                            System.out.println(listaAlunos.get(i));
                            quantidadeAlunos++;
                        }
                        
                    }
                    break;
                case 3:
                    for (int i = 0; i < listaAlunos.size(); i++) {
                        Aluno student = listaAlunos.get(i);
                        if (student.getSituacaoMatricula().equalsIgnoreCase("inativo")) {
                            System.out.println(listaAlunos.get(i));
                            quantidadeAlunos++;
                        }
                        
                    }
                    break;
                case 4:
                    for (int i = 0; i < listaAlunos.size(); i++) {
                        Aluno aluno = listaAlunos.get(i);
                        if (aluno.getSituacaoMatricula().equalsIgnoreCase("atendimento pedagogico")) {
                            
                            System.out.println(listaAlunos.get(i));
                            quantidadeAlunos++;
                        }
                        
                    }
                    break;
                
                default:
                    break;
            }
        } while (selecao != 0);
    }

    public static int alteraSituacaoAluno(String nomeAluno, List<Aluno> listaAlunos) {
        if (listaAlunos.isEmpty()) {
            System.out.println("Nenhum aluno encontrado");
            return 0;
        }
        for (int i = 0; i < listaAlunos.size(); i++) {
            Aluno aluno = listaAlunos.get(i);
            if (aluno.getNome().equalsIgnoreCase(nomeAluno)) {
                setSituacaoAluno(aluno);
               //colocar  System.out.println(); para indicar que houve a alteração
            } 
        }
        return 0;
    }

    private static void setSituacaoAluno(Aluno aluno) {
        String situacaoAluno;
        do {
            System.out.println("Digite o estado de matrícula do aluno"
            );
            situacaoAluno = scanner.nextLine();
        } while (!(situacaoAluno.equalsIgnoreCase("ativo") || situacaoAluno.equalsIgnoreCase("inativo")
                || situacaoAluno.equalsIgnoreCase("irregular") || situacaoAluno.equalsIgnoreCase("atendimento")
                || situacaoAluno.equalsIgnoreCase("atendimento")));

       
        aluno.setSituacaoMatricula(situacaoAluno);
    }


    public static void geraRelatorioAluno(List<Aluno> listaAlunos) {
        if (listaAlunos.isEmpty()) {
            System.out.println("Não existem alunos cadastrados");
        }
        for (int i = 0; i < listaAlunos.size(); i++) {
            System.out.println(listaAlunos.get(i));
        }
    }

}


