package heranca.estudo2;

public class Gato extends Animal {

    public Gato(String nome, String raca) {
        super(nome, raca);
    }

    public String mia() {
        return "O " + this.nome + " está miando!";
    }
}