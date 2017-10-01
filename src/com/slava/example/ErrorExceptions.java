package com.slava.example;

public class ErrorExceptions extends Error{

    public ErrorExceptions(){

    }

    public ErrorExceptions(String message){
        super(message);
    }

    public ErrorExceptions(String message, Throwable cause) {
        super(message, cause);
    }

    public ErrorExceptions(Throwable cause) {
        super(cause);
    }

    protected ErrorExceptions(String message, Throwable cause,
                              boolean enableSuppression,
                              boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
