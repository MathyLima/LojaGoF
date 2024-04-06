package utils.ListaProduct;


public class ListaProdutosDisponiveis extends ListaProdutosAbstrata  {
    private static ListaProdutosDisponiveis instance;

    public synchronized static ListaProdutosDisponiveis getInstance() {
        if(instance == null){
            instance = new ListaProdutosDisponiveis();
        }
        return instance;
    }
    

    
    
}
