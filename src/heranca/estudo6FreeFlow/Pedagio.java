package heranca.estudo6FreeFlow;

import java.time.OffsetDateTime;

public class Pedagio {

    private String sentido;

    private double tarifa;

    public Pedagio(String sentido, double tarifa) {
        this.sentido = sentido;
        this.tarifa = tarifa;
    }

    public void realizaCobranca(Veiculo veiculo) {
        Cobranca cobranca = new Cobranca(OffsetDateTime.now(), this.tarifa);
        System.out.println(cobranca);
        veiculo.getProprietario().setCobranca(cobranca);
    }

    @Override
    public String toString() {
        return "Pedagio - " +
                "Sentido: " + sentido +
                ", Tarifa: R$ " + tarifa;
    }
}
