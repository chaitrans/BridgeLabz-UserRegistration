package org.example;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * User need to follow pre-defined Password Rules.
 * Rule-2 : Should have atLeast 1 Upper Case.
 */

public class UC6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter password : ");
        String password = scanner.next();
        System.out.println(Pattern.matches("^(?=.*[A-Z]).{8,}$", password));
    }
}
