package composite;

import java.util.List;
import java.util.Scanner;

public class Facade {

    private Composite cestaCafeDaManha = new Composite("Cesta Cafe da Manha");
    private Composite happyHour = new Composite("Cesta Happy hour");
    private Composite aniversario = new Composite("Cesta aniversario");

    public Scanner ler = new Scanner(System.in);

    public void cestaCafe() {
        System.out.println("Informe o preco do produto");
        double preco = ler.nextDouble();
        System.out.println("Informe o nome do produto");
        ler.nextLine();
        String nome = ler.nextLine();
        cestaCafeDaManha.adicionar(new Leaf(preco, nome));

        cestaCafeDaManha.exibirCesta();
    }

    public void happyHour() {
        System.out.println("Informe o preco do produto");
        double preco = ler.nextDouble();
        System.out.println("Informe o nome do produto");
        ler.nextLine();
        String nome = ler.nextLine();
        happyHour.adicionar(new Leaf(preco, nome));

        happyHour.exibirCesta();
    }

    public void aniversario() {
        System.out.println("Informe o preco do produto");
        double preco = ler.nextDouble();
        System.out.println("Informe o nome do produto");
        ler.nextLine();
        String nome = ler.nextLine();
        aniversario.adicionar(new Leaf(preco, nome));

        aniversario.exibirCesta();
    }
}
