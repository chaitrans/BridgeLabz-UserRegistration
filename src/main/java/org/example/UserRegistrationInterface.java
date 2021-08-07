package org.example;

/**
 * Functional interface for UserRegistration
 */

@FunctionalInterface
public interface UserRegistrationInterface {
    public abstract boolean userEntries(String value) throws InvalidUserInputException;
}
