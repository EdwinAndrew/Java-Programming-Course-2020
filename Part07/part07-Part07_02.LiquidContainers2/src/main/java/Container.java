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
    public int volume;
    public Container(){
        this.volume = 0;
    }
    
    public int contains(){
        return volume;
    }
    
    public void add(int amount){
        if (amount > 0){
            volume += amount;
            if (volume > 100){
                volume = 100;
            }
        }
    }    
    
    public void remove(int amount){
        if (amount > 0){
            this.volume -= amount;
            if (volume < 0){
                volume = 0;
            }
        }
    }
    
    public String toString(){
        return  volume + "/100";
    }
}
