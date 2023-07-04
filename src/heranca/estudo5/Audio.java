package heranca.estudo5;

public abstract class Audio {

    private String titulo;

    private int duracao;

    private int totalDeReproducoes;

    private int curtidas;

    public Audio (String titulo, int duracao) {
        this.titulo = titulo;
        this.duracao = duracao;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int getDuracao() {
        return duracao;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void reproduz() {
        this.totalDeReproducoes++;
    }

    public void curte() {
        this.curtidas++;
    }

    public String exibeDados() {
        return "Nome: " + this.getTitulo() +
                ", Duração: " + this.getDuracao() +
                ", Total de Reproduções: " + this.getTotalDeReproducoes() +
                ", Total de Curtidas: " + this.getCurtidas();
    }
}
