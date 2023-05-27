package Services;
import java.util.ArrayList;
import Models.Produto;

public class GerenciadorDeProdutos {
	
	private ArrayList<Produto> ListaDeProdutos;
	
	public GerenciadorDeProdutos() {
	    ListaDeProdutos = new ArrayList<Produto>();
	}
	
	public void AdicionarProduto(Produto produto) {	
		boolean produtoExistente = false;
		
		if (ListaDeProdutos.isEmpty()) {
			ListaDeProdutos.add(produto);
			System.out.println("Produto adicionado com sucesso!");
		}
		else {
			for (Produto prod : ListaDeProdutos) {
				if (prod.getId() == produto.getId()) {
					produtoExistente = true;
				}
			}		
			if (!produtoExistente) {
				ListaDeProdutos.add(produto);
				System.out.println("Produto adicionado com sucesso!");
			}
			else {
				System.out.println("Produto já existente!");
			}
		}
	}
	
	public void RemoverProduto(int id) {
		boolean produtoExistente = false;
		Produto produtoRemovido = null;
		
		if (ListaDeProdutos.isEmpty()) {
			System.out.println("Nenhum produto cadastrado!");
		}
		else {
			for (Produto prod : ListaDeProdutos) {
				if (prod.getId() == id) {
					produtoExistente = true;
					produtoRemovido = prod;
				}
			}		
			if (produtoExistente) {
				ListaDeProdutos.remove(produtoRemovido);
				System.out.println("Produto Removido com sucesso!");
			}
			else {
				System.out.println("Produto não encontrado!");
			}
		}
	}
	
	public void ListarProdutos() {
		if (ListaDeProdutos.isEmpty()) {
			System.out.println("Nenhum produto a ser exibido!");
		}
		else {
			for (Produto prod : ListaDeProdutos) {
				System.out.println(prod.toString());
			}
		}
	}
}
