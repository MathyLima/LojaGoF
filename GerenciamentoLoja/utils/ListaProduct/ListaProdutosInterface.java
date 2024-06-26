package utils.ListaProduct;

import java.util.List;

import utils.Product.*;


public interface ListaProdutosInterface {

    void adicionarProduto(ProdutoAbstrato produto);
    void removerProduto(ProdutoAbstrato produto);
    ProdutoAbstrato buscarProdutoPorNome(String nome);
    List<ProdutoAbstrato> getProdutos();
}
