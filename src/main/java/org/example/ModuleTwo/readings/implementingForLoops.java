package org.example.ModuleTwo.readings;

public class implementingForLoops {
    public static void main(String[] args) {
        // First example code
        int scoopsSold;
        System.out.println("Selling chocolate ice cream: 20 scoosp");
        for (scoopsSold = 0; scoopsSold<20; scoopsSold++) {
            System.out.println("Sold scoop No: " + (scoopsSold + 1));
        }
        System.out.println("All scoops sold: " + scoopsSold);
    }
}
