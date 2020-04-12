import java.util.ArrayList;
public class BirdRegister {
    ArrayList<Bird> birds;
    public BirdRegister(){
        this.birds = new ArrayList<>();
    }

    public void addName(String engName, String latName){
        birds.add(new Bird(engName, latName));
    }
    
    public ArrayList<Bird> printBirdRegister(){
        return birds;
    }
}
