package com.example.adoarquitetura.observer;

public class Diretor implements Observer{
    @Override
    public void update(double nota) {
        System.out.println("Diretor atualizado");
    }
}
