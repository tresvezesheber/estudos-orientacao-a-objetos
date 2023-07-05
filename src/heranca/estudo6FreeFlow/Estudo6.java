package heranca.estudo6FreeFlow;

import heranca.estudo2.Cachorro;

public class Estudo6 {
    public static void main(String[] args) {
        Proprietario heber = new Proprietario("Heber dos Santos Soares de Araujo Lima", "124.826.817-23");
        System.out.println(heber);

        Veiculo carroDoHeber = new Veiculo("BYD", "Dolphin", "QYR9T26", 2, heber);
        System.out.println(carroDoHeber);

      heber.viaja(carroDoHeber);
    }
}
