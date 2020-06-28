package generyki;

public class Pudelko<T extends PracownikSzpitala> {

    T s;

    public T metodka(int i, double d) {
        if(i > 0) {
            return null;
        }

        return s;
    }

    public T metodka(int i) {
        if(i > 0) {
            return null;
        }
        return s;
    }

    public void wesStringa(T s) {
        System.out.println("aaaaaaa");
    }

    public Pudelko(T s, int i) {
        this.s = s;
    }

}
