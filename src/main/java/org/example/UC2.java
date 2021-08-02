package org.example;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * User Need to Enter Valid Last Name
 */

public class UC2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter last Name : ");
        String lastName = scanner.next();
        System.out.println(Pattern.matches("[A-Z][a-z]{2,}", lastName));
    }
}
