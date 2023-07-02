package heranca.estudo1;

public class AssistenteAdministrativo extends Assistente {

    private String turno;

    public void setTurno(String turno) {
        this.turno = turno;
    }

    @Override
    public double ganhoAnual() {
        if (this.turno.equals("noite")) {
            // Levando em consideração 252 dias úteis por ano
            return super.ganhoAnual() + (252 * 50);
        }
        return super.ganhoAnual();
    }

    @Override
    public String exibeDados() {
        return super.exibeDados() +
                ", Turno: " + this.turno;
    }
}