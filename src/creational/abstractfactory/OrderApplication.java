package creational.abstractfactory;

public class OrderApplication {
    public static void main(String[] args) {
        PlaceOrder po=new PlaceOrder();
        po.placeOrder("indian","biryani",2);
        po.placeOrder("italian","pizza",4);
    }
}
