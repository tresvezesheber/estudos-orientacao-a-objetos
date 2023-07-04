package heranca.estudo5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TesteArrayList {

    public static void main(String[] args) {
        ArrayList<String> listaDeNomes = new ArrayList<>();
        listaDeNomes.add("Heber Lima");
        listaDeNomes.add("Astrofoboldo Junqueira");
        listaDeNomes.add("Geppeto Fiorentini");
        listaDeNomes.add("Zurk Daplate");
        listaDeNomes.add("Astridi Garpaccio");

        System.out.println("Lista de Strings:");
        System.out.println(listaDeNomes);

        Collections.sort(listaDeNomes);

        System.out.println(listaDeNomes);

        Banda aliceInChains = new Banda("Alice In Chains", "Grunge");
        Banda marsVolta = new Banda("The Mars Volta", "Rock Progressivo");
        Banda steveLacy = new Banda("Steve lacy", "R&B");
        Banda jmsn = new Banda("JMNSN", "Funk / Soul");

        ArrayList<Banda> listaDeBandas = new ArrayList<>();
        listaDeBandas.add(aliceInChains);
        listaDeBandas.add(marsVolta);
        listaDeBandas.add(steveLacy);
        listaDeBandas.add(jmsn);

        System.out.println("Lista de Bandas:  \n" + listaDeBandas.toString());
        Collections.sort(listaDeBandas);
        System.out.println("Lista Ordenada de Bandas (ASC):  \n" + listaDeBandas.toString());
        listaDeBandas.sort(Comparator.comparing(Banda::getNome).reversed());
        System.out.println("Lista Ordenada de Bandas (DESC):  \n" + listaDeBandas.toString());
    }
}
