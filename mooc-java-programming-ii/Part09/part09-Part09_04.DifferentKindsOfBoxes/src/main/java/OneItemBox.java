import java.util.ArrayList;
public class OneItemBox extends Box {
    private ArrayList<Item> oneItemList;
    public OneItemBox(){
        this.oneItemList = new ArrayList<>();
    }
    
   @Override
   public void add(Item item){
       if (oneItemList.isEmpty()){
           this.oneItemList.add(item);
       }else{
           
       }
       
   }  
   
   @Override
   public boolean isInBox(Item comparedItem){
       for(Item item:oneItemList){
           if (item.equals(comparedItem)){
               return true;
           }
       }
       return false;
   }
    
}
