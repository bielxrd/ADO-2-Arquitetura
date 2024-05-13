package com.example.adoarquitetura.Facade;

public class Fachada {
    public static void call(){
        Produto p = new Produto(12321,123.2,"sex");
        Estoque e = new Estoque();
        Produto produto1 = new Produto(1, 49.99, "eletrônicos");
        Produto produto2 = new Produto(2, 79.99, "vestuário");
        Produto produto3 = new Produto(3, 29.99, "alimentos");
        Produto produto4 = new Produto(4, 149.99, "eletrônicos");
        Produto produto5 = new Produto(5, 9.99, "higiene");
        Produto produto6 = new Produto(6, 199.99, "eletrodomésticos");
        Produto produto7 = new Produto(7, 14.99, "higiene");
        Produto produto8 = new Produto(8, 59.99, "vestuário");
        Produto produto9 = new Produto(9, 39.99, "alimentos");
        Produto produto10 = new Produto(10, 119.99, "eletrônicos");
        e.adicionarProduto(produto7,10);
        e.adicionarProduto(produto3,2);
        e.adicionarProduto(produto1,10);
        e.adicionarProduto(produto2,10);
        e.adicionarProduto(produto9,2);
        e.adicionarProduto(produto4,10);
        e.adicionarProduto(produto5,10);
        e.adicionarProduto(produto6,2);
        e.adicionarProduto(produto8,10);
        e.adicionarProduto(produto10,10);
        ItemPedido ip = new ItemPedido(produto7,4);
        ItemPedido ip2 = new ItemPedido(produto1,4);
        ItemPedido ip3 = new ItemPedido(produto3,4);


        Pedido ped = new Pedido();
        ped.adicionarItem(ip,e);
        ped.adicionarItem(ip2,e);
        ped.adicionarItem(ip3,e);
        System.out.println("Total R$:"+ped.calcularTotal());
    }






}
