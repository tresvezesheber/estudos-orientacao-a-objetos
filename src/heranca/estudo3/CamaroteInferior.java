package heranca.estudo3;

public class CamaroteInferior extends VIP {

    private String localizacao;

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public void imprimeLocalizacao() {
        System.out.println(this.localizacao);
    }
}