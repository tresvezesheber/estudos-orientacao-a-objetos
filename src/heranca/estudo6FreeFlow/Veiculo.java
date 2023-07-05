package heranca.estudo6FreeFlow;

public class Veiculo {

    private String marca;

    private String modelo;

    private String placa;

    private int numeroDeEixos;

    private Proprietario proprietario;

    public Veiculo(String marca, String modelo, String placa, int numeroDeEixos, Proprietario proprietario) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.numeroDeEixos = numeroDeEixos;
        this.proprietario = proprietario;
    }

    public String getPlaca() {
        return placa;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    @Override
    public String toString() {
        return "Veículo do " + proprietario + "\n" +
                "-------------------------------------------------------------------\n" +
                "Marca: " + marca + "\n" +
                "Modelo: " + modelo + "\n" +
                "Placa: " + placa + "\n" +
                "Número de Eixos: " + numeroDeEixos;
    }
}
