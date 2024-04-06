package utils.Product;

public class ProdutoController implements ProdutoControllerInterface{
    private static ProdutoController instance;

    public synchronized ProdutoController getInstance(){
        if(instance == null){
            instance = new ProdutoController();
        }
        return instance;
    }
    @Override
    public ProdutoAbstrato atualizaProduto(ProdutoAbstrato produto,double quantidade) {
        double quantidadeAtual = produto.getQuantidade();
        ProdutoAbstrato novoProduto = null;
        if(quantidadeAtual + quantidade > 0){
            if(produto instanceof ProdutoNaoDisponivel){
                novoProduto = new ProdutoDisponivel(produto.getName(), produto.getPreco(), quantidadeAtual+quantidade);
            }
            else{
                produto.setQuantidade(quantidadeAtual + quantidade);
            }
        }else if( quantidadeAtual + quantidade <0){
            System.out.println("Quantidade de produtos indisponível");
        }else{
            novoProduto=new ProdutoNaoDisponivel(produto.getName(), produto.getPreco());
            
        }

        return novoProduto;
    }
}
