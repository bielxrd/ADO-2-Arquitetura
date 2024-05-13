package com.example.adoarquitetura.Facade;

public class ItemPedido {
    private int quantidade;
    private Produto produto;

    public ItemPedido(Produto p, int quantidade){
    produto = p;
    this.quantidade = quantidade;
    }
    public int getQuantidade() {
        return quantidade;
    }

    public Produto getProduto() {
        return produto;
    }
}
