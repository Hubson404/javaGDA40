package refleksja;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {
       // Zadanie1 dowolnaKlasa = new Zadanie1();
        //Class klasa = dowolnaKlasa.getClass();
        Class<Zadanie1> zadanie1Class = Zadanie1.class;
        Zadanie1 z1 = new Zadanie1();
        Class<? extends Zadanie1> aClass = z1.getClass();

        System.out.println("Nazwa klasy: " + zadanie1Class.getSimpleName());
        Constructor<?>[] constructors = zadanie1Class.getConstructors();
        System.out.println(constructors.length);
        Method[] declaredMethods = zadanie1Class.getDeclaredMethods();

/*        System.out.println("Ilość konstruktorów: " + zadanie1Class.getConstructors().length);
        System.out.println("Ilość metod: " + zadanie1Class.getMethods().length);
        System.out.println("");
        System.out.println("Typy zwracane przez metody: ");
        Arrays.stream(zadanie1Class.getDeclaredMethods()).map(k -> k.getGenericReturnType()).forEach(System.out::println);
        System.out.println("");
        System.out.println("Nazwy wszystkich metod: ");
        Arrays.stream(zadanie1Class.getDeclaredMethods()).map(k -> k.getName()).forEach(System.out::println);
        System.out.println("");
        System.out.println("Nazwy wszystkich pól: ");
        Arrays.stream(zadanie1Class.getDeclaredFields()).map(k -> k.getName()).forEach(System.out::println);
        System.out.println("");
        System.out.println("Typy dla poszczególnych pól: ");*/
    }
}
