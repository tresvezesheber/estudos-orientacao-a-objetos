package heranca.estudo5;

public class Musica extends Audio implements Classificavel  {

    private Banda banda;

    public Musica(String titulo, int duracao, Banda banda) {
        super(titulo, duracao);
        this.banda = banda;
    }

    public void setBanda(Banda banda) {
        this.banda = banda;
    }

    @Override
    public int getClassificacao() {
        return this.getTotalDeReproducoes() / this.getCurtidas();
    }

    @Override
    public String toString() {
        return super.toString() + ", Classificação: " + this.getClassificacao();
    }



}