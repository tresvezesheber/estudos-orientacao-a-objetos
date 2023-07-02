package heranca.estudo1;

public class Estudo1 {
    public static void main(String[] args) {

        AssistenteTecnico astrofoboldo = new AssistenteTecnico();
        astrofoboldo.setNome("Astrofobolodo Guilhermino");
        astrofoboldo.setSalario(2100);
        astrofoboldo.setMatricula("82334");

        AssistenteAdministrativo eustaquio = new AssistenteAdministrativo();
        eustaquio.setNome("Eustáquio Bianchino");
        eustaquio.setSalario(4100);
        eustaquio.setMatricula("10224");
        eustaquio.setTurno("noite");

        System.out.println(astrofoboldo.exibeDados());
        System.out.println(eustaquio.exibeDados());
    }
}
