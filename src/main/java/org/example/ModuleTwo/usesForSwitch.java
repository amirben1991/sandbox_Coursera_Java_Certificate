package org.example.ModuleTwo;

import java.util.Scanner;

public class usesForSwitch {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the first number");
        int number1 = keyboard.nextInt();


        System.out.println("Enter the second number");
        int number2 = keyboard.nextInt();


        // check if the new line is in the input buffer

        if(keyboard.hasNextLine()) {
            keyboard.nextLine();
        }
        String operator = keyboard.nextLine();

        int result = 0;
        switch (operator) {
            case "+":
                result = number2 + number1;
                break;

            case "-":
                result = number1 - number2;
                break;

            case "*":
                result = number1 * number2;
                break;

            case "/":
                result = number1 / number2;
                break;
            default:
                System.out.println("Invalid operator");
        }
        System.out.println("The result is: " + result);
    }


}
