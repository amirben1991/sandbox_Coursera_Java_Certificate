package org.example.ModuleTwo;

public class forLoops {

    public static void main(String[] args) {
        // for incremental operator
        int numberOfTurkeys;
        for (numberOfTurkeys = 0; numberOfTurkeys < 5; numberOfTurkeys++)
        {
            System.out.println("This is turkey n°: "+ (numberOfTurkeys));
        }
        System.out.println("--------- AFTER THE LOOP ---------");
        System.out.println("The number of turkeys is: " + numberOfTurkeys);

        // For decremental operator
        int numOfTurkeys;
        for (numOfTurkeys = 5; numOfTurkeys >= 1; numOfTurkeys --)
        {
            System.out.println("This is turkey n°: " + (numOfTurkeys));

        }
        System.out.println("--------- AFTER THE LOOP ---------");
        System.out.println("The number of turkeys is: " + numOfTurkeys);
    }



}
