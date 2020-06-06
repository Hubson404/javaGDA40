package sda.wzorce.single;

public class Main {

    public static void main(String[] args) {
        BookPrinter bp = new WindowBookPrinter();
        bp.printBook(new Book());
    }
}
