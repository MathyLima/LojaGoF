package utils.ListaProduct;

import utils.Product.ProdutoAbstrato;

public interface ListaProdutosControllerInterface {
    void adicionarProduto(String nome, double preco);
    void removerProduto(String nome);
    void atualizarQuantidadeProduto(ProdutoAbstrato produto);
    void atualizaTipoProduto(ProdutoAbstrato produto);
}
