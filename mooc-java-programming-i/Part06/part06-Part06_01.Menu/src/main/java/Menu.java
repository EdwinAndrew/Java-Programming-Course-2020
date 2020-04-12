
import java.util.ArrayList;

public class Menu {
    public String meal;
    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }
    
    public void addMeal(String meal){
        // add meal to list if dupe, then dont add 
        this.meal = meal;
        if (meals.contains(meal)){
            
        }else{
            meals.add(this.meal);
        }
    }
    
    public void printMeals(){
    // print all meals in list
        for(int i = 0; i < meals.size();i++){
            System.out.println(meals.get(i));
        }
    }
    
    public void clearMenu(){
        // delete all items on menu
        meals.clear();
    }
    
    public boolean equal(Object compared){
        // if both variables are in the same position it is equal.
        if(this == compared){
            return true;
        }
        
        // if the object is not of the Menu class then it is not equal.
        if (!(compared instanceof Menu)){
            return false;
        }
        // make the object a Menu object
        Menu comparedMeal = (Menu) compared;
        //if the values of the objects are the equal so are the objects.
        return this.meal.equals(comparedMeal.meal);
        
    }
    
    
    
}
