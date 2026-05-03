package org.example.ModuleTwo;


import java.util.Scanner;

public class userInputConditionalStatements {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the age: ");
        int age = keyboard.nextInt();


        System.out.println("Enter the money: ");
        float money = keyboard.nextFloat();

        System.out.println("Enter the name: ");
        String name = keyboard.nextLine();


    }

}
