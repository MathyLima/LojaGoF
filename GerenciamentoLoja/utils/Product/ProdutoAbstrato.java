package utils.Product;

public abstract class ProdutoAbstrato implements ProdutoInterface {
    private String name;
    private double preco;
    private double quantidade;
    

    public ProdutoAbstrato(String name, double preco, double quantidade){
        this.name = name;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public String getName() {
        return name;
    }
    @Override
    public double getPreco() {
        return preco;
    }
    @Override
    public double getQuantidade() {
        return quantidade;
    }
    @Override
    public void setPreco(double preco) {
        this.preco = preco;
    }
    @Override
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;        
    }
    
}
