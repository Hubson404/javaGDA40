package sda.wzorce.single;

public class ConsoleBookPrinter implements BookPrinter {


    public void printBook(Book book) {
        for (Page page : book.getPages()) {
            System.out.println(page.getContent());
        }
    }

}
