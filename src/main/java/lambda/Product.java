package lambda;

public class Product {

    String name;

    public Product(String name) {
        this.name = name;
    }
    public boolean czyJestemProduktem(String s) {
        return name.equals(s);
    }
}
