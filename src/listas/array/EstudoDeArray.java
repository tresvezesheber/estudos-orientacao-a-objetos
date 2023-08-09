package listas.array;

public class EstudoDeArray {

    public static void main(String[] args) {
        int[] listaDeInteiros = new int[4];

        System.out.println(listaDeInteiros);

        for (int numero : listaDeInteiros) {
            System.out.println(numero);
        }

        listaDeInteiros[0] = 24;
        listaDeInteiros[1] = 32;
        listaDeInteiros[2] = 42;
        listaDeInteiros[3] = 86;

        for (int numero : listaDeInteiros) {
            System.out.println(numero);
        }

        System.out.println(listaDeInteiros.length);
    }
}
