import java.util.ArrayList;
public class Herd implements Movable {
    
    private ArrayList<Movable> herd;
    
    public Herd(){
        this.herd = new ArrayList<>();
    }
    
    public void addToHerd(Movable movable){
        this.herd.add(movable);
    }
    
    @Override
    public void move(int dx, int dy){
        for(Movable movable: herd){
            movable.move(dx,dy);
        }
    }
    
    @Override
    public String toString(){
        String list = "";
        for (Movable movable : this.herd) {
            list += movable.toString() + "\n";
        }
        return list;
    }
}
