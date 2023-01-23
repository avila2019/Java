package lojaCarro;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Loja l = new Loja();
		
		System.out.println("*=== BEM VINDO AO MUNDO DO AUTOMÓVEL ===*");
		System.out.println("* ============= MENU ============= *");
		System.out.println("1 - CADASTRAR CARRO ");
		System.out.println("2 - PESQUISAR CARRO ");
		System.out.println("3 - LISTAR CARROS ");
		System.out.println("4 - REALIZAR UPDATE DO DONO DO CARRO ");
		System.out.println("5 - INFORMAÇÕES DA LOJA ");
		System.out.println("6 - SAIR DO MENU ");
		System.out.println("Escolha a opção desejada: ");
		System.out.print("-> ");
		int op = sc.nextInt();
		
		do {
			
			switch (op) {
			
			case 1:
				l.cadastrarCarro();
				break;
				
			case 2:
				l.PesquisarCarro();
				break;
				
			case 3:
				l.ListarCarro();
				break;
				
			case 4:
				l.UpdateCarro();
				break;
				
			case 5:
				l.informcoesLoja();
				break;
				
			case 6:
				System.out.println("Saindo do MENU!!");
				break;
				
			default:
				System.out.println("Opção inválida!! Tente novamente.");
				break;
			
			}			
			
			System.out.println("* ============= MENU ============= *");
			System.out.println("1 - CADASTRAR CARRO ");
			System.out.println("2 - PESQUISAR CARRO ");
			System.out.println("3 - LISTAR CARROS ");
			System.out.println("4 - REALIZAR UPDATE DO DONO DO CARRO ");
			System.out.println("5 - INFORMAÇÕES DA LOJA ");
			System.out.println("6 - SAIR DO MENU ");
			System.out.println("Escolha a opção desejada: ");
			System.out.print("-> ");
			op = sc.nextInt();
			
		} while (op != 6);
		
		sc.close();
	}
}
