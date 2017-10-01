package com.slava.example;

public class UncheckedExceptions extends RuntimeException {

    public UncheckedExceptions(){

    }

    public UncheckedExceptions(String message){
        super(message);
    }

    protected UncheckedExceptions(String message, Throwable cause,
                                  boolean enableSuppression,
                                  boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
