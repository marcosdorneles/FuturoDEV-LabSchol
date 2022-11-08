import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Modelos.Aluno;
import Modelos.Pedagogo;
import Modelos.Professor;

public class App {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Aluno> listaAluno = new ArrayList<>();
		List<Professor> listaProfessor = new ArrayList<>();
		List<Pedagogo> listaPedagogo = new ArrayList<>();
		
		int select = 0;
		do {
			System.out.println("Sistema de cadastro da LabSchool");
			System.out.println("Selecione uma opção");
			System.out.println("1 - Novo cadastro");
			System.out.println("2 - Alterar matrícula");
			System.out.println("3 - Criar novo atendimento pedagógico");
			System.out.println("4 - Relatórios");
			System.out.println("0 - Encerrar");
			select = Integer.parseInt(scanner.nextLine());
			switch (select) {
			case 0: 
				System.out.println("Encerrando");
				break;
			case 1:
				// como fazer para criar???
				// perguntar sobre repositórios
				
			
			}
			
		} while (select != 0);
		
	}
}
        
  
        
