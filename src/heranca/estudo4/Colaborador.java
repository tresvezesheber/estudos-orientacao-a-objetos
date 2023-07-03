package heranca.estudo4;

public abstract class Colaborador {

    private String nome;

    private String matricula;

    private StatusDoColaborador status;

    private int quantidadeDeVouchers;


    public Colaborador(String nome, String matricula) {
        this.status = StatusDoColaborador.ADMITIDO;
        this.nome = nome;
        this.matricula = matricula;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setStatus(StatusDoColaborador status) {
        this.status = status;
    }

    public String solicitaVoucher() {
        this.quantidadeDeVouchers++;
        String caracteresAlfaNumericos = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvxyz0123456789";
        int tamanhoDoVoucher = 8;
        StringBuilder voucherGerado = new StringBuilder(tamanhoDoVoucher);

        for (int i = 0; i < tamanhoDoVoucher; i++) {
            int ch = (int) (caracteresAlfaNumericos.length() * Math.random());
            voucherGerado.append(caracteresAlfaNumericos.charAt(ch));
        }
        return voucherGerado.toString().toUpperCase();
    }

    public int getQuantidadeDeVouchers() {
        return quantidadeDeVouchers;
    }

    @Override
    public String toString() {
        return "Colaborador{" +
                "nome='" + nome + '\'' +
                ", matricula='" + matricula + '\'' +
                ", status=" + status +
                '}';
    }
}