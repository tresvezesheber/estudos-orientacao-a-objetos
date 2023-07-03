package heranca.estudo5;

public class Podcast {

    private String nome;

    private String genero;


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
