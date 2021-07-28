package creational.abstractfactory;

public class IndianFoodFactory extends AbstractFoodFactory{
    @Override
    public AbstractFood placeOrder(String itemName, int quantity) {
        return new IndianFood(itemName,quantity);
    }
}
