package utils.ListaProduct;

import utils.ListaProduct.ListaProdutosDisponiveis;
import utils.Product.ProdutoAbstrato;
import utils.Product.ProdutoDisponivel;
import utils.Product.ProdutoNaoDisponivel;

public class MainDisponiveis {
    public static void main(String[] args) {

        // Obtendo a instância única da lista de produtos disponíveis
        ListaProdutosDisponiveis listaProdutosDisponiveis = new ListaProdutosDisponiveis();
        listaProdutosDisponiveis = listaProdutosDisponiveis.getInstance();

        ListaProdutosNaoDisponiveis listaProdutosNaoDisponiveis = new ListaProdutosNaoDisponiveis();

        // Adicionando alguns produtos à lista de produtos disponíveis
        ProdutoAbstrato produto1 = new ProdutoDisponivel("Produto A", 10.0, 20); // Exemplo de ProdutoDisponivel com quantidade
        ProdutoAbstrato produto2 = new ProdutoDisponivel("Produto B", 20.0, 30);
        listaProdutosDisponiveis.adicionarProduto(produto1);
        listaProdutosDisponiveis.adicionarProduto(produto2);

        ProdutoAbstrato produto3 = new ProdutoNaoDisponivel("PRODUTO C", 50);
        listaProdutosNaoDisponiveis.adicionarProduto(produto3);
        // Exibindo os produtos disponíveis
        System.out.println("Produtos Disponíveis:");
        for (ProdutoAbstrato produto : listaProdutosDisponiveis.getProdutos()) {
            System.out.println("Nome: " + produto.getName() + ", Preço: " + produto.getPreco());
        }

        System.out.println("Produtos Não Disponíveis:");
        for (ProdutoAbstrato produto : listaProdutosNaoDisponiveis.getProdutos()) {
            System.out.println("Nome: " + produto.getName() + ", Preço: " + produto.getPreco());
        }

        ListaProdutosDisponiveis lista = new ListaProdutosDisponiveis();
        lista = lista.getInstance();
        System.out.println("Produtos Disponíveis:");
        for (ProdutoAbstrato produto : lista.getProdutos()) {
            System.out.println("Nome: " + produto.getName() + ", Preço: " + produto.getPreco());
        }


    }
}
