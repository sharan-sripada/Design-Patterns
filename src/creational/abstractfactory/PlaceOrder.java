package creational.abstractfactory;
//factory producer
public class PlaceOrder {
    public AbstractFood placeOrder(String type,String itemName,int quantity){
        AbstractFoodFactory abstractFoodFactory=null;
        if(type.equals("indian")){
            abstractFoodFactory=new IndianFoodFactory();
        }
        else if(type.equals("italian")){
            abstractFoodFactory=new ItalianFoodFactory();
        }
        return abstractFoodFactory.placeOrder(itemName,quantity);
    }
}
