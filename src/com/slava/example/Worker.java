package com.slava.example;


import java.util.Random;

public class Worker implements AutoCloseable {

    private Random random = new Random();

    @Override
    public void close() throws Exception {
        if (random.nextBoolean()){
            throw new CheckedExceptions("это проверяемое исключение");
        }
    }

    void work(){
        if (random.nextBoolean()){
            throw new UncheckedExceptions("это не проверяемое исключение");
        }
    }
}