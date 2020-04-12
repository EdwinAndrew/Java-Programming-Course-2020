import java.util.ArrayList;
import java.util.Collections;
public class Stack {
    
    private ArrayList<String> values;
    
    public Stack(){
        this.values = new ArrayList<>();
    }
    
    public boolean isEmpty(){
        if(values.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
    
    public void add(String value){
        values.add(value);
    }
    
    public String take(){
        int topValueIndex = (this.values.size() -1);
        String topValue = this.values.get(topValueIndex);
        this.values.remove(topValueIndex);
        return topValue;
    }
    
    public ArrayList<String> values(){
        return this.values;
    }
}
