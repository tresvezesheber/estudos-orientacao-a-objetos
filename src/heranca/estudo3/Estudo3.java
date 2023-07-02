package heranca.estudo3;

public class Estudo3 {

    public static void main(String[] args) {
        Normal ingressoNormal = new Normal();
        ingressoNormal.setValor(60);
        ingressoNormal.exibeTipo();
        ingressoNormal.imrimeValor();

        VIP ingressoVip = new VIP();
        ingressoVip.setValor(100);
        ingressoVip.imrimeValor();

        CamaroteInferior ingressoCamaroteInferior = new CamaroteInferior();
        ingressoCamaroteInferior.setValor(110);
        ingressoCamaroteInferior.setLocalizacao("Área 4");
        ingressoCamaroteInferior.imprimeLocalizacao();
        ingressoCamaroteInferior.imrimeValor();

        CamaroteSuperior ingressoCamaroteSuperior = new CamaroteSuperior();
        ingressoCamaroteSuperior.setValor(110);
        ingressoCamaroteSuperior.imrimeValor();
    }
}