package utils.ListaProduct;



public class ListaProdutosNaoDisponiveis extends ListaProdutosAbstrata {
    private static ListaProdutosNaoDisponiveis instance;

    @Override
    public synchronized ListaProdutosNaoDisponiveis getInstance() {
        if(instance == null){
            instance = new ListaProdutosNaoDisponiveis();
        }
        return instance;
    }
    
    
}
