package org.example.ModuleTwo.readings;

public class implementingForLoops {
    public static void main(String[] args) {
        // First example code
        int scoopsSold;
        System.out.println("Selling chocolate ice cream: 20 scoops");
        for (scoopsSold = 0; scoopsSold<20; scoopsSold++) {
            System.out.println("Sold scoop No: " + (scoopsSold + 1));
        }
        System.out.println("All scoops sold: " + scoopsSold);

        // Strings with conditional statements and loops
        // Counting vowels and consonants
        // Identifying a vowel
        char ch = 'a'; // example character
        // the condition checkis if ch is equal to any of the vowels (lowercase and uppercase) using the logical OR operator ( || )
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
         ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println("The character " + ch + " is a vowel.");
        }


        // recap

        String stringToTravel = "TONI says ice cream PER scoop";

        // The variable to count the number of vowels
        int countVowels = 0;
        for (int indexPosition = 0; indexPosition<stringToTravel.length(); indexPosition++) {
            // this method charAt() returns the character at the index number given
            char charac = stringToTravel.charAt(indexPosition);
            if (charac == 'a' || charac == 'e' || charac == 'i' || charac == 'o' || charac == 'u'
            || charac == 'A'|| charac == 'E' || charac == 'I'|| charac == 'O' || charac == 'U'
            ) {
                countVowels++;
            }

        }
        System.out.println("The number of vowels in the string is: " + countVowels);

        // Specify the toLowerCase() method to convert the String into lowercase
        String stringToTravelLowerCase = stringToTravel.toLowerCase();
        // add an if statement with a condition to identify all the lowercase vowels;
        if (stringToTravel.toLowerCase().contains("a") || stringToTravel.toLowerCase().contains("e") || stringToTravel.toLowerCase().contains("i") || stringToTravel.toLowerCase().contains("o") || stringToTravel.toLowerCase().contains("u")) {
            System.out.println("The string contains at least one vowel.");
        } else {
            System.out.println("The string does not contain any vowels.");
        }
        //count the number of vowels
        System.out.println("The number of vowels in the string is: " + countVowels);

        // add a not operator before the if statement's condition
        if (! (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')) {
            System.out.println("the total number of consonants in the String is: " + countVowels);
        } System.out.println("the total number of consonants in the String is: " + countVowels);
    }
}
