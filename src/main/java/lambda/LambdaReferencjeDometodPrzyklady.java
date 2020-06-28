package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class LambdaReferencjeDometodPrzyklady {

    public static void main(String[] args) {
        // 1) Klasa::metodaStatyczna
        // 2) obiekt::metodaInstacji

        // 3) Klasa::metodaInstancji

        // 4) Referencje do konstruktora

        List<String> surNames = new ArrayList<>();
        surNames.add("Kowalski");
        surNames.add("Kot");
        surNames.add("Pies");

        // 1) Klasa::metodaStatyczna
        // Wszystkie parametry są przekazywane metodzie statycznej
        surNames.forEach(surname -> System.out.println(surname));
        surNames.forEach(System.out::println);

        Map<String, String> mapa = null;
        mapa.forEach((key, value) -> metodka(key, value));
        mapa.forEach(LambdaReferencjeDometodPrzyklady::metodka);

        for (String surname : surNames) {
            metodka(surname);
        }
        surNames.forEach(surname -> metodka(surname));
        surNames.forEach(LambdaReferencjeDometodPrzyklady::metodka);

        surNames.stream().filter(str -> Objects.isNull(str));
        surNames.stream().filter(Objects::isNull);



        List<String> nazwyProduktow = new ArrayList<>();
        nazwyProduktow.add("Mleko");
        nazwyProduktow.add("Maslo");
        nazwyProduktow.add("Chleb");





        // 2) obiekt::metodaInstacji
        // Wszystkie parametry są przekazywane metodyInstancji
        Product p = new Product("Kawa");
        nazwyProduktow.forEach(nazwaProduktu -> p.czyJestemProduktem(nazwaProduktu));
        nazwyProduktow.forEach(p::czyJestemProduktem);




        // Pierwszy parametr staje się odbiorcą metody i wszystkie inne parametry są przekazywane do metody.
        // 3) Klasa::metodaInstancji
        List<String> produktyDuzymiLiterami = nazwyProduktow.stream().map(nazwaProduktu -> nazwaProduktu.toUpperCase()).collect(Collectors.toList());
        List<String> produktyDuzymiLiterami2 = nazwyProduktow.stream().map(String::toUpperCase).collect(Collectors.toList());

        String max1 = nazwyProduktow.stream().max((np1, np2) -> np1.compareTo(np2)).orElse("");
        String max2 = nazwyProduktow.stream().max(String::compareTo).orElse("");


        // 4) Referencje do konstruktora
        List<Product> collect = nazwyProduktow.stream().map(nazwaProduktu -> new Product(nazwaProduktu)).collect(Collectors.toList());
        List<Product> collect1 = nazwyProduktow.stream().map(Product::new).collect(Collectors.toList());

    }

    private static int metodka(String s) {
        System.out.println(s + " " + s);
        return 0;
    }

    private static int metodka(String s, String s2) {
        System.out.println(s + " " + s);
        return 0;
    }

    // 2) obiekt::metodaInstacji
    public void metodaInstacji(String s) {
        List<String> produkty = new ArrayList<>();
        produkty.add("Mleko");
        produkty.add("Maslo");
        produkty.add("Chleb");


        produkty.forEach(nazwaProduktu -> this.superMetoda(nazwaProduktu));
        produkty.forEach(this::superMetoda);
    }

    public void superMetoda(String s) {
        System.out.println(s);
    }

}
