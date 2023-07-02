package heranca.estudo1;

public class AssistenteTecnico extends Assistente {

    @Override
    public double ganhoAnual() {
        double bonificacaoAnual = super.ganhoAnual() * 0.1;
        return super.ganhoAnual() + bonificacaoAnual;
    }
}
