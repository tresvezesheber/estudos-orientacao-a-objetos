package heranca.estudo2;

public class Estudo2 {

    public static void main(String[] args) {
        Cachorro tobi = new Cachorro("Tobi", "Vira-lata");

        System.out.println(tobi.camiha());
        System.out.println(tobi.late());

        Gato spoleto = new Gato("Spoleto", "Rajado");

        System.out.println(spoleto.camiha());
        System.out.println(spoleto.mia());
    }
}