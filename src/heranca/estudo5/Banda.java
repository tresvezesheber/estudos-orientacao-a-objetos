package heranca.estudo5;

public class Banda implements Comparable<Banda> {

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

    @Override
    public String toString() {
        return "Nome: " + this.nome +
                ", Gênero: " + this.genero;
    }

    @Override
    public int compareTo(Banda outraBanda) {
        return this.nome.compareTo(outraBanda.nome);
    }
}
