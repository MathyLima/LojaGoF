package utils.ListaProduct;


public class ListaProdutosDisponiveis extends ListaProdutosAbstrata  {
    private static ListaProdutosDisponiveis instance;

    @Override
    public  synchronized ListaProdutosDisponiveis getInstance() {
        if(instance == null){
            instance = new ListaProdutosDisponiveis();
        }
        return instance;
    }
    

    
    
}
