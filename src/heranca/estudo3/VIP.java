package heranca.estudo3;

public class VIP extends Ingresso {

    @Override
    public void setValor(double valor) {
        super.setValor(valor + 50);
    }
}