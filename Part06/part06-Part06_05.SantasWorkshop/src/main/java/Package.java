import java.util.ArrayList;
public class Package {
    private ArrayList<Gift> gift;
    
    public Package(){
        this.gift = new ArrayList<>();
    }
    
    public void addGift(Gift gift){
        this.gift.add(gift);
    }
    
    public int totalWeight(){
        int totalWeight = 0;
        for (Gift item:gift){
            totalWeight += item.getWeight();
        }
        return totalWeight;
    }
}
/*
A parameterless constructor
Method public void addGift(Gift gift), which adds the gift passed as a parameter to the package. The method returns no value.
Method public int totalWeight(), which returns the total weight of the package's gifts.
It's recommended to store the items in an ArrayList object.

ArrayList<Gift> gifts = new ArrayList<>();
*/