package sda.wzorce.openclosed.sample;

public class Kawa {

    public void recepturaParzenia() {
        gotowanieWody();
        zaparzenieKawy();
        nalewanieDoFilizanki();
        dodanieCukruOrazMleka();
    }

    private void gotowanieWody() {
        System.out.println("Gotuje wode");
    }

    private void zaparzenieKawy() {
        System.out.println("Parze kawe");
    }

    private void nalewanieDoFilizanki() {
        System.out.println("Nalewam do filizanki");
    }

    private void dodanieCukruOrazMleka() {
        System.out.println("Dodaje curku oraz mleka");
    }
}
