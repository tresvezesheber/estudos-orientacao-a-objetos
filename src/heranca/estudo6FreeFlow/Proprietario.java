package heranca.estudo6FreeFlow;

import java.util.ArrayList;
import java.util.List;

public class Proprietario {

    private String nome;

    private String cpf;

    public List<Cobranca> cobrancas = new ArrayList<>();

    public Proprietario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setCobranca(Cobranca cobranca) {
        this.cobrancas.add(cobranca);
    }

    public List<Cobranca> getCobrancas() {
        return cobrancas;
    }

    public void viaja(Veiculo veiculo) {
        System.out.println("Iniciando viagem com o veículo de placa " + veiculo.getPlaca() + "...");
        System.out.println(nome + " finalizou sua viagem.");
    }

    @Override
    public String toString() {
        return nome + " (" + cpf + ")";
    }
}
