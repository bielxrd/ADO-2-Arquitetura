package composite;

/*
 *  Professor Gerson Risso
 */
public class Leaf implements Component{
    private double preco;
    private String nome;

    public Leaf(double preco, String nome) {
        this.preco = preco;
        this.nome = nome;
    }
    
    @Override
    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Leaf{" + "preco=" + preco + ", nome=" + nome + '}';
    }

    
    
}
