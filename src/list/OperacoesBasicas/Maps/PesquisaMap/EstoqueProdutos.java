package list.OperacoesBasicas.Maps.PesquisaMap;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueProdutos;

    //construtor
    public EstoqueProdutos() {
        this.estoqueProdutos = new HashMap<>();
    }

    //Metodo para adicionar produto
    public void adicionarProduto(Long cod, String nome, int quantidade, double preco){
        estoqueProdutos.put(cod, new Produto(nome, quantidade, preco));
    }

    //Metodo para exibir produtos
    public void exibirProdutos(){
        System.out.println(estoqueProdutos);
    }

    //Metodo para calcular calor do estoque
    public double calcularValorEstoque(){
        double total = 0d;
        if(!estoqueProdutos.isEmpty()){
            for (Produto p : estoqueProdutos.values()){
                total += p.getQuantidade() * p.getPreco();
            }
        }
        return total;
    }

    //Metodo para obter produto mais caro
    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueProdutos.isEmpty()){
            for (Produto p : estoqueProdutos.values()){
                if(p.getPreco() > maiorPreco){
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro;
    }

    //Metodo Main para testes
    public static void main(String[] args) {
       EstoqueProdutos estoque = new EstoqueProdutos();

       estoque.adicionarProduto(1L, "Produto A", 10, 5.0);
       estoque.adicionarProduto(2L, "Produto B", 5, 10.0);
       estoque.adicionarProduto(3L, "Produto C", 2, 15.0);

       estoque.exibirProdutos();

       System.out.println("valor total do estoque: "+ estoque.calcularValorEstoque());

        System.out.println("O produto mais caro é o "+ estoque.obterProdutoMaisCaro().getNome());
    }
}
