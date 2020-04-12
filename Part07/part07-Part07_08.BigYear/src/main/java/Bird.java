/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author edwinandrew
 */
public class Bird {
    private String engName;
    private String latName;
    private int observation;
    
    public Bird(String engName, String latName){
        this.engName = engName;
        this.latName = latName;
        this.observation = 0;
    }
    public String getName(){
        return engName;
    }
    public void observation(){
         observation++;
    }
    public String toString(){
        return this.engName + "(" + this.latName + "): " + this.observation + " observation";
    }
}
