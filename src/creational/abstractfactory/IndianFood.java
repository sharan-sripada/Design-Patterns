package creational.abstractfactory;

public class IndianFood extends AbstractFood{
    String itemName;
    int quantity;

    public IndianFood(String itemName, int quantity) {
       this.quantity=quantity;
       this.itemName=itemName;
       System.out.println("Order placed :"+itemName+ " "+quantity);

    }

    @Override
    public String getItemName() {
        return null;
    }

    @Override
    public int getQuantity() {
        return 0;
    }

    public void setItemName(String item){
        this.itemName=item;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
