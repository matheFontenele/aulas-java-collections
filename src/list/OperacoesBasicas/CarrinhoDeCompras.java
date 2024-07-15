package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> carrinho;

    //Construtor
    public CarrinhoDeCompras() {
        this.carrinho = new ArrayList<>();
    }

    //Metodo para adicionar itens no carrinho
    public void adicionarItens(String nome, double preco, int quantidade){
        carrinho.add(new Item(nome, preco, quantidade));
    }

    //Metodo para remover itens do carrinho
    public void removerItem(String nome){
        List<Item> removerItens = new ArrayList<>();

        for (Item i : carrinho){
            if (i.getNome().equalsIgnoreCase(nome)){
                removerItens.add(i);
            }
        }
        carrinho.removeAll(removerItens);
    }

    //Metodos para calcular valor total do carrinho
    public double calcularValorTotal(){
        double total = 0;
        for (Item i : carrinho) {
            total = total + i.getPreco();
        }
        return total;
    }

    //Metodo para exibir itens do carrinho
    public void exibirItens(){
        System.out.println(carrinho);
    }

    //Metodo Main para testes
    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItens("Arroz", 10.80, 4);
        carrinho.adicionarItens("Feijão", 5.90, 4);
        carrinho.adicionarItens("Empanado", 4.90, 5);

        carrinho.removerItem("Empanado");

        System.out.println(carrinho.calcularValorTotal());
        carrinho.exibirItens();

    }
}
