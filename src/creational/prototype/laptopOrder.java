package creational.prototype;

public class laptopOrder {
    public static void main(String[] args) throws CloneNotSupportedException {
        laptopPrototype order1=new laptopPrototype("i7",512,8);
        System.out.println("Order 1:"+order1);

        laptopPrototype order2=order1.clone();
        order2.addRam(8);
        System.out.println("Order 2:"+order2);

    }
}
