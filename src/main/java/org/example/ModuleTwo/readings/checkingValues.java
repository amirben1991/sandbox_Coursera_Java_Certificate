package org.example.ModuleTwo.readings;

public class checkingValues {

    public static void main(String[] args) {
        /*
        There are two binary logical operators (AND and OR), and one unary logical operator (NOT)
        The result of the logical operators is fixed or always constant for a given condition or conditions.
         */


        // First example
        boolean thereIsPetrolInCar = true;
        boolean thereIsExtraTime = true;
        int cashInHand = 300;

        if ((thereIsExtraTime == true ) && (thereIsExtraTime == true ) && (cashInHand >= 300)) {
            System.out.println("I will go to Las Vegas");
        }

        // second example --> OR Operator

        boolean thereIsPetroInCarOr = true;
        boolean thereIsExtraTimeOr = false;
        int cashInHandOr = 100;

        if ((thereIsPetroInCarOr == true ) || (thereIsExtraTimeOr == true) || (cashInHandOr >= 300)) {
            System.out.println("I will Go to Las Vegas");
        }

        // Unary logical operators --> NOT
        int marks = 75;
        if (! (marks <= 60)) {
            System.out.println("Pass.");
        } else {
            System.out.println("Fail.");
        }


        // Multiple conditions
        int dollarsToSpareInPocketToday = 300;

        // checking if interested in games based on luck
        boolean interestedInLuckAndFun = true;

        // checking if interested in history
        boolean interestedInHistory = false;

        // checking if the amount of money is less than 300
        if (dollarsToSpareInPocketToday < 300) {
            System.out.println("I will go to the parents place");
        }

        // checking if the amount of money is greater than 300 and interested in Luck
        if (dollarsToSpareInPocketToday > 300 && interestedInLuckAndFun == true && interestedInHistory == false) {
            System.out.println("I will go to Las Vegas");
        }

        // checking if the amount of money is greater than 300 and interested in History
        if (dollarsToSpareInPocketToday > 300 && interestedInLuckAndFun == false && interestedInHistory == true) {
            System.out.println("I will visit Hoover Dam");
        }

        // checking if the amount of money is greater than 300 and not interested in Luck and not interested in History
        if (dollarsToSpareInPocketToday > 300 && interestedInLuckAndFun == false && interestedInHistory == false) {
            System.out.println("I will go visit Area 51");

        }

        /*
        How to Cover for all the conditions
         */

        if (! ( (dollarsToSpareInPocketToday > 300)
            || (dollarsToSpareInPocketToday > 300 && interestedInLuckAndFun == true && interestedInHistory == false)
            || (dollarsToSpareInPocketToday > 300 && interestedInLuckAndFun == false && interestedInHistory == true)
            || (dollarsToSpareInPocketToday > 300 && interestedInLuckAndFun == false && interestedInHistory == false)
        )) {
            System.out.println("Not a valid Option");
        }

        /*
        Advantages of logical operators
        - Readability
        - Conciseness: it reduces verbosity and nesting
        - Performance: it's faster due to short circuit evaluation
         */
    }
}
