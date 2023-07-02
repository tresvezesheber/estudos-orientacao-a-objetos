package heranca.estudo1;

public abstract class Funcionario {

    private String nome;

    private double salario;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void addAumento(double valor) {
        this.salario += valor;
    }

    public double ganhoAnual() {
        return this.salario * 12;
    }

    public String exibeDados() {
        return "Nome: " + this.nome + ", " +
                "Salário: " + this.salario;
    }
}
