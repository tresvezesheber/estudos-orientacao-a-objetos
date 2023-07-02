package heranca.estudo3;

public abstract class Ingresso {

    private double valor;

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void imrimeValor() {
        System.out.println("R$ " + this.valor);
    }
}