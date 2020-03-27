/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author edwinandrew
 */
public class Multiplier {
    private int value1;
    public Multiplier(int number){
        this.value1 = number;
    }
    public int multiply(int number){
        return number*this.value1;
    }
}
