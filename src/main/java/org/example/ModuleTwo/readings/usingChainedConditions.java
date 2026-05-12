package org.example.ModuleTwo.readings;

public class usingChainedConditions {

    public static void main(String[] args) {

        // Simple example

        int numberBeingChecked = 6;
        if( numberBeingChecked > 5 ) {
            System.out.println("The number: " + numberBeingChecked + " is > 5");
        } else {
            System.out.println("The number: " + numberBeingChecked + " is <= 5");
        }

        // Toni's sunday dilemma
        int dollarsToSpareInPocketToday = 15;

        if (dollarsToSpareInPocketToday >= 15) {
            System.out.println("I will go to the Movies");
        } else {
            if (dollarsToSpareInPocketToday >= 3) {
                System.out.printf("I will go to a Cafe for a cup of coffee");
            } else {
                System.out.println("I will stay at home and watch TV");
            }
        }

        // Alternative

        int dollarsToSpareInPocketToday2 = 15;

        if ( dollarsToSpareInPocketToday2 < 3) {
            System.out.println("I will stay at home and watch TV");
        } else {
            if (dollarsToSpareInPocketToday2 < 15 ){
                System.out.printf("I will go to a Cafe for a cup of coffee");
            } else {
                System.out.println("I will go to the Movies");
            }
        }

        // Another example

        int dollarsToSpareInPocketToday3 = 300;

        // 1st level "if" condition
        if (dollarsToSpareInPocketToday3 < 300) {
            System.out.println("I will go to my parents place. No diversions");
        } else {
            // corresponding "else" body or area of control of 1st "if"

            // checking if interested in games based on luck
            boolean interestedInLuckAndFun = false;

            // 2nd level "if" condition
            if (interestedInLuckAndFun) {
                System.out.println("I will go to Las Vegas");
            } else {
                // 2nd level "else" of 2nd level "if"

                // checking if interested in history and culture
                boolean interestedInHistory = false;

                // 3rd level "if" condition inside 2nd level "else"

                if (interestedInHistory){


                    System.out.println("I will visit Hoover Dam");
            } else {
                // 3rd level "else" of 3rd level "if"
                System.out.println("I will visit area 51 and observe the aliens");
                }
            }
        }
    }
}


