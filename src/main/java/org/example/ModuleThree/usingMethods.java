package org.example.ModuleThree;

public class usingMethods {

    // we can use an array to store the names of the ingredients
    static String[] ingredients;


    // variable for storing the status of the sandwich, whether it's ready or not
    static boolean sandwichReady;


    public static void gatherIngredients() {

        // place the ingredients in the array
        ingredients = new String[4];
        ingredients[0] = "bread";
        ingredients[1] = "chicken slices";
        ingredients[2] = "cheese slices";
        ingredients[3] = "Lettuce";

        System.out.println("All ingredients arranged");
    }

    public static void assembleSandwich() {
        // check if all the ingredients are available
        if (ingredients.length == 4) {
            if(ingredients[0].equals("bread") &&
                ingredients[1].equals("chicken slices") &&
                ingredients[2].equals("cheese slices") &&
                ingredients[3].equals("Lettuce")) {
                System.out.println("All ingredients are available. Assembling the sandwich...");
                sandwichReady = true;
            } else {
                System.out.println("Some ingredients are missing. Cannot assemble the sandwich.");
                sandwichReady = false;
            }
        }

    }

    public static void serveSandwich() {
        if (sandwichReady) {
            System.out.println("The sandwich is ready to be served. Enjoy your meal!");
        } else {
            System.out.println("The sandwich is not ready yet. Please wait.");
        }
    }

    public static void main(String[] args) {

        // gather ingredients for chicken cheese sandwich
        gatherIngredients();

        // assemble the sandwich
        assembleSandwich();

        // serve the sandwich
        serveSandwich();

    }
}
