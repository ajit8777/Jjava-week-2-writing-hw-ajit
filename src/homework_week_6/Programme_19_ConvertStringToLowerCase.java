package homework_week_6;

import java.util.Scanner;

/**
 * Write a Java program to convert a given string into lowercase.
 * Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
 * Output: the quick brown fox jumps over the lazy dog.
 */
public class Programme_19_ConvertStringToLowerCase {
    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the uppercase sentence: ");
        String uppercase = scanner.nextLine();
        Programme_19_ConvertStringToLowerCase t = new Programme_19_ConvertStringToLowerCase();
        t.convertStringToLowerCase(uppercase);
        //closing the scanner object
        scanner.close();
    }

    // Converting string to lower case
    public void convertStringToLowerCase(String str) {
        System.out.println("The LowerCase of the string is = " + str.toLowerCase());
    }
}
