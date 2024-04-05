package utils.ListaProduct;

import java.util.List;

import utils.Product.ProdutoAbstrato;

public class ListaProdutosNaoDisponiveis extends ListaProdutosAbstrata implements ListaProdutosInterface {
    private static ListaProdutosNaoDisponiveis instance;

    @Override
    public ListaProdutosNaoDisponiveis getInstance() {
        if(instance == null){
            instance = new ListaProdutosNaoDisponiveis();
        }
        return instance;
    }
    
    
}
