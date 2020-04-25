import java.util.ArrayList;
public class MisplacingBox extends Box{
    private ArrayList<Item> missinglist;
    
    public MisplacingBox(){
        this.missinglist = new ArrayList<>();
    }
    
    @Override
    public void add(Item item){
        this.missinglist.add(item);
    }
    
    @Override
    public boolean isInBox(Item comparedItem){
        return false;
    }
}
