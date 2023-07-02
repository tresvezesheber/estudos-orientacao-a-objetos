package heranca.estudo3;

public class CamaroteSuperior extends VIP {

    @Override
    public void setValor(double valor) {
        super.setValor(valor + 100);
    }
}