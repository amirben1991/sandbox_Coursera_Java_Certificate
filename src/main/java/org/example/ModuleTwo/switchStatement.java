package org.example.ModuleTwo;


import java.util.Scanner;

public class switchStatement {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the flavor you want: ");
        String iceCreamFlavour = keyboard.nextLine();


        switch (iceCreamFlavour) {
            case "Strawberry":
                System.out.println("I'll enjoy my strawberry ice cream");
                break;

            case "Vanilla":
                System.out.println("I'll enjoy my vanilla ice cream");
                break;

            case "Chocolate":
                System.out.println("I'll enjoy my chocolate ice cream");
                break;

                default:
                    System.out.println("i'll have a glass of water");
        }
    }

}
