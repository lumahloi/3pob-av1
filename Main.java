package av1pob2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			ArrayList<Produto> listaProds = new ArrayList<Produto>();
			int opcao;
			
			do {
				opcao = menu(sc);
				
				switch(opcao) {
					case 1:
						Produto.Incluir(listaProds);
						break;
					case 2:
						System.out.println("Qual o ID do produto que deseja alterar?");
						Produto.Alterar(listaProds, sc.nextInt());
						break;
					case 3: 
						System.out.println("Qual o ID do produto que deseja excluir?");
						Produto.Excluir(listaProds, sc.nextInt());
						break;
					case 4:
						Produto.ListarTodos(listaProds);
						break;
					case 5: 
						System.out.println("Qual o ID do produto que deseja exibir?");
						Produto.ListarUm(listaProds, sc.nextInt());
						break;
					case 6:
						return;
					default:
						System.out.println("[ERRO] Selecione uma opção válida.");
				}
			} while (opcao != 6);
		}
	}
	

	public static int menu(Scanner sc) {
		int opcao = -1;
		while (true) {
			System.out.println("\n\n\nBem-vindo ao programa. Escolha uma opção:\n"
			+ "[1] Incluir produto\n"
			+ "[2] Alterar produto\n"
			+ "[3] Excluir produto\n"
			+ "[4] Listar todos os produtos\n"
			+ "[5] Listar um produto\n"
			+ "[6] Fechar o programa");
			
			if (sc.hasNextInt()) {
				opcao = sc.nextInt();
			    break;
			} else {
			    System.out.println("[ERRO] Entrada inválida. Por favor, insira um número.");
			     sc.next();
			}
		}
			return opcao;
	}
}
