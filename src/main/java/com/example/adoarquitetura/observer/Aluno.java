package com.example.adoarquitetura.observer;

import java.util.ArrayList;
import java.util.List;

public class Aluno implements Sujeito {
    private String nome;
    private double p1;
    private double p2;
    private double media;

    private List<Observer> observerList;
    public Aluno(String nome){
        this.nome = nome;
        observerList = new ArrayList<>();
    }

    @Override
    public void attach(Observer o) {
    observerList.add(o);
    }

    @Override
    public void detach(Observer o) {
        observerList.remove(o);

    }

    @Override
    public void notifyObservers(double nota) {
        for (Observer o : observerList) {
            o.update(nota);
        }
    }



    public void setP1(double p1) {
        if(p1>0&&p1<=10) {
            this.p1 = p1;
            notifyObservers(p1);
        }
        else
         System.out.println("Nota inválida");
    }



    public void setP2(double p2) {
        if(p2>0&&p2<=10) {
            this.p2 = p2;
            notifyObservers(p2);
        }
        else
            System.out.println("Nota inválida");
    }

    public void getMedia() {
        if(media!=0)
            System.out.println(media);

    }

    public void calcMedia() {
       if(this.p1>0.1 && this.p2>0.1){
           media = ((p1+p2) / 2);
       }
       else{
           System.out.println("Faltam atribuir notas ao aluno");
       }
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", p1=" + p1 +
                ", p2=" + p2 +
                ", media=" + media +
                ", observerList=" + observerList +
                '}';
    }
}
