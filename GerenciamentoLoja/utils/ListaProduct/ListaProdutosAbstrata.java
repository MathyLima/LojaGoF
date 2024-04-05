package utils.ListaProduct;

import java.util.ArrayList;
import java.util.List;

import utils.Product.ProdutoAbstrato;

public abstract class ListaProdutosAbstrata implements ListaProdutosInterface {
    protected List<ProdutoAbstrato> produtos;

    public ListaProdutosAbstrata() {
        this.produtos = new ArrayList<>();
    }

    @Override
    public void adicionarProduto(ProdutoAbstrato produto) {
        produtos.add(produto);
    }
    @Override
    public void removerProduto(ProdutoAbstrato produto) {
        produtos.remove(produto);
    }
    @Override
    public ProdutoAbstrato buscarProdutoPorNome(String nome) {
        for (ProdutoAbstrato produto : produtos) {
            if (produto.getName().equals(nome)) {
                return produto;
            }
        }
        return null;
    }
    @Override
    public List<ProdutoAbstrato> getProdutos() {
        return produtos;
    }

    // Outros métodos comuns podem ser adicionados aqui
}