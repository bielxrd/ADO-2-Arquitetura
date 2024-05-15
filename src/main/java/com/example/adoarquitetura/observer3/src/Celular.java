package com.example.adoarquitetura.observer3.src;


import com.example.adoarquitetura.observer3.src.agencia.Agencia;
import com.example.adoarquitetura.observer3.src.agencia.AgenciaEmpregos;
import com.example.adoarquitetura.observer3.src.agencia.Assinante;
import com.example.adoarquitetura.observer3.src.agencia.AssinanteEmprego;

public class Celular {
    public static void main(String[] args) {

        AgenciaEmpregos agencia = new Agencia("SoftHelp");

        Assinante assinante1 = new AssinanteEmprego("Charopada");
        Assinante assinante2 = new AssinanteEmprego("Messi");
        Assinante assinante3 = new AssinanteEmprego("Loro");

        agencia.registrarAssinante(assinante1);
        agencia.registrarAssinante(assinante2);
        agencia.registrarAssinante(assinante3);

        agencia.novaVaga("Desenvolvedor Java");

        agencia.removerAssinante(assinante2);

        agencia.novaVaga("Desenvolvedor PHP");
    }
}