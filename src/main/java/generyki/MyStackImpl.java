package generyki;

public class MyStackImpl<T> implements MyStack<T>{

    private static final int STACK_SIZE = 10;
    T[] tablica;
    int index;

    public MyStackImpl() {
        tablica = (T[])new Object[STACK_SIZE];
    }

    public static void main(String[] args) {
        //test
        MyStackImpl<String> stos = new MyStackImpl<>();
        stos.push("11");
        stos.push("22");
        stos.push("33");
        stos.push("44");
        stos.push("55");
        stos.push("66");
        stos.push("77");
        stos.push("88");
        stos.push("99");
        stos.push("10");

        String pop = stos.pop();
        String pop2 = stos.pop();
        String pop3 = stos.pop();
        String pop4 = stos.pop();
        String pop5 = stos.pop();
        String pop6 = stos.pop();
        String pop7 = stos.pop();
        String pop8 = stos.pop();
        String pop9 = stos.pop();
        String pop10 = stos.pop();
        System.out.println();
    }

//index = 10;
    public T push(T element) {
        if (index <= STACK_SIZE) {
            tablica[index] = element;
            index++;
        } else {
            throw new RuntimeException("Stos sie przepelnil");
        }
        return element;
    }

    public T pop()  {
        if (index <= 0) {
            throw new RuntimeException("Stos jest pusty");
        } else {
            T liczba = tablica[index - 1];
            tablica[index - 1] = null;
            index--;
            return liczba;
        }
    }

    public boolean isEmpty() {
        return (index == 0);
    }
}