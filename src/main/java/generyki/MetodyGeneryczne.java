package generyki;

import java.util.List;

public class MetodyGeneryczne {


    public static void main(String[] args) {
        Integer[] tablica = new Integer[10];
        tablica[1] = 213;
        tablica[0] = 23;
        tablica[2] = 12;
        tablica[3] = 432;
        tablica[4] = 245;
        tablica[5] = 532;
        metoda(tablica);
    }

    public static <T> void metoda(T[] tab) {
        for (T t : tab) {
            System.out.println(t);
        }
    }
}
