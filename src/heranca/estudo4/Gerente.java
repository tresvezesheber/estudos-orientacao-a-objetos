package heranca.estudo4;

public class Gerente extends Colaborador {

    public Gerente(String nome, String matricula) {
        super(nome, matricula);
    }

    @Override
    public String solicitaVoucher() {
        if (this.getQuantidadeDeVouchers() < 4) {
            return super.solicitaVoucher();
        }
        return "Você só pode ter 4 (quatro) vouchers!";
    }
}
