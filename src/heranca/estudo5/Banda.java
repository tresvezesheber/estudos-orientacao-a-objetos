package heranca.estudo5;

public class Banda {

    private String nome;

    private String genero;

    public Banda (String nome, String genero) {
        this.nome = nome;
        this.genero = genero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String exibeDados() {
        return "Nome: " + this.nome +
                ", Gênero: " + this.genero;
    }
}
