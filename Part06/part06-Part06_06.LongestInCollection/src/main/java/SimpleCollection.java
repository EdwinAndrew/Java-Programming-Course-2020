
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }
    
    public String longest(){
        
        if(elements.isEmpty()){
            return null;
        }
            
        String longName = elements.get(0);
        for (String nameCheck:elements){
            if(longName.length() < nameCheck.length()){
                longName = nameCheck;
            }
        }
        return longName;   
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

}
