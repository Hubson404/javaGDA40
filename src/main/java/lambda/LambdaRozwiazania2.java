package lambda;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaRozwiazania2 {


    public static void main(String[] args) {

        List<String> surNames = new ArrayList<>();
        surNames.add("Adamski");
        surNames.add("Adamczyk");
        surNames.add("Ciesielski");
        surNames.add("Dyb");
        surNames.add("Bartczak");
        surNames.add("Bartkowiak");
        surNames.add("Gaz");
        surNames.add("Hincowa");
        surNames.add("Irys");
        surNames.add("Baka");
        surNames.add("Kowal");
        surNames.add("Kowalewska");
        surNames.add("Man");
        surNames.add("Nowak");
        surNames.add("Nowacka");

        List<String> krotkie = surNames.stream()
                .filter(p -> p.length() < 5)
                .map(p -> p.toUpperCase()).collect(Collectors.toList());

        List<String> zaczynajaceSieOdB = surNames.stream().filter(p -> p.startsWith("B")).collect(Collectors.toList());

        Set<String> collect = surNames.stream().map(nazwisko -> nazwisko.substring(0, 3).toUpperCase()).collect(Collectors.toSet());
        surNames.stream().map(nazwisko -> nazwisko.substring(0, 3).toUpperCase()).distinct().collect(Collectors.toList());

        //4) 10 najdłuższych nazwisk, posortowanych malejąco według długości
        // ----> podpowiedz: użyć między innymi sorted()
        List<String> collect1 = surNames.stream().sorted((a, b) -> b.length() - a.length()).limit(10).collect(Collectors.toList());
        //surNames.stream().sorted() .sorted((p,q)->Integer.compare(-p.length(),-q.length()))// sortowanie w kolejności malejącej przez dodanie znaków - .limit(10)
        //surNames.stream().sorted(Comparator.comparingInt(String::length).reversed()).limit(10) .collect(Collectors.toList());


        surNames.stream().sorted((p, q) -> p.length() - q.length()).limit(10).sorted((p, q) -> p.charAt(p.length() - 1) - q.charAt(q.length() - 1)).forEach(System.out::println);
        System.out.println("==================================");
        surNames.stream().sorted((p, q) -> p.length() - q.length()).limit(10).sorted(Comparator.comparing(nazwisko -> nazwisko.charAt(nazwisko.length() - 1))).forEach(System.out::println);

        //6) Odwróć kolejność liter we wszystkich nazwiskach
        // i pozstaw jedynie te, które mają literę 'A' wsród
        // pierwszych trzech liter (odwróconego nazwiska)
        System.out.println("==================================");
        surNames.stream().map(slowo -> new StringBuilder(slowo).reverse()).filter(trzy -> trzy.substring(0, 3).contains("a")).forEach(System.out::println);

        //7) Policz, ile jest nazwisk zaczynających się na każdą
        // z liter alfabetu (rezultat jako Map<Character, Integer>)
        Map<Character, Long> collect2 = surNames.stream()
                .map(s -> s.charAt(0))
                .collect(Collectors.groupingBy(k -> k, Collectors.counting()));

        Map<Character, Long> collect3 = surNames.stream()
                .collect(Collectors.groupingBy(k -> k.charAt(0), Collectors.counting()));
        System.out.println(collect2);
        System.out.println(collect3);//        surNames.add("Adamski");      A

        collect3.forEach((key, value) -> System.out.println(key + ": " + value));



        //8) Jaka litera pojawia się najcześciej we wszystkich nazwiskach?
        Map<Character, Long> collect4 = surNames.stream()
                .map(s -> s.toLowerCase())
                .collect(Collectors.joining())
                .chars().mapToObj(c -> ((char) c))
                .collect(Collectors.groupingBy(Function.identity(), (Collectors.counting())));

        //Przeanalizowac sobie
        Stream<List<Character>> listStream = surNames.stream()
                .map(nazwisko -> nazwisko.chars().mapToObj(e -> (char) e).collect(Collectors.toList()));
        Stream<Character> characterStream = listStream
                .flatMap(charsList -> charsList.stream());
        Map<Character, Long> collectXXX = characterStream.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));



        List<String> sadf;
        List<List<String>> afsd;

        List<Integer> listaLiczb = new ArrayList<>();
        listaLiczb.add(-51);
        listaLiczb.add(-15);
        listaLiczb.add(-50);
        listaLiczb.add(51);
        listaLiczb.add(23);
        listaLiczb.add(146);
        listaLiczb.add(-25);
        listaLiczb.add(34);
        listaLiczb.add(187);
        listaLiczb.add(0);
        listaLiczb.add(-15);
        listaLiczb.add(100);
        listaLiczb.add(-2);
        listaLiczb.add(-1);
        listaLiczb.add(1);
        listaLiczb.add(3);
        listaLiczb.add(4);
        listaLiczb.add(6);
        listaLiczb.add(10);
        listaLiczb.add(-12);
        listaLiczb.add(341);
        listaLiczb.add(10000);
        listaLiczb.add(-25);
        listaLiczb.add(101);
        listaLiczb.add(11);
        listaLiczb.add(24);
        listaLiczb.add(36);
        listaLiczb.add(-4);
        listaLiczb.add(-8);
        listaLiczb.add(222);

/*        listaLiczb.size() % 2 == 0 ? listaLiczb.stream()
                .mapToDouble(Integer::intValue).sorted()
                .skip(listaLiczb.size() / 2 - 1).limit(2).average()
                .getAsDouble() : listaLiczb.stream().mapToDouble(Integer::intValue)
                .sorted().skip(listaLiczb.size() / 2).findFirst().getAsDouble();*/


    }


}
