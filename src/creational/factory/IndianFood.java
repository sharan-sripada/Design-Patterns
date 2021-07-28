package creational.factory;


public class IndianFood extends AbstractFood {
    String itemName;
    int quantity;

    public IndianFood() {
       System.out.println("Order placed : Indian Food");

    }

    @Override
    public String getItemName() {
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
