package heranca.estudo5;

public class Estudo5 {

    public static void main(String[] args) {
        Banda aliceInChains = new Banda();
        aliceInChains.setNome("Alice In Chains");
        aliceInChains.setGenero("Grunge");

        System.out.println("Banda - " + aliceInChains.exibeDados());

        Musica heavenBesideYou = new Musica();
        heavenBesideYou.setTitulo("Heaven Beside You");
        heavenBesideYou.setBanda(aliceInChains);
        heavenBesideYou.setDuracao(5);
        for (int i = 0; i < 10; i++) {
            heavenBesideYou.curte();
            for (int j = 0; j < 5; j++) {
                heavenBesideYou.reproduz();
            }
        }

        System.out.println("Música - " + heavenBesideYou.exibeDados());

        Podcast hipsters = new Podcast();
        hipsters.setNome("Hipsters Ponto Tech");
        hipsters.setGenero("Tecnologia");

        System.out.println("Podcast - " + hipsters.exibeDados());

        Episodio episodio350 = new Episodio();
        episodio350.setTitulo("TechGuide: Orientação a Objetos – Hipsters Ponto Tech #350");
        episodio350.setDuracao(42);

        for (int i = 0; i < 12; i++) {
            episodio350.curte();
            for (int j = 0; j < 4; j++) {
                episodio350.reproduz();
            }
        }

        System.out.println("Episódio: " + episodio350.exibeDados());
    }
}
