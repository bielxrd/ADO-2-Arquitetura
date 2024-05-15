package com.example.adoarquitetura.observer2.src;

import com.example.adoarquitetura.observer2.src.padrao.Assunto;
import com.example.adoarquitetura.observer2.src.padrao.NaveInimiga;
import com.example.adoarquitetura.observer2.src.padrao.NaveJogador;
import com.example.adoarquitetura.observer2.src.padrao.Observador;

public class Jogo {
    public static void main(String[] args) {
        Assunto jogador = NaveJogador.getInstance("MINHA__NAVE");
        Assunto jogodorTeste = NaveJogador.getInstance("TESTE");


        System.out.println("jogado1=" + jogador + " jogado2=" + jogodorTeste);

        Observador inimigo = new NaveInimiga("Inimigo1", jogador);
        Observador inimigo2 = new NaveInimiga("Inimigo2", jogador);

        jogador.movimentoAleatorio();

        jogador.destruir(inimigo);
        jogador.movimentoAleatorio();
        jogador.movimentoAleatorio();

    }
}