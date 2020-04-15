import java.util.HashMap;
import java.util.ArrayList;
public class VehicleRegistry {
    private HashMap<LicensePlate, String> register;
    
    public VehicleRegistry(){
        this.register = new HashMap<>();
    }
    
    public boolean add(LicensePlate licensePlate, String owner){
        if (!(register.containsKey(licensePlate))){
            this.register.put(licensePlate, owner);
            return true;
        }
        return false;
    }
    public String get(LicensePlate licensePlate){
        return this.register.get(licensePlate);
    }
    public boolean remove(LicensePlate licensePlate){
        if (register.containsKey(licensePlate)){    
           register.remove(licensePlate);
           return true;
        }
        return false;
    }
    
    public void printLicensePlates(){
        for(LicensePlate plates:register.keySet()){
            System.out.println(plates);
        }
    }
    public void printOwners(){
        ArrayList<String> owners = new ArrayList<>();
        for(String person:register.values()){
            if (!(owners.contains(person))){
                System.out.println(person);
                owners.add(person);
            }
        }
    }
}
