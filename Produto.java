package av1pob2;

import java.util.ArrayList;
import java.util.Scanner;

public class Produto {
	//atributos
	public int id;
	public String codigoDeBarra;
	public String sku;
	public String nome;
	public String descricao;
	public String categoria;
	public double preço;
	public double peso;
	public String fabricante;
	
	//getters e setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCodigoDeBarra() {
		return codigoDeBarra;
	}
	public void setCodigoDeBarra(String codigoDeBarra) {
		this.codigoDeBarra = codigoDeBarra;
	}
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public double getPreço() {
		return preço;
	}
	public void setPreço(double preço) {
		this.preço = preço;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	
	//métodos
	public static void Incluir(ArrayList<Produto> listaProds) {
		Produto p = new Produto();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o ID: ");
		p.setId(sc.nextInt());
		sc.nextLine();
		
		System.out.println("Insira o Código de Barras: ");
		p.setCodigoDeBarra(sc.nextLine());
		
		System.out.println("Insira o SKU: ");
		p.setSku(sc.nextLine());
		
		System.out.println("Insira o Nome: ");
		p.setNome(sc.nextLine());
		
		System.out.println("Insira a Descrição: ");
		p.setDescricao(sc.nextLine());
		
		System.out.println("Insira a Categoria: ");
		p.setCategoria(sc.nextLine());
		
		System.out.println("Insira o Preço: ");
		p.setPreço(sc.nextDouble());
		sc.nextLine();
		
		System.out.println("Insira o Peso: ");
		p.setPeso(sc.nextDouble());
		sc.nextLine();
		
		System.out.println("Insira o Fabricante: ");
		p.setFabricante(sc.nextLine());
		
		listaProds.add(p);
	}
	
	public static void Alterar(ArrayList<Produto> listaProds, int prodId) {
		Scanner sc = new Scanner(System.in);
		int achou = 0, opcao = 0;
		
		for(Produto p : listaProds) {
			if(p.getId() == prodId) {
				achou = 1;
				while(opcao != 9) {
					System.out.println("O que voce deseja alterar?\n"
							+ "[1] Codigo de barras\n"
							+ "[2] SKU\n"
							+ "[3] Nome\n"
							+ "[4] Descrição\n"
							+ "[5] Categoria\n"
							+ "[6] Preço\n"
							+ "[7] Peso\n"
							+ "[8] Fabricante\n"
							+ "[9] Sair");
					opcao = sc.nextInt();
					sc.nextLine();
					
					switch(opcao) {
						case 1:
							System.out.println("\nDigite o novo código de barras: ");
							p.setCodigoDeBarra(sc.nextLine());
							break;
						case 2:
							System.out.println("\nDigite o novo SKU: ");
							p.setSku(sc.nextLine());
							break;
						case 3:
							System.out.println("\nDigite o novo nome: ");
							p.setNome(sc.nextLine());
							break;
						case 4:
							System.out.println("\nDigite a nova descrição: ");
							p.setDescricao(sc.nextLine());
							break;
						case 5:
							System.out.println("\nDigite a nova categoria: ");
							p.setCategoria(sc.nextLine());
							break;
						case 6:
							System.out.println("\nDigite o novo preço: ");
							p.setPreço(sc.nextDouble());
							break;
						case 7:
							System.out.println("\nDigite o novo peso: ");
							p.setPeso(sc.nextDouble());
							break;
						case 8:
							System.out.println("\nDigite o novo fabricante: ");
							p.setFabricante(sc.nextLine());
							break;
						case 9:
							return;
						default:
							System.out.println("Selecione uma opção válida.");
					}
				}
			}
		}
		
		if (achou == 0) {
			System.out.println("Não foi possível encontrar um produto com esse Id.");
		}
	}
	
	public static void Excluir(ArrayList<Produto> listaProds, int prodId) {
		Scanner sc = new Scanner(System.in);
		int achou = 0, index = 0;
		
		for(Produto p : listaProds) {
			if(p.getId() == prodId) {
				achou = 1;
				index = listaProds.indexOf(p);
				break;
			}
		}
		
		if (achou == 0) {
			System.out.println("Não foi possível encontrar um produto com esse Id.");
		} else {
			listaProds.remove(index);
		}
	}

	public static void ListarTodos(ArrayList<Produto> listaProds) {
		int i = 1;
		for (Produto p : listaProds) {
			System.out.println("Produto " + i);
			System.out.println("Id : " + p.getId());
			System.out.println("Código de barras : " + p.getCodigoDeBarra());
			System.out.println("SKU : " + p.getSku());
			System.out.println("Nome : " + p.getNome());
			System.out.println("Descrição : " + p.getDescricao());
			System.out.println("Categoria : " + p.getCategoria());
			System.out.println("Preço : " + p.getPreço());
			System.out.println("Peso : " + p.getPeso());
			System.out.println("Fabricante : " + p.getFabricante());
			System.out.println("\n");
		}
	}

	public static void ListarUm(ArrayList<Produto> listaProds, int prodId) {
		Scanner sc = new Scanner(System.in);
		int achou = 0;
		Produto escolhido = new Produto();
		
		for(Produto p : listaProds) {
			if(p.getId() == prodId) {
				achou = 1;
				escolhido = p;
				break;
			}
		}
		
		if (achou == 0) {
			System.out.println("Não foi possível encontrar um produto com esse Id.");
		} else {
			System.out.println("Id : " + escolhido.getId());
			System.out.println("Código de barras : " + escolhido.getCodigoDeBarra());
			System.out.println("SKU : " + escolhido.getSku());
			System.out.println("Nome : " + escolhido.getNome());
			System.out.println("Descrição : " + escolhido.getDescricao());
			System.out.println("Categoria : " + escolhido.getCategoria());
			System.out.println("Preço : " + escolhido.getPreço());
			System.out.println("Peso : " + escolhido.getPeso());
			System.out.println("Fabricante : " + escolhido.getFabricante());
			System.out.println("\n");
		}
	}
}
