package heranca.estudo2;

public class Cachorro extends Animal {

    public Cachorro(String nome, String raca) {
        super(nome, raca);
    }

    public String late() {
        return "O " + super.nome + " está latindo!";
    }
}