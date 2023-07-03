package heranca.estudo5;

public class Musica extends Audio implements Classificavel  {

    private Banda banda;


    public void setBanda(Banda banda) {
        this.banda = banda;
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