package org.example;

public class InvalidUserInputException extends Exception {
    enum ExceptionType{
        INVALID_FIRST_NAME, INVALID_LAST_NAME, INVALID_PASSWORD, INVALID_PHONE_NUMBER, INVALID_EMAIL;
    }

    ExceptionType type;

    public InvalidUserInputException(ExceptionType type, String msg) {
        super(msg);
        this.type = type;
    }
}