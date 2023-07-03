package heranca.estudo4;

public class Estudo4 {

    public static void main(String[] args) {
        //Colaborador heber = new Colaborador("Heber dos Santos Soares de Araujo Lima", "94552");
        Colaborador heber = new Normal("Heber dos Santos Soares de Araujo Lima", "94552");
        System.out.println(heber.toString());
        System.out.println(heber.getClass());
        for (int i = 0; i < 2; i++) {
            System.out.println("Seu voucher é: " + heber.solicitaVoucher());
            System.out.println(heber.getQuantidadeDeVouchers());
        }

        Colaborador gepetto = new Coordenador("Gepetto Gianchinni", "6423");
        System.out.println(gepetto.toString());
        System.out.println(gepetto.getClass());
        for (int i = 0; i < 3; i++) {
            System.out.println("Seu voucher é: " + gepetto.solicitaVoucher());
            System.out.println(gepetto.getQuantidadeDeVouchers());
        }

        Colaborador astrofoboldo = new Gerente("Astrofoboldo Guilhermino", "87112");
        System.out.println(astrofoboldo.toString());
        System.out.println(astrofoboldo.getClass());
        for (int i = 0; i < 5; i++) {
            System.out.println("Seu voucher é: " + astrofoboldo.solicitaVoucher());
            System.out.println(astrofoboldo.getQuantidadeDeVouchers());
        }
    }
}
