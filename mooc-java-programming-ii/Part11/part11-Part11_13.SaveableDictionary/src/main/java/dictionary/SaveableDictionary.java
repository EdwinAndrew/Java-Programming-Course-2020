package dictionary;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class SaveableDictionary {
    private HashMap<String,String> dictionary;
    private String filename;

    public SaveableDictionary() {
        this.dictionary = new HashMap<>();
    }

    public SaveableDictionary(String file){
        this();
        this.filename = file;
    }
    public boolean load(){
        try(Scanner scan = new Scanner(Paths.get(filename))){
            while(scan.hasNextLine()){
                String line = scan.nextLine();
                String[] parts = line.split(":");
                this.add(parts[0],parts[1]);
            }
            return true;
        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }

    public boolean save(){
        ArrayList<String> existingWords = new ArrayList<>();
        try(PrintWriter writer = new PrintWriter(new File(filename))){
            for(String word: dictionary.keySet()){
                String translation = translate(word);
                if (!existingWords.contains(word) && !existingWords.contains(translation)){
                    existingWords.add(word);
                    writer.println(word +":" + translation);
                }
            }
        }catch (FileNotFoundException e){
            System.err.println("File Error: " + e.getMessage());
            return false;
        }
        return true;

    }


    public void add(String words, String translation) {
        dictionary.putIfAbsent(words, translation);
        dictionary.putIfAbsent(translation,words);
    }

    public String translate(String word) {
       String translation = dictionary.getOrDefault(word,null);
       return translation;
    }
    public void delete(String word){
        String translation =  translate(word);
        if (translation != null) {
            dictionary.remove(word);
            dictionary.remove(translation);
        }
    }
}
