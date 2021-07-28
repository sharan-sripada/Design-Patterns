package creational.factory;


public class PlaceOrder {
    public AbstractFood placeOrder(String type){
        if(type.equals("indian")){
           return new IndianFood();
        }
        else if(type.equals("italian")){
           return new ItalianFood();
        }
        return null;

    }
}
