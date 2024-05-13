package com.example.adoarquitetura.Facade;

public class ItemEstoque {
    private Produto p;
    private int qtd;

    public ItemEstoque(Produto p,int qtd){
        this.p = p;
        this.qtd = qtd;
    }
    public Produto getP() {
        return p;
    }

    public void setP(Produto p) {
        this.p = p;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    @Override
    public String toString() {
        return "ItemEstoque{" +
                "p=" + p +
                ", qtd=" + qtd +
                '}';
    }
}
