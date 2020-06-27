package refleksja;

public class Zadanie1 {

    private static int numer1;
    private static int number2;
    private static String nazwa;
    private static Person person;

    @SuperMethod(run = true)
    public static int dodawanie() {
        return numer1 + number2;
    }

    public static void wypisywanie() {
        System.out.println(nazwa);
    }

    @SuperMethod(run = true)
    public Person osoba() {
        return person;
    }

    public static void wszystko() {
        System.out.println(nazwa);
    }

    public Zadanie1(int numer1, int number2, String nazwa, Person person) {
        this.numer1 = numer1;
        this.number2 = number2;
        this.nazwa = nazwa;
        this.person = person;
    }

    public Zadanie1() {
    }
}
