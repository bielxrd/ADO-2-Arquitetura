package cliente;

import composite.*;

import java.util.Scanner;


/*
 *  Professor Gerson Risso
 */
public class UsaCesta {
    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        Facade facade = new Facade();

        int opcao = 0;

        do {
            opcao = menu();
            if (opcao == 1) {
                facade.cestaCafe();
            } else if (opcao == 2) {
                facade.happyHour();
            } else if (opcao == 3) {
                facade.aniversario();
            }

        } while (opcao != 0);

    }

    public static int menu() {
        System.out.println("1. Cesta Cafe da manha");
        System.out.println("2. Cesta Happy Hour");
        System.out.println("3. cesta Aniversario");
        System.out.println("0. Sair");

        return ler.nextInt();
    }

}

