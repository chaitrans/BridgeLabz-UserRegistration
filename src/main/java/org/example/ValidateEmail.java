package org.example;

import java.util.regex.Pattern;

/**
 * Regular expression for Email validation.
 *  @author Chaitra NS
 *  @date 03-08-2021
 */
public class ValidateEmail {
    public boolean validateEmail(String email) {
        return Pattern.matches("^[\\w+_-]+(?:\\.[\\w+_-]+)*[@][\\w]{1,}([.]{1}[a-z]{2,}){1,2}$", email);
    }
}