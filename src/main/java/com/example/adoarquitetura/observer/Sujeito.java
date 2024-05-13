package com.example.adoarquitetura.observer;

public interface Sujeito{
        public void attach(Observer o);
        public void detach(Observer o);
        public void notifyObservers(double nota);
}
