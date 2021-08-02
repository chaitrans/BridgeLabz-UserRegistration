package org.example;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * User need to follow pre-defined Password Rules.
 * Rule-4 : Has exactly 1 Special Character.
 */

public class UC8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter password : ");
        String password = scanner.next();
        System.out.println(Pattern.matches("^(?=.*[A-Z])(?=.*[a-z])(?=[^@#!$%^&+=]*[@#!$%^&+=][^@#!$%^&+=]*$)(?=.*[0-9]).{8,}$", password));
    }
}