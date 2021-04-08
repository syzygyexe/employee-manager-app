package com.alexanderborisov.employeemanager.exception;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String message) {
        // Call constructor from RuntimeException.
        super(message);
    }
}
