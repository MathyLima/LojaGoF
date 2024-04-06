package utils.ListaProduct;

import utils.Product.ProdutoAbstrato;
import utils.Product.ProdutoDisponivel;
import utils.Product.ProdutoNaoDisponivel;
import utils.ListProductFacade;

public class MainDisponiveis {
    public static void main(String[] args) {
        ListaProdutosDisponiveis listaProdutosDisponiveis =  new ListaProdutosDisponiveis();
        listaProdutosDisponiveis = listaProdutosDisponiveis.getInstance();
        ListaProdutosNaoDisponiveis listaProdutosNaoDisponiveis = new ListaProdutosNaoDisponiveis();
        listaProdutosNaoDisponiveis =  listaProdutosNaoDisponiveis.getInstance();
        // Obtendo a instância única da fachada de lista de produtos
        ListProductFacade facade =  ListProductFacade.getInstance();

        // Adicionando alguns produtos à lista de produtos disponíveis
        ProdutoAbstrato produto1 = new ProdutoDisponivel("Produto A", 10.0, 20);
        ProdutoAbstrato produto2 = new ProdutoDisponivel("Produto B", 20.0, 30);
        listaProdutosDisponiveis.adicionarProduto(produto1);
        listaProdutosDisponiveis.adicionarProduto(produto2);

        // Adicionando um produto à lista de produtos não disponíveis
        ProdutoAbstrato produto3 = new ProdutoNaoDisponivel("Produto C", 50);
        listaProdutosNaoDisponiveis.adicionarProduto(produto3);

        // Exibindo os produtos disponíveis
        System.out.println("Produtos Disponíveis:");
        for (ProdutoAbstrato produto : listaProdutosDisponiveis.getProdutos()) {
            System.out.println("Nome: " + produto.getName() + ", Preço: " + produto.getPreco() + ", Quantidade: " + produto.getQuantidade());
        }

        // Exibindo os produtos não disponíveis
        System.out.println("\nProdutos Não Disponíveis:");
        for (ProdutoAbstrato produto : listaProdutosNaoDisponiveis.getProdutos()) {
            System.out.println("Nome: " + produto.getName() + ", Preço: " + produto.getPreco() + ", Quantidade: " + produto.getQuantidade());
        }

        // Testando atualização de quantidade de produto disponível
        ProdutoAbstrato produtoAtualizado = facade.buscarProdutoEmListas("Produto A");
        if (produtoAtualizado != null) {
            facade.atualizarQuantidadeDoProduto(produtoAtualizado, 5); // Adicionando 5 unidades ao Produto A
        }

        // Testando atualização de quantidade de produto não disponível
        produtoAtualizado = facade.buscarProdutoEmListas("Produto C");
        if (produtoAtualizado != null) {
            facade.atualizarQuantidadeDoProduto(produtoAtualizado, + 20); // Subtraindo 20 unidades do Produto C
        }

        System.out.println("Produtos Disponíveis:");
        for (ProdutoAbstrato produto : listaProdutosDisponiveis.getProdutos()) {
            System.out.println("Nome: " + produto.getName() + ", Preço: " + produto.getPreco() + ", Quantidade: " + produto.getQuantidade());
        }

         // Exibindo os produtos não disponíveis
         System.out.println("\nProdutos Não Disponíveis:");
         for (ProdutoAbstrato produto : listaProdutosNaoDisponiveis.getProdutos()) {
             System.out.println("Nome: " + produto.getName() + ", Preço: " + produto.getPreco() + ", Quantidade: " + produto.getQuantidade());
         }
 
    }
}
