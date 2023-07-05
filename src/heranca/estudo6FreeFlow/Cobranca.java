package heranca.estudo6FreeFlow;

import java.time.OffsetDateTime;

public class Cobranca {

    private OffsetDateTime dataDaCobranca;

    private double valor;


    public Cobranca(OffsetDateTime dataDaCobranca, double valor) {
        this.dataDaCobranca = dataDaCobranca;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Cobranca - " +
                "Data da Cobranca: " + dataDaCobranca +
                ", Valor: R$ " + valor;
    }
}