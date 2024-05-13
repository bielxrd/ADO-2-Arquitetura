package com.example.adoarquitetura.Facade;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private List<ItemEstoque> lista;

    public Estoque(){
        lista = new ArrayList<>();
    }
    public void adicionarProduto(Produto p,int quantidade){
        lista.add(new ItemEstoque(p,quantidade));
    }
    public boolean removerProduto(Produto p,int qtd){
        int quant = 0;
        for(ItemEstoque iE : lista){
            if(iE.getP().equals(p)) {
                quant = iE.getQtd();
                if (quant > 0 && quant >= qtd) {
                    iE.setQtd(quant-qtd);
                    lista.set(lista.indexOf(iE),iE);
                    return true;
                }

            }

        }
        return false;

    }

    @Override
    public String toString() {
        return "Estoque{" +
                "lista=" + lista +
                '}';
    }
}
