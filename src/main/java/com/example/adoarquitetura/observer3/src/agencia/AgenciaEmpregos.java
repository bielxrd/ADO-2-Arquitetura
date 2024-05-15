package com.example.adoarquitetura.observer3.src.agencia;

public interface AgenciaEmpregos {
    void registrarAssinante(Assinante assinante);
    void removerAssinante(Assinante assinante);
    void notificarAssinantes(String vaga);
    void novaVaga(String vaga);
}
