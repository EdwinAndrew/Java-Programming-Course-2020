import java.util.HashMap;
public class Abbreviations {
    private HashMap<String, String> library;
    public Abbreviations(){
        this.library = new HashMap<String, String>();
    }
    
    public void addAbbreviation(String abbreviation, String explanation){
        this.library.put(abbreviation, explanation);
    }
    public boolean hasAbbreviation(String abbreviation){
        if (!library.containsKey(abbreviation)){
            return false;
        }
        return true;
    }
    public String findExplanationFor(String abbreviation){
        return this.library.get(abbreviation);
    }
}
