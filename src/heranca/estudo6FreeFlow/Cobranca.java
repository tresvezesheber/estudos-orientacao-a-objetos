package heranca.estudo6FreeFlow;

import java.time.OffsetDateTime;

public class Cobranca {

    private OffsetDateTime dataDaCobranca;

    private double valor;

    private Proprietario proprietario;

    public Cobranca(OffsetDateTime dataDaCobranca, double valor, Proprietario proprietario) {
        this.dataDaCobranca = dataDaCobranca;
        this.valor = valor;
        this.proprietario = proprietario;
    }
}