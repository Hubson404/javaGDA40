package generyki;

import java.util.Comparator;

public class MyStackImpl2 implements MyStack<Double>   {


    @Override
    public Double push(Double element) {
        return null;
    }

    @Override
    public Double pop() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}

class KandydatNaPrezydentaComparator implements Comparator<PracownikSzpitala> {

    @Override
    public int compare(PracownikSzpitala o1, PracownikSzpitala o2) {
        return 0;
    }
}