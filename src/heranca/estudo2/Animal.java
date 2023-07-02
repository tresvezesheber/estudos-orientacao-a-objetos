package heranca.estudo2;

public abstract class Animal {

    protected String nome;

    protected String raca;

    public Animal() {

    }

    public Animal(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
    }

    public String camiha() {
        return "O " + this.nome + " está caminhando!";
    }
}