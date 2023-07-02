package heranca.estudo1;

public abstract class Assistente extends Funcionario {

    private String matricula;

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return this.matricula;
    }

    @Override
    public String exibeDados() {
        return super.exibeDados() +
                ", Matrícula: " + this.matricula +
                ", Ganho Anual: " + ganhoAnual();
    }
}
