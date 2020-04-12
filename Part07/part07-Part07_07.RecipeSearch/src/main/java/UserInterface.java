import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    private Scanner reader;
    private ReadDoc inputDocument;

    public UserInterface(Scanner reader) {
        this.reader = reader;
        this.inputDocument = new ReadDoc(this.reader.nextLine());
    }

    public void start() {

        ArrayList<Recipes> listedDocument = this.inputDocument.docToRecipe();

        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        System.out.println("");

        while (true) {
            System.out.print("Enter command: ");
            String input = this.reader.nextLine();

            if (input.equals("stop")) {
                break;
            }

            if (input.equals("list")) {
                for (Recipes line : listedDocument) {
                    System.out.println(line.toString());
                }
                System.out.println("");
            }

            if (input.equals("find name")) {
                System.out.print("Searched word: ");
                String searched = this.reader.nextLine();
                for (Recipes recipe : listedDocument) {
                    if (recipe.getName().contains(searched)) {
                        System.out.println(recipe.toString());
                    }
                }
            }

            if (input.equals("find cooking time")) {
                System.out.print("Max cooking time: ");
                int searched = Integer.valueOf(this.reader.nextLine());
                for (Recipes recipe : listedDocument) {
                    if (recipe.getTime() <= searched) {
                        System.out.println(recipe.toString());
                    }
                }
            }

            if (input.equals("find ingredient")) {
                System.out.print("Ingredient: ");
                String searched = this.reader.nextLine();
                for (Recipes recipe : listedDocument) {
                    if (recipe.getIngredients().contains(searched)) {
                        System.out.println(recipe.toString());
                    }
                }
            }
        }
    }

}