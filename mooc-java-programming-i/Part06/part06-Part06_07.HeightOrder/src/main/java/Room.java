import java.util.ArrayList;
public class Room {
    public ArrayList<Person> list;
    public Room(){
        this.list = new ArrayList<>();
    }
    
    public void add(Person person){
        list.add(person);
    }
    
    public boolean isEmpty(){
        return this.list.isEmpty();
    }
    
    public ArrayList<Person> getPersons(){
        return this.list;
    }
    public Person shortest(){
        if (list.isEmpty()){
            return null;
        }
        Person shortestPerson = this.list.get(0);
        for (Person item:list){
            if(item.getHeight() < shortestPerson.getHeight()){
                shortestPerson = item;
            }
        }
        return shortestPerson;
    }
    
    public Person take(){
        Person shortestPerson = this.shortest();
        this.list.remove(shortestPerson);
        return shortestPerson;
    }
}
