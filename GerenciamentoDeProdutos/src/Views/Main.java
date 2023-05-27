package Views;
import Models.Produto;
import Services.GerenciadorDeProdutos;

public class Main {
	public static void main(String[] args) {
		GerenciadorDeProdutos gerenciador = new GerenciadorDeProdutos();
		
		Produto p1 = new Produto(1, "PC", 3000.00);
		Produto p2 = new Produto(2, "Console", 2000.00);
		Produto p3 = new Produto(3, "Celular", 1000.00);
		
		gerenciador.AdicionarProduto(p1);
		System.out.println();
		gerenciador.AdicionarProduto(p1);
		System.out.println();
		gerenciador.AdicionarProduto(p2);
		System.out.println();
		gerenciador.AdicionarProduto(p2);
		System.out.println();
		gerenciador.AdicionarProduto(p3);
		System.out.println();
		gerenciador.AdicionarProduto(p3);
		
		gerenciador.ListarProdutos();
		
		gerenciador.RemoverProduto(1);
		System.out.println();
		gerenciador.RemoverProduto(1);
		
		gerenciador.ListarProdutos();
		
		gerenciador.RemoverProduto(2);
		System.out.println();
		gerenciador.RemoverProduto(2);
		
		gerenciador.ListarProdutos();
		
		gerenciador.RemoverProduto(3);
		System.out.println();
		gerenciador.RemoverProduto(3);
		System.out.println();
		gerenciador.ListarProdutos();

		
	}
}
