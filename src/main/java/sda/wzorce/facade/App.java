package sda.wzorce.facade;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class App {
    public static void main(String[] args) {
        String[] tab = {"Alicja", "Zosia", "Ewka", "Zenona", "Grażyna", "Katarzyna", "Kunegunda"};
//        List<String> listaNaPodstawieTablicy = Arrays.asList(tab);
//
//        listaNaPodstawieTablicy.set(1, "Zofia!!!");
//        System.out.println(listaNaPodstawieTablicy);
//        System.out.println(Arrays.toString(tab));

        List<String> listaNaPodstawieTablicy = new ArrayList<>(Arrays.asList(tab));
        zmodyfikujListe(listaNaPodstawieTablicy);
        System.out.println(listaNaPodstawieTablicy);
    }

    // uzycie iteratora
    static void zmodyfikujListe(List<String> lista) {
        Iterator<String> iterator = lista.iterator();
        while (iterator.hasNext()) {
            String imie = iterator.next();
            System.out.println(imie);
            if (imie.startsWith("Z")) {
                System.out.println("Usuwamy imie " + imie);
                iterator.remove();
            }
        }
    }
}
