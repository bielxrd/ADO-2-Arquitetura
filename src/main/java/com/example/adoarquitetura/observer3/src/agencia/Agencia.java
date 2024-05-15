package com.example.adoarquitetura.observer3.src.agencia;

import java.util.ArrayList;
import java.util.List;

public class Agencia implements AgenciaEmpregos {
    private String nome;

    private List<Assinante> assinantes;

    public Agencia(String nome) {
        this.nome = nome;
        this.assinantes = new ArrayList<>();
    }

    @Override
    public void registrarAssinante(Assinante assinante) {
        assinantes.add(assinante);
    }

    @Override
    public void removerAssinante(Assinante assinante) {
        assinantes.remove(assinante);
    }

    @Override
    public void notificarAssinantes(String vaga) {
        for (Assinante assinante : assinantes) {
            assinante.receberNotificacao(vaga);
        }
    }

    @Override
    public void novaVaga(String vaga) {
        System.out.println("Nova vaga de emprego disponível: " + vaga);
        notificarAssinantes(vaga);
    }
}
