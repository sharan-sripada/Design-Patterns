package creational.factory;



public class ItalianFood extends AbstractFood {
    String itemName;
    int quantity;

    public ItalianFood() {
        System.out.println("Order placed : Italian Food");
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
