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
		
		Produto.IncluirId(listaProds, p, sc);
		
		Produto.IncluirCodigoDeBarras(p, sc);
		
		Produto.IncluirSku(p, sc);
		
		Produto.IncluirNome(p, sc);
		
		Produto.IncluirDescrição(p, sc);
		
		Produto.IncluirCategoria(p, sc);
		
		Produto.IncluirPreço(p, sc);
		
		Produto.IncluirPeso(p, sc);
		
		Produto.IncluirFabricante(p, sc);
		
		listaProds.add(p);
	}
	
		private static void IncluirId(ArrayList<Produto> listaProds, Produto p, Scanner sc) {
			while(true) {
			    System.out.println("Insira o ID: ");
			    if(sc.hasNextInt()) {
			        int num = sc.nextInt();
			        sc.nextLine(); // consume the newline
			        if(Produto.ProcurarProd(listaProds, num) == null) {
			            p.setId(num);
			            break;
			        }
			        else {
			            System.out.println("Insira outro Id, esse já existe no sistema.");
			        }
			    } else {
			        System.out.println("Insira um número.");
			        if(sc.hasNext()) {
			            sc.next();
			        }
			    }
			}
		}

		private static void IncluirCodigoDeBarras(Produto p, Scanner sc) {
			System.out.println("Insira o Código de Barras: ");
			p.setCodigoDeBarra(sc.nextLine());
		}
		
		private static void IncluirSku(Produto p, Scanner sc) {
			System.out.println("Insira o Sku: ");
			p.setSku(sc.nextLine());
		}
		
		private static void IncluirNome(Produto p, Scanner sc) {
			System.out.println("Insira o Nome: ");
			p.setNome(sc.nextLine());
		}
	
		private static void IncluirDescrição(Produto p, Scanner sc) {
			System.out.println("Insira a Descrição: ");
			p.setDescricao(sc.nextLine());
		}
		
		private static void IncluirCategoria(Produto p, Scanner sc) {
			System.out.println("Insira a Categoria: ");
			p.setCategoria(sc.nextLine());
		}
		
		private static void IncluirPreço(Produto p, Scanner sc) {
			while(true) {
			    System.out.println("Insira o Preço: ");
			    if(sc.hasNextDouble()) {
			        double num = sc.nextDouble();
			        sc.nextLine(); // consume the newline
			        p.setPreço(num);
			        break;
			        
			    } else {
			        System.out.println("Insira um preço no formato X,XX.");
			        sc.next();
			    }
			}
		}
		
		private static void IncluirPeso(Produto p, Scanner sc) {
			while(true) {
			    System.out.println("Insira o Peso: ");
			    if(sc.hasNextDouble()) {
			        double num = sc.nextDouble();
			        sc.nextLine(); // consume the newline
			        p.setPeso(num);
			        break;
			        
			    } else {
			        System.out.println("Insira um peso no formato XX,XX.");
			        sc.next();
			    }
			}
		}
		
		private static void IncluirFabricante(Produto p, Scanner sc) {
			System.out.println("Insira o Fabricante: ");
			p.setFabricante(sc.nextLine());
	}
	
	public static void Alterar(ArrayList<Produto> listaProds, int prodId) {
		try (Scanner sc = new Scanner(System.in)) {
			int opcao;
			
			Produto p = Produto.ProcurarProd(listaProds, prodId);
			if(p != null) {
				do {
					opcao = AlterarMenu(sc);
					sc.nextLine();
					
					switch(opcao) {
						case 1:
							Produto.IncluirId(listaProds, p, sc);
							System.out.println("[SUCESSO] Produto alterado!");
							break;
						case 2:
							Produto.IncluirCodigoDeBarras(p, sc);
							System.out.println("[SUCESSO] Produto alterado!");
							break;
						case 3:
							Produto.IncluirSku(p, sc);
							System.out.println("[SUCESSO] Produto alterado!");
							break;
						case 4:
							Produto.IncluirNome(p, sc);
							System.out.println("[SUCESSO] Produto alterado!");
							break;
						case 5:
							Produto.IncluirDescrição(p, sc);
							System.out.println("[SUCESSO] Produto alterado!");
							break;
						case 6:
							Produto.IncluirCategoria(p, sc);
							System.out.println("[SUCESSO] Produto alterado!");
							break;
						case 7:
							Produto.IncluirPreço(p, sc);
							System.out.println("[SUCESSO] Produto alterado!");
							break;
						case 8:
							Produto.IncluirPeso(p, sc);
							System.out.println("[SUCESSO] Produto alterado!");
							break;
						case 9:
							Produto.IncluirFabricante(p, sc);
							System.out.println("[SUCESSO] Produto alterado!");
							break;
						case 10:
							Main.menu(sc);
						default:
							System.out.println("[ERRO] Selecione uma opção válida.");
					}
				} while (opcao != 10);
			} else {
				System.out.println("[ERRO] Não foi possível encontrar um produto com esse Id.");
			}
		}
	}
	
		private static int AlterarMenu(Scanner sc) {
			System.out.println("\n\n\nO que voce deseja alterar?\n"
			+ "[1] Id\n"
			+ "[2] Codigo de barras\n"
			+ "[3] SKU\n"
			+ "[4] Nome\n"
			+ "[5] Descrição\n"
			+ "[6] Categoria\n"
			+ "[7] Preço\n"
			+ "[8] Peso\n"
			+ "[9] Fabricante\n"
			+ "[10] Sair");
			
			return sc.nextInt();
	}
	
	public static void Excluir(ArrayList<Produto> listaProds, int prodId) {
		Produto p = Produto.ProcurarProd(listaProds, prodId);
		
		if (p == null) {
			System.out.println("[ERRO] Não foi possível encontrar um produto com esse Id.");
		} else {
			listaProds.remove(p);
			System.out.println("[SUCESSO] Produto removido!");
		}
		
	}

	public static void ListarTodos(ArrayList<Produto> listaProds) {
		int i = 1;
		for (Produto p : listaProds) {
			System.out.println("Produto " + i);
			Produto.ExibirProduto(p);
			i++;
		}
	}

	public static void ListarUm(ArrayList<Produto> listaProds, int prodId) {
		Produto p = ProcurarProd(listaProds, prodId);
		
		if (p == null) {
			System.out.println("Não foi possível encontrar um produto com esse Id.");
		} else {
			Produto.ExibirProduto(p);
		}
	}

		private static Produto ProcurarProd(ArrayList<Produto> listaProds, int prodId) {
			for(Produto p : listaProds) {
				if(p.getId() == prodId) {
					return p;
				}
			}
			return null;
		}
		
		private static void ExibirProduto(Produto p) {
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
