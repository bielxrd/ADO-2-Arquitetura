package com.example.adoarquitetura.observer2.src.padrao;

public interface Assunto {
     void adicionar(Observador observador);
     void notificar();
     void setAcao(Acao acao);
     void destruir(Observador observador);
     void movimentoAleatorio();
}
