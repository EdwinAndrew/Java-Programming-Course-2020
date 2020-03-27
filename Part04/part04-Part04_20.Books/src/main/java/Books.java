/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author edwinandrew
 */
public class Books {
    //title pages publication year
    private String title;
    private int pages;
    private int pubYear;
    
    //Constructor
    public Books(String title, int pages, int pubYear){
        this.title = title;
        this.pages = pages;
        this.pubYear = pubYear;
    }
    
    public String getTitle(){
        return title;
    }
    
    public int getPages(){
        return pages;
    }
    
    public int getPubYear(){
        return pubYear;
    }
    
    @Override
    public String toString(){
        return this.title + ", "  + this.pages + " pages, " + this.pubYear;
    }
           
}
