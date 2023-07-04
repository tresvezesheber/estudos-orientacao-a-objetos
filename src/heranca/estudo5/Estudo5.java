package heranca.estudo5;

public class Estudo5 {

    public static void main(String[] args) {
        Banda aliceInChains = new Banda("Alice In Chains", "Grunge");
        System.out.println("Banda - " + aliceInChains.exibeDados());

        Musica heavenBesideYou = new Musica("Heaven Beside You", 5, aliceInChains);

        for (int i = 0; i < 10; i++) {
            heavenBesideYou.curte();
            for (int j = 0; j < 5; j++) {
                heavenBesideYou.reproduz();
            }
        }

        System.out.println("Música - " + heavenBesideYou.toString());

        Podcast hipsters = new Podcast("Hipsters Ponto Tech", "Tecnologia");
        System.out.println("Podcast - " + hipsters.exibeDados());

        Episodio episodio350 = new Episodio("TechGuide: Orientação a Objetos – Hipsters Ponto Tech #350", 42, hipsters);

        for (int i = 0; i < 12; i++) {
            episodio350.curte();
            for (int j = 0; j < 4; j++) {
                episodio350.reproduz();
            }
        }

        System.out.println("Episódio: " + episodio350.toString());
    }
}
