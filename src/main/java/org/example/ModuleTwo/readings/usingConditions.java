package org.example.ModuleTwo.readings;

public class usingConditions {

    public static void main(String[] args) {

        int number = 0;
        // check if a number is equal to zero

        if (number == 0) {
            System.out.println("The number is equal to zero " + number);
        }

        /*
            Marks between (60 – 69): "Below Average"

            Marks between (70 – 79): "Average"

            Marks between (80– 89): "Good"

            Marks between (90– 100): "Excellent"

            Marks is below 60: "Failing"
         */

        int markOne = 66;
        int markTwo = 75;
        int markThree = 82;

        int average = (markOne + markTwo + markThree) / 3;

        if (average < 60) {
            System.out.println("Failing");
        } else {
            if (average >= 60 && average <= 69) {
                System.out.println("Below Average");
            } else {
                if (average >= 70 && average <= 79) {
                    System.out.println("Average");
                } else {
                    if (average >= 80 && average <= 89) {
                        System.out.println("Good");
                    } else {
                        if (average >= 90 && average <= 100) {
                            System.out.println("Excellent");
                        }
                    }
                }
            }
        }


        
    }

}
