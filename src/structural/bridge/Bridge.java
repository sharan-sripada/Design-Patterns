package structural.bridge;

public class Bridge {
    public static void main(String[] args) {
        Shape square=new Square(new Blue());
        System.out.println(square.draw());
        Shape circle=new Circle(new Red());
        System.out.println(circle.draw());

    }
}
