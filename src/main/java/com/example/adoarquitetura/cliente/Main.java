package com.example.adoarquitetura.cliente;

import com.example.adoarquitetura.Facade.*;
import com.example.adoarquitetura.observer.*;

public class Main {
    public static void main(String[]args){
        Fachada f = new Fachada();
        //f.call();
        Aluno Pedro = new Aluno("Pedro");
        Pedro.attach(new Professor());
        Pedro.attach(new Diretor());
        Pedro.setP1(9.2);
        Pedro.getMedia();
        Pedro.setP2(3.2);
        Pedro.calcMedia();
        Pedro.getMedia();

    }
}
