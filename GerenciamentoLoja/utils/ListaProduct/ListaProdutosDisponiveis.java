package utils.ListaProduct;

import java.util.List;

import utils.Product.ProdutoAbstrato;

public class ListaProdutosDisponiveis extends ListaProdutosAbstrata implements ListaProdutosInterface  {
    private static ListaProdutosDisponiveis instance;

    @Override
    public ListaProdutosDisponiveis getInstance() {
        if(instance == null){
            instance = new ListaProdutosDisponiveis();
        }
        return instance;
    }
    

    
    
}
