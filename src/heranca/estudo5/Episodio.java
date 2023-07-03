package heranca.estudo5;

public class Episodio extends Audio implements Classificavel {

    private Podcast podcast;

    @Override
    public int getClassificacao() {
        return this.getTotalDeReproducoes() / this.getCurtidas();
    }

    @Override
    public String exibeDados() {
        return super.exibeDados() + ", Classificação: " + this.getClassificacao();
    }
}
