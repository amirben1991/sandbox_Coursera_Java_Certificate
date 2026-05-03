package org.example.ModuleTwo;

public class manipulatingStrings {

    public static void main(String[] args) {
        String welcomeToJavaString = "Welcome Java";

        // To uppercase
        String welcomeToJavaStringInUppercase = welcomeToJavaString.toUpperCase();
        System.out.println("The String " + welcomeToJavaString + "In uppercase: " + welcomeToJavaStringInUppercase);

        // A more direct way
        String directWayToUpperString = "Welcome Java".toUpperCase();
        System.out.println("A more direct way: " + directWayToUpperString);

        // Identifying a String
        String testString = "This is a test";

        boolean result1 = testString.startsWith("Test");
        boolean result2 = testString.startsWith("this");

        System.out.println("testString.startsWith(\"test\"):" + testString.startsWith("Test"));
        System.out.println("testString.startsWith(\"this\"):" + testString.startsWith("This"));

        // ends with

        boolean result3 = testString.endsWith("test");
        boolean result4 = testString.endsWith("a");

        System.out.println("testString.endsWith(\"test\"): " + testString.endsWith("test"));
        System.out.println("testString.endsWith(\"a\"): " + testString.endsWith("a"));


        // Checking for empty strings

        String testString1 = "This is a test";
        String testString2 = "";

        boolean emptyString1 = testString1.isEmpty();
        boolean emptyString2 = testString2.isEmpty();

        System.out.println("testString1.isEmpty(): " + testString1.isEmpty());
        System.out.println("testString2.isEmpty(): " + testString2.isEmpty());

        // Manipulate a String with index numbers
        String testStringIndex = "this is a test which is nice";
        int indexOfSearch1 = testStringIndex.indexOf("Java");
        int indexOfSearch2 = testStringIndex.indexOf("is");
        int indexOfSearch3 = testStringIndex.indexOf("est");

        System.out.println("TestString.indexOf(\"Java\")"+ testStringIndex.indexOf("Java"));
        System.out.println("testString.indexOf(\"is\") : " + testString.indexOf("is"));
        System.out.println("testString.indexOf(\"est\") : " + testString.indexOf("est"));

        String resultOne = testString.substring(3);
        String resultTwo = testString.substring(12);

        System.out.println("Test.substring(3) "+ testString.substring(3));
        System.out.println("Test.substring(12) "+ testString.substring(12));

        // trim() method --> can be utilized to eliminate leading and trailing spaces

        String resultOneWithoutSpace = testString.trim();

        System.out.println("TestString : #" + testString + "#");
        System.out.println("testString.trim() : #" + testString.trim() + "#");

        // Comparing Strings --> equalsIgnoreCase()
        String testCompareString = "Java";
        boolean compare1 = testCompareString.equalsIgnoreCase("java");
        boolean compare2 = testCompareString.equalsIgnoreCase("JAVA");

        System.out.println("testString.equalsIgnoreCase(\"java\")" + testCompareString.equalsIgnoreCase("java"));
        System.out.println("testString.equalsIgnoreCase(\"JAVA\")" + testCompareString.equalsIgnoreCase("JAVA"));

        // Comparing String ==> distinguishing between upper and lower case
        int resultX = testString.compareTo("java");
        int resultY = testString.compareTo("JAVA");

        int resultZ = testString.compareToIgnoreCase("java");
        int resultS = testString.compareToIgnoreCase("JAVA");

        System.out.println("------- Comparing with respect to case ----------");
        System.out.println("testString.compareTo (\"java\") : " + testString.compareTo ("java"));
        System.out.println("testString.compareTo(\"JAVA\") : " +  testString.compareTo("JAVA"));

        System.out.println("------- Comparing irrespective of case ----------");
        System.out.println("testString.compareToIgnoreCase(\"java\") : " + testString.compareToIgnoreCase("java"));
        System.out.println("testString.compareToIgnoreCase(\"JAVA\") : " +  testString.compareToIgnoreCase("JAVA"));




    }

}
