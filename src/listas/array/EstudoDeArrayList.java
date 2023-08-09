package listas.array;

import java.util.ArrayList;

public class EstudoDeArrayList {

    public static void main(String[] args) {
       ArrayList<Integer> listaDeInteiros = new ArrayList<>();

        System.out.println(listaDeInteiros);

        listaDeInteiros.add(26);
        listaDeInteiros.add(52);
        listaDeInteiros.add(38);
        listaDeInteiros.add(98);
        listaDeInteiros.add(46);

        for (Integer numero : listaDeInteiros) {
            System.out.println(numero);
        }

        System.out.println(listaDeInteiros.size());

        listaDeInteiros.remove(3);

        for (Integer numero : listaDeInteiros) {
            System.out.println(numero);
        }
    }
}
