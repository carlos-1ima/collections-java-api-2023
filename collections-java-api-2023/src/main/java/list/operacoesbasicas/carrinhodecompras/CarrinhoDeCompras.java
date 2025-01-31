package main.java.list.operacoesbasicas.carrinhodecompras;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class CarrinhoDeCompras {
    private List<Item> carrinho;

    public CarrinhoDeCompras() {
        this.carrinho = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        this.carrinho.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itemRemover = new ArrayList<>();
        for(Item i : this.carrinho) {
            if(i.getNome().equalsIgnoreCase(nome)) {
                itemRemover.add(i);
            }
        }
        this.carrinho.removeAll(itemRemover);
    }

    public double calcularValorTotal() {
        double valorTotal = 0;
        for(Item i : this.carrinho) {
            double valorItem = i.getPreco() * i.getQuantidade();
            valorTotal += valorItem;
        }
        return valorTotal;
    }

    public void exibitItens() {
        System.out.println("CARRINHO DE COMPRAS{ \n" + this.carrinho);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras c = new CarrinhoDeCompras();
        System.out.println(Locale.getDefault());


        c.adicionarItem("Pão", 8.00, 2);
        c.adicionarItem("Queijo", 5.00, 4);
        c.adicionarItem("Presunto", 6.00, 3);

        c.exibitItens();

        c.removerItem("queijo");

        c.exibitItens();

        System.out.println("VALOR TOTAL: R$ " + c.calcularValorTotal());
    }

}
