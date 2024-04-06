package utils.ListaProduct;



public class ListaProdutosNaoDisponiveis extends ListaProdutosAbstrata {
    private static ListaProdutosNaoDisponiveis instance;

    public synchronized static ListaProdutosNaoDisponiveis getInstance() {
        if(instance == null){
            instance = new ListaProdutosNaoDisponiveis();
        }
        return instance;
    }
    
    
}
