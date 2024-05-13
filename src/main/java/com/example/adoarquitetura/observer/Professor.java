package com.example.adoarquitetura.observer;

public class Professor implements Observer{
    @Override
    public void update(double nota) {
        System.out.println("Professor atualizado");
    }
}
