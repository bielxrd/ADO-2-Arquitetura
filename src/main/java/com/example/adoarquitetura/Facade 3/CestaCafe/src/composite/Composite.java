package composite;

import java.util.ArrayList;
import java.util.List;

/*
 *  Professor Gerson Risso
 */
public class Composite implements Component {

    private List<Component> lista;
    private String nome;
    
    public Composite(String nome) {
        lista = new ArrayList<>();
        this.nome = nome;
    }


    public void adicionar(Component component) {
        lista.add(component);
    }

    public void remover(Component component) {
        lista.remove(component);
    }

    @Override
    public double getPreco() {
        double total = 0;
        for (Component c : lista) {
            total += c.getPreco();
        }
        return total;
    }

    public void exibirCesta() {
        System.out.println("Cesta: "+nome);

        System.out.println("Produtos dentro da cesta: ");
        for (Component component : lista) {
           Leaf leaf = (Leaf) component;
            System.out.println(leaf.toString());
        }
    }

    @Override
    public String toString() {
        return "Composite{" + "lista=" + lista + ", nome=" + nome + '}';
    }

}
