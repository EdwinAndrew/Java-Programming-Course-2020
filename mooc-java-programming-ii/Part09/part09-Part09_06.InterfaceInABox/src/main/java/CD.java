
public class CD implements Packable {
    private final double weight = 0.1; //kg
    private String artistName;
    private String title;
    private int pubYear;
    
    public CD(String artistName, String title, int pubYear){
        this.artistName = artistName;
        this.title = title;
        this.pubYear = pubYear;
    }
    
    
    public double weight(){
        return this.weight;
    }
    
    @Override
    public String toString(){
        return this.artistName + ": " + this.title + " (" + this.pubYear +")";
    }
}
