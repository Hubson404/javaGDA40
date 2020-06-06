package sda.wzorce.openclosed.sample;

public class Herbata {

    public void recepturaParzenia() {
        gotowanieWody();
        wkładanieTorebkiherbatyDoWrzatku();
        nalewanieDoFilizanki();
        dodatnieCytryny();
    }

    private void gotowanieWody() {
        System.out.println("Gotuje wode");
    }

    private void wkładanieTorebkiherbatyDoWrzatku() {
        System.out.println("Wkładam herbate do wrzetku");
    }

    private void nalewanieDoFilizanki() {
        System.out.println("Nalewam do filizanki");
    }

    private void dodatnieCytryny() {
        System.out.println("Dodanie cytryny");
    }
}
