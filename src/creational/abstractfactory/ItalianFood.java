package creational.abstractfactory;

public class ItalianFood extends AbstractFood{
    String itemName;
    int quantity;

    public ItalianFood(String itemName, int quantity) {
        this.itemName=itemName;
        this.quantity=quantity;
        System.out.println("Order placed :"+itemName+ " "+quantity);
    }

    public String getItemName(){
        return itemName;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }



    public void setItemName(String item){
        this.itemName=item;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
