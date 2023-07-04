package heranca.estudo5;

public class Episodio extends Audio implements Classificavel {

    private Podcast podcast;

    public Episodio (String titulo, int duracao, Podcast podcast) {
        super(titulo, duracao);
        this.podcast = podcast;
    }

    @Override
    public int getClassificacao() {
        return this.getTotalDeReproducoes() / this.getCurtidas();
    }

    @Override
    public String exibeDados() {
        return super.exibeDados() + ", Classificação: " + this.getClassificacao();
    }
}
