package heranca.estudo6FreeFlow;

import java.util.concurrent.TimeUnit;

public class Estudo6 {
    public static void main(String[] args) {
        Proprietario heber = new Proprietario("Heber dos Santos Soares de Araujo Lima", "124.826.817-23");
        System.out.println(heber);

        Veiculo carroDoHeber = new Veiculo("BYD", "Dolphin", "QYR9T26", 2, heber);
        System.out.println(carroDoHeber);

        Pedagio pedagioRioSp = new Pedagio("RIO - SP", 4.10);
        System.out.println(pedagioRioSp);

        heber.viaja(carroDoHeber);
        pedagioRioSp.realizaCobranca(carroDoHeber);

        try {
            TimeUnit.SECONDS.sleep(25);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        heber.viaja(carroDoHeber);
        pedagioRioSp.realizaCobranca(carroDoHeber);

        System.out.println("Lista de Cobranças do Proprietário " + heber + "\n" +
                heber.getCobrancas());

    }
}
