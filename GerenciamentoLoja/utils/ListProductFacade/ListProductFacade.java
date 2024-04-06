package utils.ListProductFacade;

import utils.ListaProduct.ListaProdutosDisponiveis;
import utils.ListaProduct.ListaProdutosNaoDisponiveis;
import utils.Product.ProdutoAbstrato;
import utils.Product.ProdutoController;
import utils.Product.ProdutoDisponivel;
import utils.Product.ProdutoNaoDisponivel;

public class ListProductFacade {
    private static ListProductFacade instance;
    private ListaProdutosDisponiveis listaProdutosDisponiveis  ;
    private ListaProdutosNaoDisponiveis listaProdutosNaoDisponiveis;
    private ProdutoController produtoController = new ProdutoController();

    private ListProductFacade(){

        listaProdutosDisponiveis = ListaProdutosDisponiveis.getInstance();
        listaProdutosNaoDisponiveis = ListaProdutosNaoDisponiveis.getInstance();
        produtoController = produtoController.getInstance();
    }

    public synchronized static ListProductFacade getInstance(){
        if(instance == null){
            instance = new ListProductFacade();
        }
        return instance;
    }

    public void atualizarQuantidadeProduto(String nomeProduto, double addSubQuantidade) {
        ProdutoAbstrato produto = buscarProdutoEmListas(nomeProduto);
        if (produto != null) {
            atualizarQuantidadeDoProduto(produto, addSubQuantidade);
        } else {
            // Lidar com o caso em que o produto não é encontrado em nenhuma lista
            // Por exemplo, lançar uma exceção ou registrar uma mensagem de erro
        }
    }

    public ProdutoAbstrato buscarProdutoEmListas(String nomeProduto){
        ProdutoAbstrato produto = listaProdutosDisponiveis.buscarProdutoPorNome(nomeProduto);
        if(produto == null){
            produto = listaProdutosNaoDisponiveis.buscarProdutoPorNome(nomeProduto);
        }
        return produto;
    }

    public void atualizarQuantidadeDoProduto(ProdutoAbstrato produto, double addSubQuantidade){
        produto = produtoController.atualizaProduto(produto, addSubQuantidade);

        atualizarProdutoNasListas(produto);

    }
    
    private ProdutoAbstrato encontrarProdutoAntigo(ProdutoAbstrato produtoAtualizado) {
        if (produtoAtualizado instanceof ProdutoDisponivel) {
            return listaProdutosNaoDisponiveis.buscarProdutoPorNome(produtoAtualizado.getName());
        } else if (produtoAtualizado instanceof ProdutoNaoDisponivel) {
            return listaProdutosDisponiveis.buscarProdutoPorNome(produtoAtualizado.getName());
        }
        return null;
    }
    

    public void atualizarProdutoNasListas(ProdutoAbstrato produtoAtualizado) {
        ProdutoAbstrato produtoAntigo = encontrarProdutoAntigo(produtoAtualizado);
        // Se encontrarmos o produto antigo, atualizamos a lista
        if (produtoAntigo != null) {
            if (produtoAtualizado instanceof ProdutoDisponivel) {
                listaProdutosDisponiveis.adicionarProduto(produtoAtualizado);
                listaProdutosNaoDisponiveis.removerProduto(produtoAntigo);
            } else if (produtoAtualizado instanceof ProdutoNaoDisponivel) {
                listaProdutosNaoDisponiveis.adicionarProduto(produtoAtualizado);
                listaProdutosDisponiveis.removerProduto(produtoAntigo);
            }
        }
    }
    
}
