package org.example.ModuleTwo;

import java.util.Scanner;

public class iterativeStructuresWhileLoop {

    public static void main(String[] args) {
        int totalTrash = 22;

        // trash SideKick will carry each time
        int trashToCarry = 5;


        while (totalTrash > 0) {

            if (totalTrash < 5) {
                trashToCarry = totalTrash;
            }
            totalTrash = totalTrash - trashToCarry;
            System.out.println("Removed" + trashToCarry +
                    "Removed 5 items. Total remaining: " + totalTrash
            );
        }


        // Second example

        Scanner keyboard = new Scanner(System.in);

        // Variable to get user choice for switch case

        int cleaningOption;

        // variable to continue cleaning until it's true
        boolean runLoop = true;

        // Insert the while loop
        while(runLoop) {
            System.out.println("Choose an option: \n1. Clean the floor \n2. Clean the windows \n3. Clean the bathroom \n4. Exit");
            System.out.println("1: Clean the floor");
            System.out.println("2: Clean the windows");
            System.out.println("3: Clean the bathroom");
            System.out.println("4: Exit");


            System.out.println("Enter choice (1-4): ");
            cleaningOption = keyboard.nextInt();
            switch (cleaningOption) {
                case 1:
                    System.out.println("You chose to clean the floor.");
                    break;
                case 2:
                    System.out.println("You chose to clean the windows.");
                    break;
                case 3:
                    System.out.println("You chose to clean the bathroom.");
                    break;
                case 4:
                    System.out.println("Exiting the program. Goodbye!");
                    runLoop = false; // Set runLoop to false to exit the loop
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }

        System.out.println("Cleaning completed");


        int totalTrashInRoom = 0;

        do {
            System.out.println("I will take out some trash");


        } while (totalTrashInRoom > 0);

    }

}
