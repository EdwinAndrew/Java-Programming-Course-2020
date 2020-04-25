
public class Item {
    private String item;
    private int quantity;
    private int unitPrice;

    public Item(String item, int quantity, int unitPrice) {
        this.item = item;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }
    
    public int price(){
        return this.unitPrice * this.quantity;
    }
    public void increaseQuantity(){
        this.quantity +=1;
    }
    
    @Override
    public String toString(){
       return this.item + ": " + this.quantity; 
    }
}
