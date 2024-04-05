package utils.Product;

public class ProdutoNaoDisponivel extends ProdutoAbstrato{
    public ProdutoNaoDisponivel(String name, double preco){
        super(name, preco, 0);
    }
}
