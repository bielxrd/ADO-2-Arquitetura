package com.example.adoarquitetura.Facade;

import com.example.adoarquitetura.Facade.ItemPedido;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private double valorTotal;
    private List<ItemPedido> lista;

    public Pedido(){
        lista = new ArrayList<ItemPedido>();
    }
    public void adicionarItem(ItemPedido item,Estoque estoque){
        if(estoque.removerProduto(item.getProduto(), item.getQuantidade())) {
            lista.add(item);
            System.out.println("Item adicionado!");
        } else {
            System.out.println("Quantidade insuficiente em estoque");
        }
    }
    public double calcularTotal(){
        valorTotal = 0;
        for(ItemPedido i : lista){
            valorTotal+= i.getProduto().getPreco();
        }
        return valorTotal;
    }
    public void cupomFiscal(){

    }
}
