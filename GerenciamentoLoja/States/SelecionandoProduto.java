package States;

public class SelecionandoProduto implements EstadoCompra{
    @Override
    public void selecionarProduto() {
        System.out.println("Produto selecionado com sucesso!");
    }
    @Override
    public void adicionarAoCarrinho() {
        System.out.println("Produto/s adicionados ao carrinho!");        
    }
    @Override
    public void processarPagamento() {
        System.out.println("Você precisa antes adicionar ao carrinho!");        
    }
}
