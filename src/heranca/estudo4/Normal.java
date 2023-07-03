package heranca.estudo4;

public class Normal extends Colaborador {

    public Normal(String nome, String matricula) {
        super(nome, matricula);
    }

    @Override
    public String solicitaVoucher() {
        if (this.getQuantidadeDeVouchers() < 1) {
            return super.solicitaVoucher();
        }
        return "Você só pode ter 1 (um) voucher!";
    }
}
