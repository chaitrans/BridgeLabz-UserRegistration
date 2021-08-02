package org.example;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * User need to follow pre-defined Password Rules.
 * Rule-3 : Should have at least 1 numeric number in the password.
 */

public class UC7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter password : ");
        String password = scanner.next();
        System.out.println(Pattern.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9]).{8,}$", password));
    }
}
