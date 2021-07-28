package creational.factory;


public class OrderApplication {
    public static void main(String[] args) {
        PlaceOrder po=new PlaceOrder();
        po.placeOrder("indian");
        po.placeOrder("italian");
    }
}