/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author edwinandrew
 */
public class Container {
    private int volume;
    public Container(){
        this.volume = 0;
    }
    
    public int contains(){
        return volume;
    }
    
    public void add(int amount){
        if (amount < 0){
            amount = 0;
        }
        if (volume + amount >= 100){
            volume = 100;
        }else{
            volume += amount;
        }
    }
    
    public void remove(int amount){
        if (volume - amount <= 0){
            volume = 0;
        }else{
            volume -= amount;
        }
    }
    
    public String toString(){
        return this.volume + "/100";
    }
}
