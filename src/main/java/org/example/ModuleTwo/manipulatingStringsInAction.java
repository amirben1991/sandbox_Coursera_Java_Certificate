package org.example.ModuleTwo;

public class manipulatingStringsInAction {
    public static void main(String[] args) {
        int amountOfMoney = 250;

        // 1st level if-statement
        if(amountOfMoney < 300) {
            // 2nd level if-statement inside 1st level if-statement
            if(amountOfMoney < 200) {
                System.out.println("No Diversions");
            } else {
                boolean hasInterestInHistory = false;
                if(hasInterestInHistory) {
                    System.out.println("Go to Hoover Dam");
                } else {
                    System.out.println("Go to area 51");
                }
            }
        } else {
            System.out.println("Go to las vegas");
        }
    }
}
