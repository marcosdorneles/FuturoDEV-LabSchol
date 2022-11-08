package Repositorios;

import Modelos.Pedagogo;

import java.util.List;
import java.util.Scanner;

public class RepositorioPedagogo {

	private static Scanner scanner = new Scanner(System.in);
	private static String nomePedagogo, telefonePedagogo, dataNascimentoPedagogo,
	cpfPedagogo;
	
	public static int criaPedagogo(List<Pedagogo>listaPedagogo) {
		
		System.out.println("Para cadastrar um novo pedagogo, insira as seguintes informações");
		System.out.println("Qual o nome do pedagogo?");
		nomePedagogo = scanner.nextLine();
		
		System.out.println("Número de telefone do pedagogo:");
		telefonePedagogo = scanner.nextLine();
		
		System.out.println("Data de nascimento do pedagogo:");
		dataNascimentoPedagogo = scanner.nextLine();
		
		System.out.println("CPF do pedagogo:");
		cpfPedagogo = scanner.nextLine();
		
		Pedagogo pedagogo = new Pedagogo(nomePedagogo, telefonePedagogo, dataNascimentoPedagogo, cpfPedagogo);
		listaPedagogo.add(pedagogo);
		return 0;
		
		
	}
	
	public static void imprimeListaPedagogo(List<Pedagogo>listaPedagogo) {
		if(listaPedagogo.isEmpty()) {
			System.out.println("Ainda não foram cadastrados nenhum pedagogo");
		}
		for(int i = 0; i<listaPedagogo.size(); i++) {
			System.out.println(listaPedagogo.get(i));
		}
	}
	
	public static int pedagogoExiste(List<Pedagogo>listaPedagogo, String nomePedagogo) {
		if(listaPedagogo.isEmpty()) {
			System.out.println("Não existe pedagogo com este nome, tente novamente");
			return -1;
		}
		for(int i = 0; i<= listaPedagogo.size(); i++) {
			Pedagogo pedagogo = listaPedagogo.get(i);
			if(pedagogo.getNome().equalsIgnoreCase(nomePedagogo)) {
				return i;
			};
		}
		return -1;
	}
	public static void geraRelatorioPedagogo(List<Pedagogo>listaPedagogo) {
		if(listaPedagogo.isEmpty()) {
			System.out.println();
		}
		imprimeListaPedagogo(listaPedagogo);
	}
	
//	public static void geraRelatorioPedagogo(List<Pedagogo>listaPedagogo) {
//		int selecao;
//		if(listaPedagogo.isEmpty()) {
//			System.out.println("Ainda não foram cadastrados nenhum pedagogo");
//			return;
//		}
//		do {
//			
//		} while (condition);
//	}
}
