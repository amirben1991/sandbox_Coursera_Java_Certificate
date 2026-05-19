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

        // second example: Speed

        int carSpeed = 60;

        // 1st level "if" condition
        if (carSpeed >= 0 && carSpeed <= 16) {
            System.out.println("1st Gear");
        } else {
            if (carSpeed >=17 && carSpeed <= 32) {
                System.out.println("2nd Gear");
            } else {
                if (carSpeed >= 33 && carSpeed <= 48) {
                    System.out.println("3rd Gear");
                } else {
                    if (carSpeed >= 49 && carSpeed <= 64) {
                        System.out.println("4th Gear");
                    } else {
                        if (carSpeed >= 65 && carSpeed <= 80) {
                            System.out.println("5th Gear");
                        } else {
                            if (carSpeed > 80) {
                                System.out.println("Slow down Boss");
                            }
                        }
                    }
                }
            }
        }

        // Task 3 Checking values


        
    }

}
