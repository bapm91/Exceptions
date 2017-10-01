package com.slava.example;

public class CheckedExceptions extends Exception {

    public CheckedExceptions(){

    }

    public CheckedExceptions(String message) {
        super(message);
    }

    public CheckedExceptions(String message, Throwable cause) {
        super(message, cause);
    }

    CheckedExceptions(String message, Throwable cause,
                      boolean enableSuppression,
                      boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}