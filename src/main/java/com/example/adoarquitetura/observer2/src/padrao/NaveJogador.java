package com.example.adoarquitetura.observer2.src.padrao;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NaveJogador implements Assunto  {

   private static NaveJogador naveJogador;

   private List<Observador> listaDeNavesInimigas;
   private Acao acao;
   private String naveNome;

    private NaveJogador(String naveNome) {
        this.naveNome = naveNome;
        this.listaDeNavesInimigas = new ArrayList<>();
    }

   public static  NaveJogador getInstance(String nomeDaNave){
        if (naveJogador == null){
            naveJogador = new NaveJogador(nomeDaNave);
        }
        return naveJogador;
    }

    @Override
    public void adicionar(Observador observador) {
        listaDeNavesInimigas.add(observador);
    }

    @Override
    public void notificar() {
        for (Observador observador : listaDeNavesInimigas) {
            observador.atualizar(acao);
        }
    }

    @Override
    public void setAcao(Acao acao) {
        this.acao = acao;
        notificar();
    }

    @Override
    public void destruir(Observador observador) {
        listaDeNavesInimigas.remove(observador);
        System.out.println("NAVE DESTRUÌDA => " + observador);
    }

    @Override
    public void movimentoAleatorio() {
        Random random = new Random();
        Acao[] acoes = Acao.values();
        Acao acaoAleatoria = acoes[random.nextInt(acoes.length)];
        setAcao(acaoAleatoria);
    }
}
