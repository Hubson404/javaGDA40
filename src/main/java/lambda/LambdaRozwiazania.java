package lambda;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LambdaRozwiazania {





    public static void main(String[] args) {

        List<String> surNames = new ArrayList<>();
        surNames.add("Kowalski");
        surNames.add("Kot");
        surNames.add("Pies");
        surNames.add("Lumb");
        surNames.add("Piotrowska");
        surNames.add("Malinowski");


        //zadanie 1
        List<String> krotkieNazwiska = surNames.stream()
                .filter(nazwisko -> nazwisko.length() <= 4)
                .map(s -> s.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(krotkieNazwiska);

        //zadanie 2
        List<String> nazwiskaNaB = surNames.stream()
                .filter(nazwisko -> nazwisko.startsWith("B"))
                .collect(Collectors.toList());
        System.out.println(nazwiskaNaB);

        //zadanie 3
        Set<String> trzyLiteryZNazwisk = surNames.stream()
                .map(nazwisko -> nazwisko.substring(0, 3).toLowerCase())
                .collect(Collectors.toSet());
        System.out.println(trzyLiteryZNazwisk);

        //zadanie 4: 10 najdłuższych nazwisk, posortowanych malejąco według długości
        List<String> dlugieNazwiska = surNames.stream()
                .sorted((nazwisko1, nazwisko2) -> nazwisko2.length() - nazwisko1.length())
                .limit(10)
                .collect(Collectors.toList());
        System.out.println(dlugieNazwiska);

        //zadanie 5: 20 najkrótszych nazwisk, posortowanych według ostatniej litery
        List<String> krotkieNazwiskaPosortowaneInaczej = surNames.stream()
                .sorted((nazwisko1, nazwisko2) -> nazwisko1.length() - nazwisko2.length())
                .limit(20)
                .sorted((nazwisko1, nazwisko2) -> {
                    String ostatniaLitera1 = nazwisko1.substring(nazwisko1.length() - 1);
                    String ostatniaLitera2 = nazwisko2.substring(nazwisko2.length() - 1);
                    return ostatniaLitera1.compareTo(ostatniaLitera2);
                })
                .collect(Collectors.toList());
        System.out.println(krotkieNazwiskaPosortowaneInaczej);

        // 6) Odwróć kolejność liter we wszystkich nazwiskach i pozstaw jedynie te, które mają literę 'A'
        // wsród pierwszych trzech liter (odwróconego nazwiska)
        List<String> odwroconaNaA = surNames.stream()
                .map(s -> new StringBuilder(s).reverse().toString())
                .filter(rs -> rs.startsWith("A")).collect(Collectors.toList());
        System.out.println(odwroconaNaA);

        // 7) Policz, ile jest nazwisk zaczynających się na każdą z liter
        // alfabetu (rezultat jako Map<Character, Integer>)
        Map<Character, Long> collect = surNames.stream().collect(Collectors.groupingBy(s -> s.charAt(0), Collectors.counting()));
        System.out.println(collect);

        // 8*) Jaka litera pojawia się najcześciej we wszystkich nazwiskach?
        Map<Character, Long> collect1 = surNames.stream()
                .map(nazwisko -> nazwisko.chars().mapToObj(e -> (char) e).collect(Collectors.toList()))
                .flatMap(charsList -> charsList.stream()).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));


        List<Integer> integers = new ArrayList<>();
        integers.add(23);
        integers.add(11);
        integers.add(76);
        integers.add(34);
        integers.add(1);
        integers.add(2);
        integers.add(8);
        integers.add(3);
        integers.add(4);
        integers.add(9);
        integers.add(112);
        integers.add(989);
        integers.add(9877);
        integers.add(45);
        integers.add(45);
        integers.add(21);
        integers.add(111);
        integers.add(93);

        // 1) Ile jest liczb parzystych?
        long countOfEven = integers.stream().filter(l -> l % 2 == 0).count();
        System.out.println(countOfEven);

        // 2) Ile jest liczb pięciocyfrowych?
        long countOf5Digits = integers.stream().filter(l -> l > 10000).count();
        System.out.println(countOfEven);

        // 3) Jaka jest największa i najmniejsza liczba?
        Integer max = integers.stream().max(Integer::compare).orElse(0);
        Integer min = integers.stream().max(Integer::compare).orElse(0);
        System.out.println(max);
        System.out.println(min);

        // 5) Jaka jest średnia wszystkich liczb
        double v = integers.stream().mapToInt(l -> l).average().orElse(0);
        System.out.println(v);

        // 6) Jaka jest mediana
        int[] tab = integers.stream()
                .sorted()
                .mapToInt(i -> i)
                .toArray();
        int mediana = tab[100_000 / 2];

        OptionalInt mediana2 = integers.stream()
                .sorted()
                .mapToInt(i -> i)
                .limit(50_000)
                .max();

        OptionalDouble medianaPokrecona = integers.stream()
                .sorted()
                .limit(50)
                .sorted((i1, i2) -> i2 - i1)
                .limit(2)
                .mapToInt(i -> i)
                .average();

        //7*) Jaka cyfra pojawia się najczęściej we wszystkcih liczbach?
        Map<Character, Long> collect2 = integers.stream().map(liczba -> liczba.toString())
                .map(nazwisko -> nazwisko.chars().mapToObj(e -> (char) e).collect(Collectors.toList()))
                .flatMap(chars -> chars.stream()).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));


        //8*) Ile jest wystąpień każdej cyfry (rezultat jako Map<Integer, Integer> z kluczami od 0 do 9)
    }


}
