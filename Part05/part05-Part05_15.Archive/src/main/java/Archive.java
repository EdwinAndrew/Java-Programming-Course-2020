public class Archive {
    private String id;
    private String name;
    
    public Archive(String identifier, String name){
        this.id = identifier;
        this.name = name;
    }
    
    public String getID(){
        return id;
    }
    
    public String getName(){
        return name;
    }
    public String toString(){
        return this.id + ": " + this.name;
    }
    public boolean equals(Object compared){
        // check if they have the same value
        if(this == compared){
            return true;
        }
        //check if they are of the same class, Archive
        if(!(compared instanceof Archive)){
            return false;
        }
        // make it an object of Archive
        Archive comparedArchive = (Archive) compared;
        // if values are equal, the objects are too.
       return this.id.equals(comparedArchive.id);
    }
    
}
