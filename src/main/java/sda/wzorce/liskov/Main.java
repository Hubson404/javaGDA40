package sda.wzorce.liskov;

public class Main {

    public static void main(String[] args) {
        Rectangle r = new Square();
        setRectangleAndPrintArea(r);
    }

    private static void setRectangleAndPrintArea(Rectangle rectangle) {
        rectangle.setWidth(5);
        rectangle.setHeight(10);
        int area = rectangle.getArea();
        System.out.println(area);
    }
}
