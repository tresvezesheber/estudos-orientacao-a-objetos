package heranca.estudo4;

public class Coordenador extends Colaborador {

    public Coordenador(String nome, String matricula) {
        super(nome, matricula);
    }

    @Override
    public String solicitaVoucher() {
        if (this.getQuantidadeDeVouchers() < 2) {
            return super.solicitaVoucher();
        }
        return "Você só pode ter 2 (dois) vouchers!";
    }
}
