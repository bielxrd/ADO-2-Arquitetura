package com.example.adoarquitetura.observer3.src.agencia;

public class AssinanteEmprego implements Assinante {
    private String nome;

    public AssinanteEmprego(String nome) {
        this.nome = nome;
    }

    @Override
    public void receberNotificacao(String vaga) {
        System.out.println("Olá: " + nome + " ,nova vaga de emprego disponível: " + vaga);
    }
}