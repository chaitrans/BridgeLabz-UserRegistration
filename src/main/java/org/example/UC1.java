package org.example;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * User Need to Enter Valid First Name
 */
public class UC1 {
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first Name : ");
        String firstName = scanner.next();
        System.out.println(Pattern.matches("[A-Z][a-z]{2,}", firstName));
    }
}