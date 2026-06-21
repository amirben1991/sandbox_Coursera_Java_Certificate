package org.example.ModuleTwo.readings;

import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner to read user input
        int secretNumber = 7;
        int userGuess = 0;
        // While loop that keeps running until the correct guess
        while (userGuess != secretNumber) { // Exit condition
            System.out.print("Guess the number from 1 to 9: ");
            userGuess = scanner.nextInt(); // Get input from user

            if (userGuess != secretNumber) {
                System.out.println("Wrong guess, try again!");
            }
        }

        System.out.println("Congratulations! You guessed the correct number."); // Congratulate the user
        scanner.close();  // Close the scanner after use
    }
}
