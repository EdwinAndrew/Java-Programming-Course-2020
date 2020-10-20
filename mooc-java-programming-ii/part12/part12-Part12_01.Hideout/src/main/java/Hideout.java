import java.util.ArrayList;

public class Hideout<T> {
    private T item;
    public Hideout() {
        this.item = null;
    }
    public void putIntoHideout(T toHide){
       item = toHide;
    }
    public T takeFromHideout(){
        T reveal = null;
        if (isInHideout()){
            reveal = item;
            item = null;
        }
        return reveal;
    }
    public boolean isInHideout(){
        return item!= null;

    }

}
